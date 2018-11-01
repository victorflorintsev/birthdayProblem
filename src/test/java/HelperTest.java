import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

public class HelperTest {

    @Test
    public void test1() {
        assertThat(Helper.func("a b c a b c d e f", "o b c d z e j f o"))
                .containsExactly("o", "z", "j", "o");
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
