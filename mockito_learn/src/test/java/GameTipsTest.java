import com.guess.test.NumGame;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class GameTipsTest {

    @Test
    public void should_win_game_when_input_right_number() {
        assertThat(NumGame.getGameResult(2345, 2345), is("4A0B"));
    }

    @Test
    public void should_get_fixed_tips_when_input_not_right() {
        assertThat(NumGame.getGameResult(1245, 1254), is("2A2B"));
    }


    @Test
    public void could_input_num_whose_all_digits_equal() {
        assertThat(NumGame.getGameResult(5555, 5432), is("1A3B"));
    }

}
