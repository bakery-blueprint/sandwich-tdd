package chap10.jyp;

import chap07.jyp.UserRegister;
import chap07.jyp.WeakPasswordChecker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class MakeWell_5 {

    /**
     * 5. 셋업을 이용해서 중복된 상황을 설정하지 않기
     */

    /*
        @BeforeEach
        void setUp(){
            changeService = new ChangeUserService(memoryRepository);
            memoryRepository.save(new User("id","pw",new Address("서울","북부")));
        }

        @Test
        void noUser(){
            assertThrows(
                    UserNotFoundException.class , ()-> changeService.changeAddress("id2",new Address("서울","남부")));
        }

        @Test
        void changeAddress(){
            changeService.changeAddress("id",new Address("서울","남부"));

            User user=memoryRepository.findById("id");
            assertEquals("서울",user.getAddress().getCity());
        }

        @Test
        void changePw(){
            changeService.changePw("id","pw","newpw");

            User user=memoryRepository.findById("id");
            assertTrue(user.matchPassword("newpw"));
        }

        @Test
        void pwNotMatch(){
            assertThrows(IdPwNotMatchException.class, () -> changeService.changePw("id","pw2","newpw"));
        }
    */

    /*

        @BeforeEach
        void setUp(){
            changeService = new ChangeUserService(memoryRepository);
        }

        @Test
        void noUser(){
            assertThrows(UserNotFoundException.class , ()-> changeService.changeAddress("id",new Address("서울","남부")));
        }

        @Test
        void changeAddress(){
            memoryRepository.save(new User("id","pw",new Address("서울","북부"))); //상황 설정

            changeService.changeAddress("id",new Address("서울","남부"));

            User user=memoryRepository.findById("id");
            assertEquals("서울",user.getAddress().getCity());
        }

        @Test
        void changePw(){
            memoryRepository.save(new User("id","pw",new Address("서울","북부"))); //상황 설정

            changeService.changePw("id","pw","newpw");

            User user=memoryRepository.findById("id");
            assertTrue(user.matchPassword("newpw"));
        }

        @Test
        void pwNotMatch(){
            memoryRepository.save(new User("id","pw",new Address("서울","북부"))); //상황 설정

            assertThrows(
            IdPwNotMatchException.class, () -> changeService.changePw("id","pw2","newpw"));w
        }

     */
}
