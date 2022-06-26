package ru.netology.device;

public class Radio {

    private int volume;
    private int numberStation;
    private int stationCount = 10;
    private final int volumeMax = 100;

    public Radio(){

    }

    public Radio(int stationCount){

        this.stationCount = stationCount;
    }

    public int getVolume(){

        return volume;
    }

    public int getNumberStation(){

        return numberStation;
    }

    public void setVolume(int volume){

        if (volume > - 1 && volume < volumeMax + 1){

            this.volume = volume;
        }
    }

    public void setNumberStation(int number){

        if (number > -1 && number < stationCount){

            numberStation = number;
        }
    }

    public void nextStation(){

        numberStation = numberStation == stationCount - 1 ? 0 : ++numberStation;
    }

    public void prevStation(){

        numberStation = numberStation == 0 ? stationCount - 1 : --numberStation;
    }

    public void increaseVolume(){

        if (this.volume != volumeMax){

            ++this.volume;
        }
    }

    public void decreaseVolume(){

        if (this.volume != 0){

            --this.volume;
        }
    }
}
