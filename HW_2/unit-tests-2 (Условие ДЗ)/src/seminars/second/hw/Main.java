package seminars.second.hw;
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2020);
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR", 2020);

        System.out.println(car.getSpeed());         // Should print "0"
        System.out.println(motorcycle.getSpeed());  // Should print "0"

        car.testDrive();
        motorcycle.testDrive();

        System.out.println(car.getSpeed());         // Should print "60"
        System.out.println(motorcycle.getSpeed());  // Should print "75"

        car.park();
        motorcycle.park();

        System.out.println(car.getSpeed());         // Should print "0"
        System.out.println(motorcycle.getSpeed());  // Should print "0"
    }
}