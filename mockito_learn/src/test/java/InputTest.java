import com.guess.test.NumGame;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.BufferedReader;
import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.when;

public class InputTest {
    @Test
    public void should_can_input_num_from_keyboard() throws IOException {
        BufferedReader reader = Mockito.mock(BufferedReader.class);
        when(reader.readLine()).thenReturn("3");

        assertThat(NumGame.inputNum(reader), is(3));
    }
}
