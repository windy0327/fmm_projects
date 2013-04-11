import com.guess.test.MyMath;
import com.guess.test.NumGame;
import org.hamcrest.core.Is;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import com.guess.test.PlayingGame;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@RunWith(MockitoJUnitRunner.class)
public class GuessNumberTest {

    @Test
    public void should_be_four_digits_num(){
        NumGame.getRandomNum();
        assertThat(randomNum.toString().length(),is(4));
    }

    @Test
    public void function_of_playGame_should_be_passed(){
        NumGame.playGame(2456);
    }

    @Test
    public void should_be_4A0B_when_input_equal_numbers(){
        assertThat(NumGame.getGameResult(2345,2345),is("4A0B"));
    }

    @Test
    public void should_be_1A0B_when_input_having_one_equal_digit_numbers(){
        assertThat(NumGame.getGameResult(2456,2980),is("1A0B"));
    }

    @Test
    public void output_0A4B(){
        assertThat(NumGame.getGameResult(1234,4321),is("0A4B"));
    }

    @Test
    public void output_2A2B(){
        assertThat(NumGame.getGameResult(1245,1254),is("2A2B"));
    }

    @Test
    public void output_0A0B(){
        assertThat(NumGame.getGameResult(2345,6789),is("0A0B"));
    }

    @Test
    public void output_1A3B(){
        assertThat(NumGame.getGameResult(5555,5432),is("1A3B"));
    }

    @Test
    public void output_4A12B(){
        assertThat(NumGame.getGameResult(6666,6666),is("4A12B"));
    }
}

