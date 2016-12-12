/**
 * Created by RdDvls on 12/12/16.
 */
public class Car {
    String carMake;
    String carModel;
    String carColor;
    String carStatus = "not started";
    int carSpeed = 0;

    public void startCar() throws Exception{
        if(this.carStatus.equals("started")){
            throw new Exception("The car is already started");
        }
        this.carStatus = "started";
        System.out.println("The " + this.carMake + " " +  this.carModel + " is " + this.carStatus);
    }
    public void stopCar()throws Exception{
        if(this.carStatus.equals("not started")){
            throw new Exception("The car is already not started");
        }
        this.carStatus = "not started";
        System.out.println("The " + this.carMake + " " +  this.carModel + " is " + this.carStatus);
    }
    public void accelerateCar() throws Exception{
        if(this.carStatus.equals("not started")){
            throw new Exception("Car must first be started to accelerate");
        }
        if((this.carSpeed + 5 > 85)){
            this.carSpeed = 85;
            throw new Exception("Cannot not exceed 85mph");
        }
        this.carSpeed += 5;
        System.out.println(this.carMake + " " + this.carModel + " is moving at " + this.carSpeed + " mph");
    }
    public void brakeCar() throws Exception{
        if(this.carStatus.equals("not started")){
            throw new Exception("Car must first be started");
        }
        if(this.carSpeed == 0){
            throw new Exception("The car is already stopped");
        }
        this.carSpeed -=1;
        System.out.println(this.carMake + " " + this.carModel + " is moving at " + this.carSpeed + " mph");
    }
    public void printInfo() {
        System.out.println("Gathering info for the " + this.carMake + " " + this.carModel + "...");
        System.out.println("\tCar Make: " + this.carMake);
        System.out.println("\tCar Model: " + this.carModel);
        System.out.println("\tCar Color: " + this.carColor);
        System.out.println("\tCar Status: " + this.carStatus);
        System.out.println("\tCar Speed: " + this.carSpeed);
    }
}
