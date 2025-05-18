public class Radio {
    private int soundVolume; // громкость звука
    private int maxRadioStation = 9; // максимальная радиостанция
    private int minRadioStation = 0; // минимальная радиостанция
    private int currentRadioStation; // текущая радиостанция

    public Radio(int NewStation) {
        this.currentRadioStation = NewStation;
        maxRadioStation = NewStation - 1;
    }

    public Radio() {

    }


    public int getCurrentRadioStation() { // гетер радиостанция
        return currentRadioStation;
    }

    public int getMaxRadioStation() { // гетер максимальной радиостанции
        return maxRadioStation;
    }

    public int getMinRadioStation() { // гетер минимальной радиостанции
        return minRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) { // сетер радиостанция

        if (newCurrentRadioStation > maxRadioStation) {
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
        currentRadioStation = maxRadioStation;
    }

    public void setToFirstRadioStation() { // первая радиостанция
        currentRadioStation = minRadioStation;
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
        if (currentRadioStation >= maxRadioStation) {
            currentRadioStation = minRadioStation;
        } else {
            currentRadioStation = currentRadioStation + 1;
        }
    }

    public void prevRadioStation() { // предыдущая радиостанция
        if (currentRadioStation <= minRadioStation) {
            currentRadioStation = maxRadioStation;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
    }

}

