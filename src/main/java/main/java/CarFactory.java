package main.java;

public class CarFactory {
    public Car getCar(String brand) throws CarException {
        switch(brand) {
            case "Nissan": {
                Nissan nissan = new Nissan("Red");
                System.out.println(nissan.getRegistrationNumber());
                return nissan;
            }
            case "Volvo": {
                Volvo volvo = new Volvo("White");
                System.out.println(volvo.getRegistrationNumber());
                return volvo;
            }
            default: {
                throw new CarException("Not a valid brand");
            }
        }
        }}
