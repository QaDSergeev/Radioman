package ru.netology.device;

public class Radio {

    private int volume;
    private int numberStation;
    private final int maxStation;
    private final int volumeMax = 100;

    public Radio(){
        maxStation = 9;
    }

    public Radio(int stationCount){
        maxStation = stationCount -1;
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

        if (number > -1 && number < maxStation + 1){

            numberStation = number;
        }
    }

    public void nextStation(){

        numberStation = numberStation < maxStation ? ++numberStation : 0;
    }

    public void prevStation(){

        numberStation = numberStation > 0 ? --numberStation : 9;
    }

    public void increaseVolume(){

        if (this.volume < volumeMax){

            ++this.volume;
        }
    }

    public void decreaseVolume(){

        if (this.volume > 0){

            --this.volume;
        }
    }
}
