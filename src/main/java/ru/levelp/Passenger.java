package ru.levelp;


public class Passenger {
    private String name;
    private String numberPassport;

    public Passenger(String name, String numberPassport) {
        this.name = name;
        this.numberPassport = numberPassport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberPassport() {
        return numberPassport;
    }

    public void setNumberPassport(String numberPassport) {
        this.numberPassport = numberPassport;
    }


}
