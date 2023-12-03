public class Main {
    static void testDrive(Vehicle vehicle) {
        vehicle.drive();
    }
    public static void main(String[] args) {

        NewCar myCar = new NewCar("Toyota", 2022, 4);


        myCar.start();
        myCar.honk();
        myCar.displayInfo();
        myCar.stop();

        System.out.println();


        Bicycle myBicycle = new Bicycle("Giant", 2021, 2);


        myBicycle.start();
        myBicycle.ringBell();
        myBicycle.displayInfo();
        myBicycle.stop();
        Circle circle = new Circle(5.0);
        System.out.println("Area of Circle: " + circle.calculateArea());
        Car newCar = new Car("toyota","cam",2024,"toyota");
        newCar.drive();
        Bicycle newBicycle = new Bicycle("toyota",2022,2);
        newBicycle.drive();
        testDrive(newCar);
        testDrive(newBicycle);

    }
}
