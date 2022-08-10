package chap10.jyp;

import chap07.jyp.UserRegister;
import chap07.jyp.WeakPasswordChecker;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MakeWell_4 {

    @Mock
    private WeakPasswordChecker weakPasswordChecker;

    @Mock
    private MockRepository mockRepository;

    private UserRegister userRegister;

    /**
     * 4. 과도하게 구현 검증하지 않기
     */

    @Test
    @Tag("Bad")
    @DisplayName("불필요한 구현 검증 (Bad)")
    void checkPassword_bad() {

        userRegister.register("id", "pw", "email");

        // WeakPasswordChecker#weakPasswordCheck() 메서드 호출 여부 검사
        BDDMockito.then(weakPasswordChecker)
                .should()
                .weakPasswordCheck(Mockito.anyString());

        // UserRepository#findById() 메서드를 호출하지 않는 것을 검사
        BDDMockito.then(mockRepository)
                .should(Mockito.never())
                .findById(Mockito.anyString());

    }

}
