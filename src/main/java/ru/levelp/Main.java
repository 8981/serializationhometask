package ru.levelp;


import com.google.gson.Gson;

public class Main {
    public String passengerToJson(Passenger passenger) {
        Gson gson = new Gson();
        return gson.toJson(passenger);
    }

    public Passenger passengerFromJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, Passenger.class);
    }

    public String bookingToJson(Booking booking) {
        Gson gson = new Gson();
        return gson.toJson(booking);
    }

    public Booking bookingFromJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, Booking.class);
    }


}
