package ru.netology.device;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTestSet {

    @Test
    public void shouldRadioStationSet(){

        Radio radio = new Radio();

        radio.setNumberStation(9);

        int expectedStation = 9;
        int actualStation = radio.getNumberStation();

        Assertions.assertEquals(expectedStation, actualStation);
    }


    @ParameterizedTest
    @CsvSource(value = {
            "10,0",
            "-1,0"
    })
    public void shouldNotRadioStationSet(int stationNumber, int expectedStation){

        Radio radio = new Radio();

        radio.setNumberStation(stationNumber);

        int actualStation = radio.getNumberStation();

        Assertions.assertEquals(expectedStation, actualStation);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "5,6",
            "9,0",
    })
    public void shouldNextRadioStationSet(int stationNumber, int expectedStation){

        Radio radio = new Radio();

        radio.setNumberStation(stationNumber);
        radio.nextStation();

        int actualStation = radio.getNumberStation();

        Assertions.assertEquals(expectedStation, actualStation);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "6,5",
            "0,9",
    })
    public void shouldPrevRadioStationSet(int stationNumber, int expectedStation){

        Radio radio = new Radio();

        radio.setNumberStation(stationNumber);
        radio.prevStation();

        int actualStation = radio.getNumberStation();

        Assertions.assertEquals(expectedStation, actualStation);
    }

    @Test
    public void shouldVolumeSet(){

        int expectedVolume = 9;

        Radio radio = new Radio();

        radio.setVolume(expectedVolume);

        Assertions.assertEquals(expectedVolume, radio.getVolume());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "11,0",
            "-1,0"
    })
    public void shouldNotVolumeSet(int volume, int expectedVolume){

        Radio radio = new Radio();

        radio.setVolume(volume);

        Assertions.assertEquals(expectedVolume, radio.getVolume());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "5,6",
            "10,10",
    })
    public void shouldIncreaseVolume(int volume, int expectedVolume){

        Radio radio = new Radio();

        radio.setVolume(volume);
        radio.increaseVolume();

        Assertions.assertEquals(expectedVolume, radio.getVolume());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "6,5",
            "0,0",
    })
    public void shouldDecreaseVolume(int volume, int expectedVolume){

        Radio radio = new Radio();

        radio.setVolume(volume);
        radio.decreaseVolume();

        Assertions.assertEquals(expectedVolume, radio.getVolume());
    }
}
