import java.util.Scanner;
public class Main{
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of cars: ");
            int arrayLength = sc.nextInt();
            sc.nextLine();

            //create array of car class
            Car[] cars = new Car[arrayLength];
            //ask input (car info) from the user
            for(int index=0 ; index<cars.length; index++){
                System.out.println("\nCar # " +(index+1));
                System.out.println("Enter car name: ");
                String name = sc.nextLine();

                System.out.println("Enter car brand: ");
                String brand = sc.nextLine();

                System.out.println("Enter car model: ");
                String model = sc.nextLine();

                System.out.println("Enter car year: ");
                int year = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter car location: ");
                String location = sc.nextLine();
                System.out.println("\n");
                System.out.println("**After Travelling**");
                //Car.travel(location);
                
                System.out.println("Name: " + name + "\nModel: " + model+ "\nBrand: " +  brand + "\nYear: " + year + "\nInitial Location: " + location);
                //store inputs to cars array
                cars[index] = new Car(name, model, brand, year, location);
                Car.travel(cars[index]);
            }

            sc.close();
          
        }


}