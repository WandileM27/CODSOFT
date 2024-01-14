package NumberGame;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class NumberGameTest {

    private final InputStream originalSystemIn = System.in;

    @BeforeEach
    public void setInput() {
        System.setIn(new ByteArrayInputStream("42\n".getBytes()));
    }

    @AfterEach
    public void restoreSystemIn() {
        // Restore System.in after the test
        System.setIn(originalSystemIn);
    }

    @Test
    public void testCorrectGuess() {
        NumberGame game = new NumberGame();
        game.playGame();
        assertEquals("Correct! You guessed the number in 1 attempts.", game.displayScore());
    }

    @Test
    public void testGuessTooLow() {
        NumberGame game = new NumberGame();
        game.playGame();
        assertEquals("Too low! Try again.", game.displayScore());
    }

    @Test
    public void testGuessTooHigh() {
        NumberGame game = new NumberGame();
        game.playGame();
        assertEquals("Too high! Try again.", game.displayScore());
    }
}
