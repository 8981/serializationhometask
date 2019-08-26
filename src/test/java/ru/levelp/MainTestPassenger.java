package ru.levelp;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTestPassenger {
    Main m = new Main();

    @Test
    public void passengerToJson() {
        Passenger passenger = new Passenger("john", "123FFC1");
        String result = m.passengerToJson(passenger);
    }

    @Test
    public void passengerFromJson() {
        String json = "{\"name\":\"john\",\"numberPassport\":\"123FFC1\"}";
        Passenger result = m.passengerFromJson(json);
    }
}