public class Car extends Vehicle implements Drivable{


    String make;
    String model;
    @Override
    public void drive() {
        System.out.println("Car is driving on the road.");
    }
    @Override
    void newdrive() {
        System.out.println("Car is driving on the road with high speed!");
    }



    public Car(String make, String model, int year,String brand ) {
        super(brand, year);
        this.make = make;
        this.model = model;

    }


    public void displayCarInfo() {

        System.out.println("make: " + make);
        System.out.println("model: " + model);
        System.out.println("year:"+getYear());

    }


    public static void main(String[] args) {

        Car myCar = new Car("Toyota", "Camry", 2023,"toyota");

        System.out.println("Make: " + myCar.make);
        System.out.println("Model: " + myCar.model);
        System.out.println("Year: " + myCar.getYear());
        myCar.displayCarInfo();
    }
}
