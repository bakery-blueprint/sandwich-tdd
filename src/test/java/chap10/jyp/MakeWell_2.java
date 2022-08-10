package chap10.jyp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MakeWell_2 {

    /**
     * 2. 두 개 이상을 검증하지 않기
     */

    @Test
    @Tag("Bad")
    @DisplayName("두 가지를 검증하는 코드 (Bad)")
    void registerAndSendMail_bad() {

        Map<String, Object> savedUser = new HashMap<>();
        savedUser.put("id", "jeeyong.park@ssg.com");
        savedUser.put("pw", "1q2w3e!!");

        // Bad

        // 검증1 : 회원 데이터가 올바르게 저장되었는지 검증
        assertEquals("jeeyong.park@ssg.com", savedUser.get("id"));
        assertEquals("1q2w3e!!", savedUser.get("pw"));

        // 검증2 : 이메일 발송을 요청했는지 검증
        assertEquals("jeeyong.park@ssg.com", sendEmail(savedUser.get("id").toString()));
    }

    @Test
    @Tag("Good")
    @DisplayName("각 검증 대상을 별도 테스트로 분리 - 같은 ID가 없으면 가입 성공함 (Good)")
    void noDupId_good() {

        Map<String, Object> savedUser = new HashMap<>();
        savedUser.put("id", "jeeyong.park@ssg.com");
        savedUser.put("pw", "1q2w3e!!");

        // Good
        assertEquals("jeeyong.park@ssg.com", savedUser.get("id"));
        assertEquals("1q2w3e!!", savedUser.get("pw"));

    }

    @Test
    @Tag("Good")
    @DisplayName("각 검증 대상을 별도 테스트로 분리 - 가입하면 메일을 전송함 (Good)")
    void whenRegisterThenSendMail() {

        Map<String, Object> savedUser = new HashMap<>();
        savedUser.put("id", "jeeyong.park@ssg.com");
        savedUser.put("pw", "1q2w3e!!");

        // Good
        assertEquals("jeeyong.park@ssg.com", sendEmail(savedUser.get("id").toString()));
    }

    @DisplayName("임의로 만든 예제 메서드")
    private String sendEmail(String id) {
        return id;
    }

}
