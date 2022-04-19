import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //Create a Car class array (Activity 2)
        Car[] cars = new Car[2];
        //Instantiate a car and give it values (Activity 1)
        cars[0] = new Car("Tesla Model Y", "Model Y", "Tesla", 2022, "Tanauan");
        
        //Create d object of Car to call nonstatic method displayCurrentLocation (Activity 1)
        System.out.println("\nCar # 1");
        Car d = new Car();

        //Call method to display car info including current location (Activity 1)
        d.displayCurrentLocation(cars[0]);
        //Create t object of Car to call nonstatic method displayCurrentLocation
        Car t = new Car();
        //Call travel method which will return newLocation
        String newLocation = t.travel(cars[0].getLocation());

        //Update the location to newLocation after Travelling
        cars[0].setLocation(newLocation); 

        //Activity 2 starts here. Instantiate and give values
        for(int index=1 ; index<cars.length; index++){
            System.out.println("\n\nCar # " +(index+1));
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
            
            //store inputs in cars array and call method to display initial location
            cars[index] = new Car(name, model, brand, year, location);
            d.displayCurrentLocation(cars[index]);

            //Call travel method and update the newlocation after travelling
            newLocation = t.travel(cars[index].getLocation());
            cars[index].setLocation(newLocation);  

            //Activity 3 starts here(Call travel method and update the newlocation after travelling)
            System.out.print("**Travel Method for Activity 3\n");
            newLocation = t.travel(cars[index]);
            cars[index].setLocation(newLocation); 

            //Car.displayCurrentLocation(cars[index]);
        }


      

        System.out.println("\n\n** Activity 4 and 5 **");
        //Activity 4 and 5
        //Create an array of 2 and instantiate each of them with different values for each instance(user input).
        Ford[] fordCars = new Ford[2];
        Ford tFord = new Ford();
        
        for(int index=0 ; index<fordCars.length; index++){
            System.out.println("\n\nCar # " +(index+1));

            System.out.print("Enter car sound: ");
            String carSound = sc.nextLine();

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
            
            //store inputs in fordCars array
            fordCars[index] = new Ford(carSound, name, model, brand, year, location);

            //Activity 5 starts here(Call travel method and update the newlocation after travelling)
            System.out.print("Travel Method for Activity 5\n");
            newLocation = tFord.travelFord(fordCars[index]);
            fordCars[index].setLocation(newLocation);  

            //Car.displayCurrentLocation(cars[index]);
        }

        System.out.println("\n*** END OF PROGRAM ***");

    }


   
    
}
