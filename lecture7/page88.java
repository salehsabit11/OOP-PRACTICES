class  Dog {

    // Attributes
    String name;
    int age;
    String breed;

    // Behaviors
    void bark() {
        System.out.println(name + " is barking.");
    }

    void spin() {
        System.out.println(name + " is spinning.");
    }

    void run() {
        System.out.println(name + " is running.");
    }
}

public class page88 {
    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.name = "Buddy";
        dog.age = 3;
        dog.breed = "Golden Retriever";

        dog.bark();
        dog.spin();
        dog.run();
    }
}
