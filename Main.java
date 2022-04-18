import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Create a Car class array (Activity 2)
        Car[] cars = new Car[2];
        //Instantiate a car and give it values (Activity 1)
        cars[0] = new Car("Tesla Model Y", "Model Y", "Tesla", 2022, "Cebu");
        //Call method to display car info including current location (Activity 1)
        System.out.println("\nCar # 1");
        Car.displayCurrentLocation(cars[0]);
        //Call travel method and set the destination
        Car.travel(cars[0].getLocation());
        Car travel = new Car();
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
            
            cars[index] = new Car(name, model, brand, year, location);
            Car.displayCurrentLocation(cars[index]);
            Car.travel(cars[index].getLocation());
            //Activity 3 starts here(Call travel method)
            System.out.print("Travel Method for Activity 3\n");
            travel.travel(cars[index]);
            //Car.displayCurrentLocation(cars[index]);
        }

        //Displaying everything inside the array
        /*System.out.println("Cars inside the array\n---------------------------------------------");
        for(int i=0; i<cars.length; i++){
            System.out.println("Name:   " + cars[i].getName()+ "Year:   " + cars[i].getYear() );

        }
        */
        System.out.println("\n\n** Activity 5 **");
        //Activity 5
        Ford[] car = new Ford[2];
        
        for(int index=0 ; index<car.length; index++){
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

            System.out.print("Enter car sound: ");
            String carSound = sc.nextLine();

            System.out.print("Enter car location: ");
            String location = sc.nextLine();
            System.out.print("\n");
            
            car[index] = new Ford(name, model, brand, year, carSound, location);
            //Ford.displayCurrentLocation(car[index]);
            //Ford.travel(car[index].getLocation());
            //Ford.travel(car[index].getLocation());
            //Activity 5 (Call travel method)
            System.out.println("\n*Initial Location*");
            System.out.println("Name: " + name + "\nModel: " +model+ "\nBrand: " + brand+ "\nYear: " + year + "\nSound: "+ carSound+ "\nLocation: " + location);
            System.out.print("Travel Method for Activity 5\n");
            travel.travel(car[index]);
            //Car.displayCurrentLocation(cars[index]);
        }

        /*for(int i=0; i<=car.length;i++){
            System.out.println("Name: " +car[i].name+ " Model: " +car[i].model+ "   Brand: " + car[i].brand+ "  Year: " + car[i].year + "   Sound: "+ car[i].carSound+ " Location: " + car[i].location+ "   Destination: ");
        }*/

        


        sc.close();
    }
    
}
