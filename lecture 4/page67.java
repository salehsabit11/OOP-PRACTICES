import java.util.Scanner;

class ECommercePlatform {

    // Filter by category
    void filterProducts(String category) {
        System.out.println("Searching for products in category: " + category);
    }

    // Filter by price range
    void filterProducts(double minPrice, double maxPrice) {
        System.out.println("Searching for products with price between $" + minPrice + " and $" + maxPrice);
    }

    // Filter by brand
    void filterProducts(String brand, boolean isBrand) {
        System.out.println("Searching for products of brand: " + brand);
    }

    // Filter by category and price range
    void filterProducts(String category, double minPrice, double maxPrice) {
        System.out.println("Searching for products in category: " + category +
                           " with price between $" + minPrice + " and $" + maxPrice);
    }

    // Filter by category, price range, and brand
    void filterProducts(String category, double minPrice, double maxPrice, String brand) {
        System.out.println("Searching for products in category: " + category +
                           " with price between $" + minPrice + " and $" + maxPrice +
                           " of brand: " + brand);
    }
}

public class page67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ECommercePlatform platform = new ECommercePlatform();

        System.out.println("Choose a filter option:");
        System.out.println("1. By Category");
        System.out.println("2. By Price Range");
        System.out.println("3. By Brand");
        System.out.println("4. By Category and Price Range");
        System.out.println("5. By Category, Price Range, and Brand");

        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        switch (choice) {
            case 1:
                System.out.print("Enter category: ");
                String category = sc.nextLine();
                platform.filterProducts(category);
                break;

            case 2:
                System.out.print("Enter minimum price: ");
                double minPrice = sc.nextDouble();
                System.out.print("Enter maximum price: ");
                double maxPrice = sc.nextDouble();
                platform.filterProducts(minPrice, maxPrice);
                break;

            case 3:
                System.out.print("Enter brand: ");
                String brand = sc.nextLine();
                platform.filterProducts(brand, true);
                break;

            case 4:
                System.out.print("Enter category: ");
                category = sc.nextLine();
                System.out.print("Enter minimum price: ");
                minPrice = sc.nextDouble();
                System.out.print("Enter maximum price: ");
                maxPrice = sc.nextDouble();
                platform.filterProducts(category, minPrice, maxPrice);
                break;

            case 5:
                System.out.print("Enter category: ");
                category = sc.nextLine();
                System.out.print("Enter minimum price: ");
                minPrice = sc.nextDouble();
                System.out.print("Enter maximum price: ");
                maxPrice = sc.nextDouble();
                sc.nextLine(); // consume newline
                System.out.print("Enter brand: ");
                brand = sc.nextLine();
                platform.filterProducts(category, minPrice, maxPrice, brand);
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }
}
