package ru.netology.device;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {

    @Test
    public void shouldRadioStationSetIfDefault(){

        Radio radio = new Radio();
        radio.setNumberStation(9);

        int expectedStation = 9;
        int actualStation = radio.getNumberStation();

        Assertions.assertEquals(expectedStation, actualStation);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "15,14",
            "5,4"
    })
    public void shouldRadioStationSetIfCountStationNotDefault(int countStations, int numberStation){

        Radio radio = new Radio(countStations);
        radio.setNumberStation(numberStation);

        Assertions.assertEquals(numberStation, radio.getNumberStation());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "10,0",
            "-1,0"
    })
    public void shouldNotRadioStationSet(int stationNumber, int expectedStation){

        Radio radio = new Radio();
        radio.setNumberStation(stationNumber);

        Assertions.assertEquals(expectedStation, radio.getNumberStation());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "16,16,0",
            "6,6,0"
    })
    public void shouldNotRadioStationSetIfCountStationNotDefault(int countStation, int stationNumber, int expectedStation){

        Radio radio = new Radio(countStation);
        radio.setNumberStation(stationNumber);

        Assertions.assertEquals(expectedStation, radio.getNumberStation());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "5,6",
            "8,9",
            "9,0",
    })
    public void shouldNextRadioStation(int stationNumber, int expectedStation){

        Radio radio = new Radio();

        radio.setNumberStation(stationNumber);
        radio.nextStation();

        int actualStation = radio.getNumberStation();

        Assertions.assertEquals(expectedStation, actualStation);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "15,13,14",
            "15,5,6",
            "6,3,4",
            "6,1,2",
    })
    public void shouldNextRadioStationIfCountStationNotDefault(int countStations, int stationNumber, int expectedStation){

        Radio radio = new Radio(countStations);

        radio.setNumberStation(stationNumber);
        radio.nextStation();

        int actualStation = radio.getNumberStation();

        Assertions.assertEquals(expectedStation, actualStation);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "6,5",
            "9,8",
            "0,9",
    })
    public void shouldPrevRadioStation(int stationNumber, int expectedStation){

        Radio radio = new Radio();

        radio.setNumberStation(stationNumber);
        radio.prevStation();

        Assertions.assertEquals(expectedStation, radio.getNumberStation());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "15,1,0",
            "15,6,5",
            "6,1,0",
            "6,3,2",
    })
    public void shouldPrevRadioStationIfCountStationNotDefault(int countStations, int stationNumber, int expectedStation){

        Radio radio = new Radio(countStations);

        radio.setNumberStation(stationNumber);
        radio.prevStation();

        Assertions.assertEquals(expectedStation, radio.getNumberStation());
    }

    @Test
    public void shouldVolumeSet(){

        int expectedVolume = 50;

        Radio radio = new Radio();
        radio.setVolume(expectedVolume);

        Assertions.assertEquals(expectedVolume, radio.getVolume());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "101,0",
            "-1,0"
    })
    public void shouldNotVolumeSet(int volume, int expectedVolume){

        Radio radio = new Radio();

        radio.setVolume(volume);

        Assertions.assertEquals(expectedVolume, radio.getVolume());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "55,56",
            "99,100",
            "100,100",
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
            "1,0",
            "0,0",
    })
    public void shouldDecreaseVolume(int volume, int expectedVolume){

        Radio radio = new Radio();

        radio.setVolume(volume);
        radio.decreaseVolume();

        Assertions.assertEquals(expectedVolume, radio.getVolume());
    }
}
