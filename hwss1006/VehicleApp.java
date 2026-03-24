package hwss1006;

import java.util.Random;
import java.util.Scanner;

public class VehicleApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        MotorVehicle[] list = new MotorVehicle[100];
        int total = 0;
        while (true) {
            System.out.println("==================== VEHICLE MANAGEMENT MENU ======================");
            System.out.println("1. Hiển thị thông tin tất cả phương tiện");
            System.out.println("2. Kiểm tra Overriding: startEngine()");
            System.out.println("3. Kiểm tra Overloading: move()");
            System.out.println("4. Kiểm tra đa hình runtime (mảng Vehicle)");
            System.out.println("5. Gọi các hành vi đặc trưng theo loại");
            System.out.println("6. Thêm phương tiện mới (Car/Motorcycle/Truck)");
            System.out.println("0. Thoát");
            System.out.println("===================================================================");
            System.out.print("Lựa chọn của bạn: ");
            int t = Integer.parseInt(sc.nextLine());
            switch (t) {
                case 1:
                    if (total == 0) {
                        System.out.println("Chưa có phương tiện nào!");
                    }
                    else {
                        System.out.println("--- THÔNG TIN PHƯƠNG TIỆN ---");
                        for (int i = 0; i < total; i++) {
                            list[i].showInfo();
                        }
                    }
                    break;
                case 2:
                    System.out.println("--- OVERRIDING: startEngine() ---");
                    for (int i = 0; i < total; i++) {
                        list[i].startEngine();
                    }
                    break;
                case 3:
                    System.out.println("--- OVERRIDING: move() ---");
                    for (int i = 0; i < total; i++) {
                        list[i].move();
                        list[i].move(10+r.nextInt(150));
                    }
                    break;
                case 4:
                    System.out.println("--- POLYMORPHISM RUNTIME ---");
                    for (int i = 0; i < total; i++) {
                        list[i].startEngine();
                    }
                    break;
                case 5:
                    System.out.println("--- HÀNH VI ĐẶC TRƯNG CỦA TỪNG LOẠI ---");
                    for (int i = 0; i < total; i++) {
                        if (list[i] instanceof Car car) {
                            car.openTrunk();
                        }
                        if (list[i] instanceof Motorcycle motorcycle) {
                            motorcycle.doWheelie();
                        }
                        if (list[i] instanceof Truck truck) {
                            truck.loadCargo();
                        }
                    }
                    break;
                case 6:
                    System.out.println("--- THÊM PHƯƠNG TIỆN MỚI ---");
                    System.out.print("Loại (car/motorcycle/truck): ");
                    String s = sc.nextLine();
                    switch (s) {
                        case "car":
                            Car car = new Car();
                            System.out.print("Brand: ");
                            car.setBrand(sc.nextLine());
                            System.out.print("Year: ");
                            car.setYear(Integer.parseInt(sc.nextLine()));
                            System.out.print("Fuel Type: ");
                            car.setFuelType(sc.nextLine());
                            list[total++] = car;
                            break;
                        case "motorcycle":
                            Motorcycle motorcycle = new Motorcycle();
                            System.out.print("Brand: ");
                            motorcycle.setBrand(sc.nextLine());
                            System.out.print("Year: ");
                            motorcycle.setYear(Integer.parseInt(sc.nextLine()));
                            System.out.print("Fuel Type: ");
                            motorcycle.setFuelType(sc.nextLine());
                            list[total++] = motorcycle;
                            break;
                        case "truck":
                            Truck truck = new Truck();
                            System.out.print("Brand: ");
                            truck.setBrand(sc.nextLine());
                            System.out.print("Year: ");
                            truck.setYear(Integer.parseInt(sc.nextLine()));
                            System.out.print("Fuel Type: ");
                            truck.setFuelType(sc.nextLine());
                            list[total++] = truck;
                            break;
                        default:
                            System.out.println("Chọn kiểu phương tiện cần thêm không đúng");
                    }
                    break;
                case 0:
                    System.out.println("Thoát chương trình...");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn menu không đúng");
            }
        }
    }
}
