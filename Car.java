import java.util.Scanner;
public class Car{
     String name;
     String model;
     String brand;
     int year;
     private static String location;
    
    //Car constructor
    public Car(String name, String model, String brand, int year, String location){
        this.name = name;
        this.model = model;
        this.brand = brand;
        this.year = year;
        Car.location = location;
    }

    //Method for displaying current location (Activity 1)
    public static void displayCurrentLocation(Car cars){
        System.out.println("\n*Initial Location*");
        System.out.println("Name: " + cars.getName() + "\nModel: " + cars.getModel()+ "\nBrand: " +  cars.getBrand()+ "\nYear: " + cars.getYear()+ "\nLocation: " + Car.getLocation());
    }


    //Method for setting the place travelled(destination) and displaying location after travelling (Activity 1 and 2)
    public static void travel(String location) {
        //setDestination("Leyte");
        setLocation("Leyte");
        System.out.println("\n*After Travelling*");
        System.out.println("Location: " + getLocation());
    }

    //Method for setting the place travelled(destination) and calls the method for displaying location after travelling and gas remaining (Activity 3)
    public static void travel(Car cars) {
        Scanner sc = new Scanner(System.in);  
        double gas = 10;    
        System.out.print("Enter destination: ");
        String destination = sc.nextLine();
        System.out.print("Enter the distance: ");
        double distance = sc.nextDouble();
        //Call calculateGasUsed method and Set the gas of the car to gas deducted by the gas used
        gas=gas-calculateGasUsed(distance);
        displayCurrentLocationAndGasRemaining(gas,destination);
        sc.close();
    }
    //Method for calculating gas used (Activity 3)
    public static double calculateGasUsed(double distance) {
        double kmPerLitter = 15.5;
        return kmPerLitter / distance;
    }
    //Method for displaying location after travelling and gas remaining (Activity 3)
    public static void displayCurrentLocationAndGasRemaining(double gas, String destination){
        System.out.print("\nAfter travelling from" +Car.getLocation()+ " to ");
        //set location to destination
        Car.setLocation(destination);
        System.out.print(destination +", the remaining Gas is " + gas + " litter(s).");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    
    public static String getLocation() {
        return location;
    }

    public static void setLocation(String location) {
        Car.location = location;
    }

    
    
}