import java.util.Scanner;

public class Car extends Showroom implements Utility{

    String carName;
    String carColor;
    String carFuelType;
    int carPrice;
    String carType;
    String carTransmission;

    @Override
    public void getDetails() {
        System.out.println("Car Name: " + carName);
        System.out.println("Car Color: " + carColor);
        System.out.println("Car Fuel Type: " + carFuelType);
        System.out.println("Car Price: " + carPrice);
        System.out.println("Car Type: " + carType);
        System.out.println("Car Transmission: " + carTransmission);
    }

    @Override
    public void setDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("========================================== *** ENTER CAR DETAILS *** =======================================");
        System.out.println();
        System.out.println("CAR NAME: ");
        carName = sc.nextLine();
        System.out.println("CAR COLOR: ");
        carColor = sc.nextLine();
        System.out.println("CAR FUEL TYPE: ");
        carFuelType = sc.nextLine();
        System.out.println("CAR PRICE: ");
        carPrice = sc.nextInt();
        System.out.println("CAR TYPE: ");
        carType = sc.nextLine();
        System.out.println("CAR TRANSITION: ");
        carTransmission = sc.nextLine();
        totalCarsInStock ++;
    }
}
