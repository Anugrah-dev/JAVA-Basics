public class Car {
    int noOfWheels;

    String Color;

    float maxSpeed;

    float currentFuelInLiters;

    int noOfSeats;

 // Method 🙃
    public Car start() {
        if(currentFuelInLiters == 0){
            System.out.println("Car is out of fuel, it wont start");
        } else if (currentFuelInLiters < 5) {
            System.out.println("Car is running low on fuel");
        } else {
            System.out.println("Car is started ");
        }
        return this;
    }

    public void drive() {
        currentFuelInLiters--;
        System.out.println("Car is driving");
    }

    public void addFuel(float fuel) {
        currentFuelInLiters += fuel;
    }

    public float getCurrentFuelLevel() {
        return currentFuelInLiters;
    }
}
