public class VehicleDemo {

    public static void main(String[] args) {
        System.out.println("Vehicle Demonstration");
        System.out.println();
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        Vehicle bus = new Bus();

        car.start();
        car.stop();
        System.out.println("Car Information:");
        System.out.println(car.getInfo());
        System.out.println();

        motorcycle.start();
        motorcycle.stop();
        System.out.println("Motorcycle Information:");
        System.out.println(motorcycle.getInfo());
        System.out.println();

        bus.start();
        bus.stop();
        System.out.println("Bus Information:");
        System.out.println(bus.getInfo());
    }
}