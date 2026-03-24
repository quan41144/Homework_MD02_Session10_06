package hwss1006;

public class Motorcycle extends  MotorVehicle {
    @Override
    public void startEngine() {
        System.out.println(getBrand() + " (Motorcycle) engine starts: Brum Brum!");
    }
    public void doWheelie() {
        System.out.println(getBrand() + " is doing a wheelie");
    }
}
