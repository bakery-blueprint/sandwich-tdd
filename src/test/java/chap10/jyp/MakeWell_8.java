package chap10.jyp;

import chap07.jyp.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class MakeWell_8 {

    /**
     * 8.필요하지 않은 값은 설정하지 않기
     */

    @Test
    @Tag("Bad")
    @DisplayName("실행 시점에 따라 결과가 달라지는 테스트 (Bad)")
    void dupIdExists_Then_Exception(){

        /*
        //동일 ID가 존재하는 상황
        memoryRepository.save(User.builder().id("dupid").name("이름")
                .email("abc@abc.com")
                .password("abcd")
                .regDate(LocalDateTime.now())
                .build());

        RegisterReq req = RegisterReq.builder()
                .id("dupid").name("다른이름")
                .email("dupid@abc.com")
                .password("abcde")
                .build()

        assertThrows(DupIdException.class, () -> userRegisterSvc.register(req));
         */

    }

}
