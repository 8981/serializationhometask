package ru.levelp;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTestBooking {
    Main m = new Main();

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