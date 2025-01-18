package JavaPrograms;

class Car {
    String brand;
    int year;


    Car() {
        this.brand = "Unknown";
        this.year = 0;
    }


    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.display();


        Car car2 = new Car("Toyota", 2022);
        car2.display();
    }
}


