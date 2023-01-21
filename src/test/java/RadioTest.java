import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;

public class RadioTest {
    @Test
    public void shouldSetMaxStation() {
        Radio rad = new Radio(30);

        rad.setCurrentStation(29);

        int expected = 29;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnNextStationCloseToUpBorder() {
        Radio rad = new Radio(30);
        rad.setCurrentStation(28);

        rad.next();

        int expected = 29;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnNextStationUpBorder() {
        Radio rad = new Radio(30);
        rad.setCurrentStation(29);

        rad.next();

        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnPrevStationBelowBorder() {
        Radio rad = new Radio(30);
        rad.setCurrentStation(0);

        rad.prev();

        int expected = 29;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnPrevStationToLowBorder() {
        Radio rad = new Radio();
        rad.setCurrentStation(1);

        rad.prev();

        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationFromMiddle() {
        Radio rad = new Radio(30);

        rad.setCurrentStation(15);
        int expected = 15;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNegative() {
        Radio rad = new Radio();

        rad.setCurrentStation(-6);
        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationBelowMin() {
        Radio rad = new Radio();

        rad.setCurrentStation(15);
        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetDefaultStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(9);
        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetDefaultStationFromMiddle() {
        Radio rad = new Radio();

        rad.setCurrentStation(6);
        int expected = 6;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldTurnNextDefaultStationUpBorder() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);

        rad.next();

        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
        }

    @Test
    public void shouldTurnNextDefaultStationCloseToUpBorder() {
        Radio rad = new Radio();
        rad.setCurrentStation(8);

        rad.next();

        int expected = 9;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldTurnPrevDefaultStationBelowBorder() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);

        rad.prev();

        int expected = 9;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseVolumeAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);

        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeCloseToBorder() {
        Radio rad = new Radio();
        rad.setCurrentVolume(99);

        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeCloseToBorder() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);

        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeBelowMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetVolumeFromMiddle() {
        Radio rad = new Radio();

        rad.setCurrentVolume(50);
        int expected = 50;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeNegative() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-5);
        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(101);
        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}