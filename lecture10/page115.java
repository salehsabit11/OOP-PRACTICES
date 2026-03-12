// Base class
class Restaurant {

    protected double taxRate = 0.10; // 10% tax

    // Method to calculate total bill
    public double calculateTotalBill(double foodPrice) {
        return foodPrice + (foodPrice * taxRate);
    }

    // Method to estimate delivery time
    public int estimateDeliveryTime() {
        return 40; // minutes
    }
}

// Fast Food Restaurant
class FastFoodRestaurant extends Restaurant {

    public FastFoodRestaurant() {
        taxRate = 0.15; // 15% tax
    }

    @Override
    public int estimateDeliveryTime() {
        return 20; // minutes
    }
}

// Fine Dining Restaurant
class FineDiningRestaurant extends Restaurant {

    @Override
    public int estimateDeliveryTime() {
        return 60; // minutes
    }
}

// Main class
//food orddering system
public class page115 {
    public static void main(String[] args) {

        Restaurant r1 = new FastFoodRestaurant();
        Restaurant r2 = new FineDiningRestaurant();

        double price = 500;

        System.out.println("Fast Food Restaurant:");
        System.out.println("Total Bill: " + r1.calculateTotalBill(price));
        System.out.println("Delivery Time: " + r1.estimateDeliveryTime() + " minutes");

        System.out.println();

        System.out.println("Fine Dining Restaurant:");
        System.out.println("Total Bill: " + r2.calculateTotalBill(price));
        System.out.println("Delivery Time: " + r2.estimateDeliveryTime() + " minutes");
    }
}
