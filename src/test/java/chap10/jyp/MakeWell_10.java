package chap10.jyp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MakeWell_10 {

    /**
     * 10. 통합 테스트는 필요하지 않은 범위까지 연동하지 않기
     */

    /*
        @Component
        public class MemberDao {
            private JdbcTemplate jdbcTemplate;

            public MemberDao(JdbcTemplate jdbcTemplate){
                this.jdbcTemplate= jdbcTemplate;
            }

            public List<Member> selectAll(){
                //...생략
            }
        }

        @SpringBootTest
        public class MemberDaoIntTest{
            @Autowired MemberDao dao;

            @Test
            void findAll(){
                List<Member> members=dao.selectAll();
                assertTrue(members.size() > 0);
            }
        }


        @JdbcTest
        @AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
        public class MemberDaoJdbcTest{

            @Autowired JdbcTemplate jdbcTemplate;

            private MemberDao dao;

            @BeforeEach
            void setUp(){
                dao = new MemberDao(jdbcTemplate);
            }

            @Test
            void findAll(){
            ...생략
            }
        }
    */
}
