public class Driver {
    public static void main(String[] args) {
//        Car myCar = new Car(); //Creation of object myCar
//        myCar.addFuel(6);
//        myCar.drive();
//        System.out.println(myCar.getCurrentFuelLevel());

        Car HellCat = new Car();
        HellCat.addFuel(6);
//        Car HellCatStart = HellCat.start();
//        HellCatStart.drive();
//        the upper both lines are same as the next line as HellCat.Start is returning a method so it can be accessed directly\
        HellCat.start().drive();
    }
}
