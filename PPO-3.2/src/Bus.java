public class Bus extends AbstractVehicle {
    private int capacity;

    public Bus() {
        super("Bus", "Diesel", "Yellow", 0.30, "L/km");
        this.capacity = 40;
    }

    @Override
    public String getInfo() {
        return "Type: " + type + "\nFuel: " + fuel + "\nCapacity: " + capacity + " passengers";
    }
}