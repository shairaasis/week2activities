public class Ford extends Car {
    String carSound;
    
    
    public Ford(String name, String model, String brand, int year, String carSound, String location){
        super(name, model, brand, year, location);
        this.carSound = carSound;
        this.name = name;
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.location = location;
       
    }

    public String getCarSound() {
        return carSound;
    }

    public void setCarSound(String carSound) {
        this.carSound = carSound;
    }

 

    
}
