public class ElectricCar extends AbstractVehicle {

    public ElectricCar() {
        super("Electric Car", "Electricity", "White");
    }

    @Override
    public void charge() {
        System.out.println("Electric Car is charging...");
    }
}