public class ElectricMotorcycle extends AbstractVehicle {

    public ElectricMotorcycle() {
        super("Electric Motorcycle", "Electricity", "Blue");
    }

    @Override
    public void charge() {
        System.out.println("Electric Motorcycle is charging...");
    }
}