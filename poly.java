class Vehicle {
    void info() {
        System.out.println("This is a vehicle");
    }

    void info(String brand) {
        System.out.println("Brand: " + brand);
    }

    void info(String brand, int year, String color, String model, String owner, int price) {
        System.out.println("Brand: " + brand + ", Year: " + year + ", Color: " + color +
                           ", Model: " + model + ", Owner: " + owner + ", Price: " + price);
    }

    void speed() {
        System.out.println("Vehicle has an average speed.");
    }
}

class Car extends Vehicle {
    @Override
    void speed() {
        System.out.println("Car runs at 150 km/h.");
    }
}

class Motorcycle extends Vehicle {
    @Override
    void speed() {
        System.out.println("Motorcycle runs at 120 km/h.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.info();
        v.info("Toyota");
        v.info("Toyota", 2024, "black", "Raize", "rodmar", 1069000);
        v.speed();

        System.out.println();

        v = new Motorcycle();
        v.info();
        v.info("Honda");
        v.info("Honda", 2020, "white", "Click125i", "rodmar", 81900);
        v.speed();
    }
}
