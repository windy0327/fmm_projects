import com.guess.test.NumGame;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RandomNumTest {

    @Test
    public void should_be_four_digits_num() {
        NumGame.getRandomNum();

        assertThat(NumGame.randomNum.toString().length(), is(4));
    }

    @Test
    public void should_have_four_different_digits() {
        int i = 0;

        NumGame.makeDigitsDifferent();

        assertThat(NumGame.randomNum.toString().charAt(i) != NumGame.randomNum.toString().charAt(i + 1), is(true));
        assertThat(NumGame.randomNum.toString().charAt(i + 1) != NumGame.randomNum.toString().charAt(i + 2), is(true));
        assertThat(NumGame.randomNum.toString().charAt(i + 2) != NumGame.randomNum.toString().charAt(i + 3), is(true));
    }

}
