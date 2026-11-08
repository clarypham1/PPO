public class ElectricMotorcycle extends AbstractVehicle {

    public ElectricMotorcycle() {
        super("Electric Motorcycle", "Electricity", "Blue", 0.07, "kWh/km");
    }

    @Override
    public void charge() {
        System.out.println("Electric Motorcycle is charging...");
    }
}