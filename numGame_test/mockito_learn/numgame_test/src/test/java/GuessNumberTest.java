import com.guess.test.MyMath;
import com.guess.test.NumGame;
import org.hamcrest.core.Is;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@RunWith(MockitoJUnitRunner.class)
public class GuessNumberTest {

    @Test

    public void should_remove_subscriber_when_close()  {
        int a = 2;
        int b = 3;

        assertThat(MyMath.add(a, b), is(5));
    }

    @Test
    public  void should_be_four_digits_num(){
        Integer m=2356;
        assertThat(NumGame.create_four_digits_random_num().toString().length(),is(4));

    }

    @Test
    public void should_be_0A4B_when_input_equal_numbers(){
        assertThat(NumGame.get_result_of_comparing_two_numbers(2345,2345),is("4A0B"));
    }




}
