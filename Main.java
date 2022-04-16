import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Create a Car class array (Activity 2)
        Car[] cars = new Car[3];
        //Instantiate a car and give it values (Activity 1)
        cars[0] = new Car("Tesla Model Y", "Model Y", "Tesla", 2022, "Cebu");
        //Call method to display car info including current location (Activity 1)
        System.out.println("\nCar # 1");
        Car.displayCurrentLocation(cars[0]);
        //Call travel method and set the destination
        Car.travel(Car.getLocation());


        //Activity 2 starts here. Instantiate and give values
        for(int index=1 ; index<cars.length; index++){
            System.out.println("\nCar # " +(index+1));
            System.out.print("Enter car name: ");
            String name = sc.nextLine();

            System.out.print("Enter car brand: ");
            String brand = sc.nextLine();

            System.out.print("Enter car model: ");
            String model = sc.nextLine();

            System.out.print("Enter car year: ");
            int year = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter car location: ");
            String location = sc.nextLine();
            System.out.print("\n");
            
            cars[index] = new Car(name, model, brand, year, location);
            Car.displayCurrentLocation(cars[index]);
            Car.travel(Car.getLocation());
            //Activity 3 starts here(Call travel method)
            Car.travel(cars[index]);
            //Car.displayCurrentLocation(cars[index]);
        }
        sc.close();
    
    }
    
}
