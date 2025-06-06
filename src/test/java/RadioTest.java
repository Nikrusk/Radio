import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStation() { // проверка на текущую станцию
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolume() { // проверка на текущую громкость
        Radio radio = new Radio();

        radio.setSoundVolume(50);

        int expected = 50;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToLastRadioStation() { // проверка на последнюю станцию
        Radio radio = new Radio();

        radio.setToLastRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToFirstRadioStation() { // проверка на первую станцию
        Radio radio = new Radio();

        radio.setToFirstRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxSoundVolume() { // проверка на максимальную громкость
        Radio radio = new Radio();

        radio.setToMaxSoundVolume();

        int expected = 100;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinSoundVolume() { // проверка на минимальную громкость
        Radio radio = new Radio();

        radio.setToMinSoundVolume();

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationAboveLast() { // не должен превышать количество станций
        Radio radio = new Radio();

        radio.setCurrentRadioStation(15);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSoundVolumeAboveMax() { // не должен превышать максимальную громкость
        Radio radio = new Radio();

        radio.setSoundVolume(150);

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseSoundVolume() { // увеличение громкости
        Radio radio = new Radio();

        radio.setSoundVolume(5);

        radio.increaseSoundVolume();

        int expected = 6;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseSoundVolumeIf100() { // увеличение громкости, если 100
        Radio radio = new Radio();

        radio.setSoundVolume(100);

        radio.increaseSoundVolume();

        int expected = 100;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseSoundVolume() { // уменьшение громкости
        Radio radio = new Radio();

        radio.setSoundVolume(5);

        radio.decreaseSoundVolume();

        int expected = 4;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseSoundVolumeIf0() { // уменьшение громкости, если 0
        Radio radio = new Radio();

        radio.setSoundVolume(0);

        radio.decreaseSoundVolume();

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStationIfLast() { // следующая радиостанция, если на данный момент последняя
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        radio.nextRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStation() { // следующая радиостанция
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);

        radio.nextRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStationIfFirst() { // предыдущая радиостанция, если на данный момент первая
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        radio.prevRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStation() { // предыдущая радиостанция
        Radio radio = new Radio();

        radio.setCurrentRadioStation(2);

        radio.prevRadioStation();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


}

