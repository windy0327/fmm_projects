import org.junit.Test;
import org.mockito.Mockito;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static com.guess.test.NumGame.playGame;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GameProcessTest {
    @Test
    public void should_print_right_when_input_equal_numbers() throws IOException {
        BufferedReader reader = Mockito.mock(BufferedReader.class);
        PrintStream mockOut = Mockito.mock(PrintStream.class);

        when(reader.readLine()).thenReturn("6789");
        playGame(6789, reader, mockOut);

        verify(mockOut,times(1)).println("请输入一个四位数：");
        verify(mockOut, times(1)).println("4A0B");
        verify(mockOut, times(1)).println("Congratulations!");
    }

    @Test
    public void should_print_right_when_input_num_not_equal_random_num() throws IOException {
        BufferedReader reader = Mockito.mock(BufferedReader.class);
        PrintStream mockOut = Mockito.mock(PrintStream.class);

        when(reader.readLine()).thenReturn("6789","6897","6879","6954","6890","6759");
        playGame(6123, reader, mockOut);

        verify(mockOut,times(6)).println("请输入一个四位数：");
        verify(mockOut, times(6)).println("1A0B");

    }
}
