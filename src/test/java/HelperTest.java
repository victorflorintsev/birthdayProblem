import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

public class HelperTest {
    @Test
    public void testStupid() {
        assertThat(Helper.func("a ab def trash z ju b c d", "j z c b"))
                .containsExactly("j", "c");
    }

    @Test
    public void hackerrankTest() {
        assertThat(Helper.func("h a a c c k k e r r a n n k k", "h a c k e r r a n k"))
                .isEmpty();
    }

    @Test
    public void hackerrankTest2() {
        assertThat(Helper.func("h c c a a k k e r r a n n k k", "h a c k e r r a n k"))
                .contains("a");
    }

    @Test
    public void test1() {
        assertThat(Helper.func("a b c a b c d e f", "o o b c d z e j f o"))
                .containsExactly("o", "o", "z", "j", "o");
    }

    @Test
    public void test2() {
        assertThat(Helper.func("am hackerrank to improve", "I am using hackerrank to improve programming"))
                .containsExactly("I", "using", "programming");
    }

    @Test
    public void test3() {
        assertThat(Helper.func("improve am to", "I am using hackerrank to improve programming"))
                .containsExactly("I", "am", "using", "hackerrank", "to", "programming");
    }
}
