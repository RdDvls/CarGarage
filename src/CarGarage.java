
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by RdDvls on 12/12/16.
 */
public class CarGarage {
    public static void main(String[] args) {

        System.out.println("***********************");
        System.out.println("Welcome to the Garage");
        System.out.println("***********************\n");
        System.out.println("How many cars in the garage?");
        Scanner inputScanner = new Scanner(System.in);
        int carNumber = Integer.valueOf(inputScanner.nextLine());
        Car[] myCars = new Car[carNumber];
        System.out.println("Gathering car details...");
        for (int index = 0; index < carNumber; index++) {
            myCars[index] = new Car();
            System.out.println("Car #" + (index + 1) + ":");
            System.out.println("Enter Car Make:");
            myCars[index].carMake = inputScanner.nextLine();
            System.out.println("Enter Car Model:");
            myCars[index].carModel = inputScanner.nextLine();
            System.out.println("Enter Car Color:");
            myCars[index].carColor = inputScanner.nextLine();
        }
        Boolean gameFlag = true;
        while (gameFlag) {
            System.out.println("Cars in Garage");
            System.out.println("***************\n");
            for (int carIndex = 0; carIndex < myCars.length; carIndex++) {
                System.out.println("Car #" + (carIndex + 1) + ":");
                System.out.println(myCars[carIndex].carMake);
                System.out.println(myCars[carIndex].carModel);
                System.out.println(myCars[carIndex].carColor);
                System.out.println("\n");
            }
            System.out.println("Select a car to use:");
            int carChoice = Integer.valueOf(inputScanner.nextLine());
            gameFlag = carOptions(inputScanner, carChoice, myCars);
        }
    }

    public static boolean carOptions(Scanner inputScanner, int carChoice, Car[] myCars) {
        while (true) {
            System.out.println("1. Start the car");
            System.out.println("2. Stop the car");
            System.out.println("3. Accelerate the car");
            System.out.println("4. Brake the car");
            System.out.println("5. Print Info");
            System.out.println("6. Choose Another Car");
            System.out.println("7. Exit Program");
            int carOptionChoice = Integer.valueOf(inputScanner.nextLine());
            if (carOptionChoice == 1) {
                try {
                    myCars[(carChoice - 1)].startCar();
                } catch (Exception exception) {
                    System.out.println(exception.getMessage());
                }
            } else if (carOptionChoice == 2) {
                try {
                    myCars[(carChoice - 1)].stopCar();
                } catch (Exception exception) {
                    System.out.println(exception.getMessage());
                }
            } else if (carOptionChoice == 3) {
                try {
                    myCars[(carChoice - 1)].accelerateCar();
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            } else if (carOptionChoice == 4) {
                try {
                    myCars[(carChoice - 1)].brakeCar();
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            } else if (carOptionChoice == 5) {
                try {
                    myCars[(carChoice - 1)].printInfo();
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }else if(carOptionChoice == 6){
                break;
            }else if(carOptionChoice == 7){
                return false;
            }

        }
        return true;
    }
}
