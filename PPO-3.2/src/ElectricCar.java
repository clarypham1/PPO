public class ElectricCar extends AbstractVehicle {

    public ElectricCar() {
        super("Electric Car", "Electricity", "White", 0.15, "kWh/km");
    }

    @Override
    public void charge() {
        System.out.println("Electric Car is charging...");
    }
}