package hwss1006;

public class Truck extends MotorVehicle {
    @Override
    public void startEngine() {
        System.out.println(getBrand() + " (Truck) engine starts: RRRRRR!");
    }
    public void loadCargo() {
        System.out.println(getBrand() + " is loading cargo...");
    }
}
