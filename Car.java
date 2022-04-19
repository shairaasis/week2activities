import java.util.Scanner;
public class Car {
    String name, brand, model;
    int year;
    private String location;
    double gas=50, gasConsumption;
    String newLocation;

    public Car(String name, String model, String brand, int year, String location){
        this.name = name;
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.location = location;
    }


    void displayCurrentLocation(Car cars){
        System.out.println("\n*Initial Location*");
        System.out.println("Name: " + cars.getName() + "\nModel: " + cars.getModel()+ "\nBrand: " +  cars.getBrand()+ "\nYear: " + cars.getYear()+ "\nLocation: " + cars.getLocation());
    }
    //Travel method for Activity 1 and 2
    String travel(String location){
        String newLocation = "Tacloban";
        setLocation(newLocation);  
        System.out.println("\n*After Travelling*");
        System.out.println("Location: " + getLocation());
        return newLocation;

    }
    //Overloaded Travel method(has different parameter) for Activity 3 and 5
    String travel(Car cars){
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter destination: ");
        newLocation = sc.nextLine();
        System.out.print("Enter the distance(km) from current location to destination: ");
        double distance = sc.nextDouble();
        
        //Call calculateGasUsed method and Set the gas of the car to gas deducted by the gas used
        gasConsumption = calculateGasUsed(distance);
        gas=gas-gasConsumption;
        displayNewLocationGasAndGasConsumption(cars, gas, newLocation, gasConsumption);
        return newLocation;
    }

    //Method for calculating gas used (Activity 3)
    public double calculateGasUsed(double distance) {
        //gas consumption is kmPerLitter
        double kmPerLitter = 15.5;
        gasConsumption = distance / kmPerLitter;
        return gasConsumption;
    }

    void displayNewLocationGasAndGasConsumption(Car cars, double gas, String newLocation, double gasConsumption){
        System.out.print("\nAfter travelling from " + cars.getLocation() + " to ");
        //set location to destination
        cars.setLocation(newLocation);
        System.out.print(newLocation +" the gas consumed is "+gasConsumption+" and the remaining Gas is " + gas + " litter(s).");
        //System.out.print(destination +" the remaining Gas is " + gas + " litter(s).");
        System.out.println("\n------------------------------------------------------------------------------------------");
        System.out.println("Name: " + cars.getName() + "\nModel: " + cars.getModel()+ "\nBrand: " +  cars.getBrand()+ "\nYear: " + cars.getYear()+ "\nLocation: " + cars.getLocation());
    }


    public Car(){

    }


    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getGasConsumption() {
        return gasConsumption;
    }

    public void setGasConsumption(double gasConsumption) {
        this.gasConsumption = gasConsumption;
    }



     //getters and setters
     

    
}
