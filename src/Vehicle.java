// Lớp cha Vehicle
class Vehicle implements Drivable  {
    @Override
    public void drive() {
        System.out.println("Vehicle is driving on the road.");
    }
    private String brand;
    private int year;

    // Constructor
    public Vehicle(String brand, int year) {
        this.brand = brand;
        setYear(year);
    }



    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year>2023)
        {
            System.out.println("nhập lại!");
        }
        else {
            this.year = year;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void start() {
        System.out.println("Vehicle is starting.");
    }

    void newdrive() {
        System.out.println("Vehicle is moving...");
    }

    public void stop() {
        System.out.println("Vehicle is stopping.");
    }


    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}


class NewCar extends Vehicle {
    private int numberOfDoors;

    public NewCar(String brand, int year, int numberOfDoors) {
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
    }


    public void honk() {
        System.out.println("Car is honking.");
    }


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: " + numberOfDoors);
    }
}


class Bicycle extends Vehicle implements Drivable {
    private int numberOfWheels;
    @Override
    public void drive() {
        System.out.println("Bicycle is moving on the bike lane.");
    }
    // Constructor
    public Bicycle(String brand, int year, int numberOfWheels) {
        super(brand, year);
        this.numberOfWheels = numberOfWheels;
    }


    public void ringBell() {
        System.out.println("Bicycle is ringing the bell.");
    }


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of wheels: " + numberOfWheels);
    }
}

