package chap10.jyp;

import chap07.jyp.UserRegister;
import chap07.jyp.WeakPasswordChecker;
import chap07.jyp.WeakPasswordException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class MakeWell_3 {

    @Mock
    private WeakPasswordChecker weakPasswordChecker;

    private UserRegister userRegister;

    /**
     * 3. 정확하게 일치하는 값으로 모의 객체 설정하지 않기
     * @see /chap07/jyp/MockUserRegisterTest.java
     */

    @Test
    @Tag("Bad")
    @DisplayName("약한 암호면 가입 실패 (Bad)")
    void weakPassword_bad() {

        BDDMockito.given(checkPasswordWeak("pw")).willReturn(true);

        assertThrows(WeakPasswordException.class, () -> {
            userRegister.register("id", "pwa", "email");
        });

    }


    @Test
    @Tag("Good")
    @DisplayName("약한 암호면 가입 실패 (Good)")
    void weakPassword_good() {

        BDDMockito.given(checkPasswordWeak(Mockito.anyString())).willReturn(true);

        assertThrows(WeakPasswordException.class, () -> {
            userRegister.register("id", "pw", "email");
        });

    }


    @DisplayName("임의로 만든 예제 메서드")
    boolean checkPasswordWeak(String password) {

        if ("pw".equals(password)) {
            return true;
        }

        return false;
    }

}
