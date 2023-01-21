import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;

public class RadioTest {
    @Test
    public void shouldSetStation6() {
        Radio rad = new Radio();

        rad.setCurrentStation(6);
        int expected = 6;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(-6);
        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
}