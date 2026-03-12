
import java.util.Scanner;
import javax.xml.stream.events.StartDocument;

class Car {

    String owner;
    String brand;
    String serial;

    Car(String owner, String brand, String serial) {
        this.owner = owner;
        this.brand = brand;
        this.serial = serial;
    }

    void start() {
        System.out.println("System is staring");
    }

    void stop() {
        System.out.println("system is stopping");
    }

    void checkfuel(double fuel) {
        if (fuel > 60) {
            System.out.println("Fuel level is ok");
            start();
        } else {
            System.out.println("u need to fuel up");
            stop();

        }
    }
    void display(){
        System.out.print("Owner:"+owner+"\n");
        System.out.print("Brand:"+brand+"\n");
        System.out.print("serial:"+serial+"\n");

    }
}

public class page87 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Car car=new Car();
        System.out.println("Owner name:");
        String name = s.nextLine();
        System.out.println("Brand name:");
        String brand = s.nextLine();
        System.out.println("serial:");
        String serial = s.nextLine();
        Car car = new Car(name, brand, serial);
        
        System.out.println("checkfuel in percent:");
        double fuel = s.nextDouble();
        car.display();
        car.checkfuel(fuel);
        //car.start();
        //car.stop();

    }
}
