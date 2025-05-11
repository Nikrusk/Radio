public class Radio {
    private int currentRadioStation; // текущая радиостанция
    public int soundVolume; // громкость звука

    public int getCurrentRadioStation() { // гетер радиостанция
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) { // сетер радиостанция

        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public int getSoundVolume() { // гетер громкость
        return soundVolume;
    }

    public void setSoundVolume(int newSoundVolume) { // сетер громкость

        if (newSoundVolume > 100) {
            return;
        }
        soundVolume = newSoundVolume;
    }

    public void setToLastRadioStation() { // последняя радиостанция
        currentRadioStation = 9;
    }

    public void setToFirstRadioStation() { // первая радиостанция
        currentRadioStation = 0;
    }

    public void setToMaxSoundVolume() { // максимальная громкость
        soundVolume = 100;
    }

    public void setToMinSoundVolume() { // минимальная громкость
        soundVolume = 0;
    }

    public void increaseSoundVolume() { // увеличение громкости на 1
        if (soundVolume < 100) {
            soundVolume = soundVolume + 1;
        }
    }

    public void decreaseSoundVolume() { // уменьшение громкости на 1
        if (soundVolume > 0) {
            soundVolume = soundVolume - 1;
        }
    }

    public void nextRadioStation() { // следующая радиостанция
        if (currentRadioStation >= 9) {
            currentRadioStation = 0;
        } else {
            currentRadioStation = currentRadioStation + 1;
        }
    }

    public void prevRadioStation() { // предыдущая радиостанция
        if (currentRadioStation <= 0) {
            currentRadioStation = 9;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
    }

}

