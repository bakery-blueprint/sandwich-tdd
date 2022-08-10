package chap10.jyp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class MakeWell_6 {

    /**
     * 6. 실행 환경이 다르다고 실패하지 않기
     */
    @Tag("Bad")
    @DisplayName("절대 경로를 사용한 테스트 (Bad)")
    public class BulkLoaderTest_Bad {
        private String bulkFilePath = "d:\\mywork\\temp\\bulk.txt";

        @Test
        void load(){
            //BulkLoader loader = new BulkLoader();
            //loader.load(bulkFilePath);

            //...생략
        }
    }

    @Tag("Good")
    @DisplayName("프로젝트를 기준으로 상대 경로를 사용한 테스트 (Good)")
    public class BulkLoaderTest_Good {
        private String bulkFilePath = "src/test/resources/bulk.txt";

        @Test
        void load(){
            //BulkLoader loader = new BulkLoader();
            //loader.load(bulkFilePath);

            //...생략
        }
    }


}
