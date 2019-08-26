package ru.levelp;

import com.google.gson.Gson;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
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

    @Test
    public void bookingToJson() {
        Booking booking = new Booking("Dan", "123DS33");
        String result = m.bookingToJson(booking);
    }

    @Test
    public void bookingFromJson() {
        String json = "{\"name\":\"Dan\",\"numberPassport\":\"123FFC1\"}";
        Booking result = m.bookingFromJson(json);
    }


}