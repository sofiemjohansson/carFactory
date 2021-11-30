package test;

import main.java.CarFactory;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarFactoryTest {
    CarFactory carFactory = new CarFactory();

    @Test
    public void test_get_nissan_car_brand_success() {
        assertEquals("Nissan", carFactory.getCar("Nissan").getBrand());
    }

    @Test
    public void test_get_nissan_car_color_success() { assertEquals("Red", carFactory.getCar("Nissan").getColor()); }

    @Test
    public void test_get_volvo_car_brand_success() {
        assertEquals("Volvo", carFactory.getCar("Volvo").getBrand());
    }

    @Test
    public void test_get_volvo_car_color_success() { assertEquals("White", carFactory.getCar("Volvo").getColor()); }
}