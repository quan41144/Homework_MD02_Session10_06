package hwss1006;

public class Car extends MotorVehicle {
    @Override
    public void startEngine() {
        System.out.println(getBrand() + " (Car) engine starts: Vroom Vroom!");
    }
    public void openTrunk() {
        System.out.println(getBrand() + " trunk is opening...");
    }
}
