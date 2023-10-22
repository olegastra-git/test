package seminars.second.hw;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {

    @Test
    void testCarIsInstanceOfVehicle() {
        Car car = new Car("Company", "Model", 2020);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    void testCarHas4Wheels() {
        Car car = new Car("Company", "Model", 2020);
        assertEquals(4, car.getNumWheels());
    }

    @Test
    void testMotorcycleHas2Wheels() {
        Motorcycle motorcycle = new Motorcycle("Company", "Model", 2020);
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    void testCarSpeedInTestDriveMode() {
        Car car = new Car("Company", "Model", 2020);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    void testMotorcycleSpeedInTestDriveMode() {
        Motorcycle motorcycle = new Motorcycle("Company", "Model", 2020);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    void testCarStopsInParkingMode() {
        Car car = new Car("Company", "Model", 2020);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    void testMotorcycleStopsInParkingMode() {
        Motorcycle motorcycle = new Motorcycle("Company", "Model", 2020);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}
