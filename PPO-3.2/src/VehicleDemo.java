public class VehicleDemo {

    public static void main(String[] args) {
        System.out.println("Vehicle Demonstration");
        System.out.println();

        AbstractVehicle[] vehicles = {
                new Car(),
                new Motorcycle(),
                new Bus(),
                new ElectricCar(),
                new ElectricMotorcycle()
        };

        for (AbstractVehicle vehicle : vehicles) {
            vehicle.start();
            vehicle.stop();
            vehicle.charge();
            System.out.println("Information:");
            System.out.println(vehicle.getInfo());
            // new in Task 4
            System.out.println("Fuel efficiency: " + vehicle.calculateFuelEfficiency()
                    + " " + vehicle.getEfficiencyUnit());
            System.out.println();
        }
    }
}