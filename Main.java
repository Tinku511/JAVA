class Car {
    int mileage;
    int price;
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();   // create object

        c.mileage = 20;      // assign value
        c.price = 39393;     // assign value

        System.out.println("Mileage: " + c.mileage);
        System.out.println("Price: " + c.price);
    }
}
