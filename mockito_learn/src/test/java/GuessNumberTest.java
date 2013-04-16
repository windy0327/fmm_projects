import com.guess.test.NumGame;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static com.guess.test.NumGame.playGame;
import static com.guess.test.NumGame.playGame;
import static com.guess.test.NumGame.randomNum;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GuessNumberTest {

    @Test
    public void should_be_num_when_input() throws IOException {
        BufferedReader reader = Mockito.mock(BufferedReader.class);
        when(reader.readLine()).thenReturn("3");

        assertThat(NumGame.inputNum(reader), is(3));
    }

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

    @Test
    public void should_be_4A0B_when_input_equal_numbers() {
        assertThat(NumGame.getGameResult(2345, 2345), is("4A0B"));
    }

    @Test
    public void should_be_1A0B_when_input_having_one_equal_digit_numbers() {
        assertThat(NumGame.getGameResult(2456, 2980), is("1A0B"));
    }

    @Test
    public void output_0A4B() {
        assertThat(NumGame.getGameResult(1234, 4321), is("0A4B"));
    }

    @Test
    public void output_2A2B() {
        assertThat(NumGame.getGameResult(1245, 1254), is("2A2B"));
    }

    @Test
    public void output_0A0B() {
        assertThat(NumGame.getGameResult(2345, 6789), is("0A0B"));
    }

    @Test
    public void output_1A3B() {
        assertThat(NumGame.getGameResult(5555, 5432), is("1A3B"));
    }

    @Test
    public void should_print_right_when_input_equal_numbers() throws IOException {
        BufferedReader reader = Mockito.mock(BufferedReader.class);
        PrintStream mockOut = Mockito.mock(PrintStream.class);

        when(reader.readLine()).thenReturn("6789");
        playGame(6789, reader, mockOut);

        verify(mockOut, times(1)).println("请输入一个四位数：");
        verify(mockOut, times(1)).println("4A0B");
        verify(mockOut, times(1)).println("Congratulations!");
        verify(mockOut, times(1)).println("Game over!");
    }

    @Test
    public void should_print_1A0B_6_times() throws IOException {
        BufferedReader reader = Mockito.mock(BufferedReader.class);
        PrintStream mockOut = Mockito.mock(PrintStream.class);

        when(reader.readLine()).thenReturn("6789");
        playGame(6123, reader, mockOut);

        verify(mockOut, times(6)).println("1A0B");
    }

    @Test
    public void should_print_Game_over() throws IOException {
        BufferedReader reader = Mockito.mock(BufferedReader.class);
        PrintStream mockOut = Mockito.mock(PrintStream.class);

        when(reader.readLine()).thenReturn("1234");
        playGame(1567, reader, mockOut);

        verify(mockOut, times(1)).println("Game over!");
    }

}

