package test;

import main.java.CarException;
import main.java.CarFactory;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class CarFactoryTest {
    CarFactory carFactory = new CarFactory();

    @Test
    public void test_get_nissan_car_brand_success() throws CarException {
        assertEquals("Nissan", carFactory.getCar("Nissan").getBrand());
    }

    @Test
    public void test_get_nissan_car_color_success() throws CarException {
        assertEquals("Blue", carFactory.getCar("Nissan").getColor());
    }

    @Test
    public void test_get_volvo_car_brand_success() throws CarException {
        assertEquals("Volvo", carFactory.getCar("Volvo").getBrand());
    }

    public void test_get_volvo_car_color_success() throws CarException {
        assertEquals("White", carFactory.getCar("Volvo").getColor());
    }

    @Test
    public void test_wrong_car_brand_fail() {
        CarException carException = assertThrows(CarException.class, () -> carFactory.getCar("Akjfa"));
        assertEquals("Not a valid brand", carException.getMessage());
    }
}