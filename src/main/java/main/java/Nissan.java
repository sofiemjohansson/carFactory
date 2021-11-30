package main.java;



public class Nissan implements Car {

    String color;
    String brand = "Nissan";
    String regNumber;
    String engine;

    public Nissan(String color) {
        this.color = color;
        setRegistrationNumber();
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getRegistrationNumber() {
        return regNumber;
    }
    @Override
    public String getEngine() {
        return engine;
    }
    public String setRegistrationNumber() {
        return this.regNumber = RegNumberGenerator.getAlphaNumericString(6);
    }
}