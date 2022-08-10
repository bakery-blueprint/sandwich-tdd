package chap10.jyp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MakeWell_9 {

    /**
     * 9. 조건부로 검증하지 않기
     */

    @Test
    @Tag("Bad")
    @DisplayName("조건에 따라 단언을 하지 않는 테스트")
    void canTranslateBasicWord_bad(){
        Translator tr = new Translator();

        if(tr.contains("cat")){
            assertEquals("고양이", tr.translate("cat"));
        }
    }


    @Test
    @Tag("Good")
    @DisplayName("조건도 단언을 하도록 수정")
    void canTranslateBasicWorld_good(){
        Translator tr = new Translator();
        assertTranslationOfBasicWord(tr,"cat");
    }

    private void assertTranslationOfBasicWord(Translator tr, String word){
        assertTrue(tr.contains("cat"));
        assertEquals("고양이",tr.translate("cat"));
    }

}
