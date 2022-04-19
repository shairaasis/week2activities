public class Ford extends Car{
    static String carSound;

    
    public Ford(String carSound, String name, String model, String brand, int year, String location){
        super(name, model, brand, year, location);
        this.carSound = carSound;
    }

    public Ford(){

    }
    //overload travel method by calling travel in car class to retain functionality and added functionality of dispalying the car sound
    String travelFord(Ford fordCars){
        super.travel(fordCars);
        System.out.println("Car Sound: " + getCarSound());
        return newLocation;

    }

    public static String getCarSound() {
        return carSound;
    }

    public static void setCarSound(String carSound) {
        Ford.carSound = carSound;
    }




    
}
