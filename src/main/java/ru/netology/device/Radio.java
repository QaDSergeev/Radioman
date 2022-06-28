package ru.netology.device;

public class Radio {

    private int volume;
    private int numberStation;

    public int getVolume(){

        return volume;
    }

    public int getNumberStation(){

        return numberStation;
    }

    public void setVolume(int volume){

        if (volume > -1 && volume < 11){

            this.volume = volume;
        }
    }

    public void setNumberStation(int number){

        if (number > -1 && number < 10 ){

            numberStation = number;
        }
    }

    public void nextStation(){

        if (numberStation < 9){

            ++numberStation;

        } else {

            numberStation = 0;
        }
    }

    public void prevStation(){

        if (numberStation > 0){

            --numberStation;

        } else {

            numberStation = 9;
        }
    }

    public void increaseVolume(){

        if (this.volume < 10){

            ++this.volume;
        }
    }

    public void decreaseVolume(){

        if (this.volume > 0){

            --this.volume;
        }
    }
}
