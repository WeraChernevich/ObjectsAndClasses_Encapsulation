import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Elevator elevator = new Elevator(-3, 26);
//        while (true) {
//            System.out.println("Введите номер этажа: ");
//            int floor = new Scanner(System.in).nextInt();
//            elevator.move(floor);
//            System.out.println(elevator.getCurrentFloor());
//        }
        Dimensions changeDimensions = new Dimensions(30.0, 25.0, 100.0);
        Cargo cargo = new Cargo(changeDimensions,
                2000,
                "Текстильщиков дом 28",
                true,
                "WE123YU125IH23",
                false);

        Cargo updateAdress = cargo.changeDeliveryAdress("Советская, 16");
        Cargo updateDimension = cargo.changeDimensions(new Dimensions(60.0, 120.0, 50.0));
        Cargo updateMass = cargo.changeMass(7000);

        System.out.println(cargo.getDeliveryAddress());
        System.out.println(updateAdress.getDeliveryAddress());
        System.out.println(cargo.getDimensions());
        System.out.println(updateDimension.getDimensions());
        System.out.println(cargo.getMass());
        System.out.println(updateMass.getMass());





    }
}