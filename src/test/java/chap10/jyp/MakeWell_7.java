package chap10.jyp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class MakeWell_7 {

    /**
     * 7.실헹 시점이 다르다고 실패하지 않기
     */

    @Test
    @Tag("Bad")
    @DisplayName("실행 시점에 따라 결과가 달라지는 테스트 (Bad)")
    void notExpired_Bad(){
        //테스트 코드를 작성한 시점이 2019년 1월 1일
        LocalDateTime expiry = LocalDateTime.of(2019,12,31,0,0,0);
        Member m = Member.builder().expiryDate(expiry).build();
        assertFalse(m.isExpired());
    }

    @Test
    @Tag("Good")
    @DisplayName("시간 값을 제어하기 위해 BizClock 클래스를 상속해서 구현한 클래스 (Good)")
    void notExpired_Good(){
        //테스트 코드를 작성한 시점이 2019년 1월 1일
        LocalDateTime expiry = LocalDateTime.of(2019,12,31,0,0,0);
        Member m = Member.builder().expiryDate(expiry).build();
        assertFalse(m.passedExpiryDate(LocalDateTime.of(2019,12,30,0,0,0)));
    }

}
