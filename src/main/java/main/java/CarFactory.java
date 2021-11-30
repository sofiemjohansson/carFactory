package main.java;

public class CarFactory {
    public Car getCar(String brand) {
        if(brand == null) {
            return null;
        }
        if(brand == "Opel") {
            Nissan nissan = new Nissan("Red");
            System.out.println(nissan.getRegistrationNumber());
            return nissan;
        } else if(brand == "Volvo") {
            Volvo volvo = new Volvo("White");
            System.out.println(volvo.getRegistrationNumber());
            return volvo;
        }

        return null;
    }
}