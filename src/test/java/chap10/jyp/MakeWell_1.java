package chap10.jyp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class MakeWell_1 {

    /**
     * 1. 변수나 필드를 사용해서 기댓값 표현하지 않기
     */

    @Test
    @Tag("Bad")
    @DisplayName("기대하는 값에 변수를 사용한 예 (Bad)")
    void dateFormat_bad() {

        LocalDate date = LocalDate.of(2022, 8, 10);
        String dateStr = formatDate(date);

        // Bad
        assertEquals(date.getYear() + "년 " +
                date.getMonthValue() + "월 " +
                date.getDayOfMonth() + "일", dateStr);

    }

    @Test
    @Tag("Good")
    @DisplayName("기대하는 값에 문자열 값을 사용한 예 (Good)")
    void dateFormat_good() {

        LocalDate date = LocalDate.of(2022, 8, 10);
        String dateStr = formatDate(date);

        // Good
        assertEquals("2022년 8월 10일", dateStr);

    }

    @DisplayName("임의로 만든 예제 메서드")
    private String formatDate(LocalDate date) {
        return date.getYear() + "년 " + date.getMonthValue() + "월 " + date.getDayOfMonth() + "일";
    }


    @Test
    @Tag("Bad")
    @DisplayName("단언과 객체 생성에 필드와 변수를 사용한 코드 (Bad)")
    void saveAnswerSuccessfully_bad() {

        List<Integer> answers = Arrays.asList(1, 2, 3, 4);

        // Bad
        assertAll(
                () -> assertEquals(answers.get(0), savedAnswer(answers, 0)),
                () -> assertEquals(answers.get(1), savedAnswer(answers, 1)),
                () -> assertEquals(answers.get(2), savedAnswer(answers, 2)),
                () -> assertEquals(answers.get(3), savedAnswer(answers, 3))
        );

        /*
            SurveyAnswerRequest surveyAnswer = SurveyAnswerRequest.builder()
                .surveyId(survey.getId())
                .respondentId(respondentId)
                .answers(answers)
                .build();

            --> 테스트 코드를 이해하기 위해서 편집창을 왔다갔다 해야 함.
        */

    }


    @Test
    @Tag("Good")
    @DisplayName("객체 생성과 단언에서 변수 대신 값을 사용 (Good)")
    void saveAnswerSuccessfully_good() {

        List<Integer> answers = Arrays.asList(1, 2, 3, 4);

        // Good
        assertAll(
                () -> assertEquals(1, savedAnswer(answers, 0)),
                () -> assertEquals(2, savedAnswer(answers, 1)),
                () -> assertEquals(3, savedAnswer(answers, 2)),
                () -> assertEquals(4, savedAnswer(answers, 3))
        );

        /*
            SurveyAnswerRequest surveyAnswer = SurveyAnswerRequest.builder()
                .surveyId(1L)
                .respondentId(100L)
                .answers(Arrays.asList(1, 2, 3, 4))
                .build();
        */

    }

    @DisplayName("임의로 만든 예제 메서드")
    private Integer savedAnswer(List<Integer> answers, int i) {
        return answers.get(i);
    }

}
