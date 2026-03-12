// Book class represents a book in the library


 class Book {

    // Private data members (Encapsulation)
    private int bookId;
    private String bookName;
    private String bookAuthor;
    private String yearOfPub;
    private float price;
    private String status;

    // Constructor to initialize book details
    public Book(int bookId, String bookName, String bookAuthor,
                String yearOfPub, float price, String status) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.yearOfPub = yearOfPub;
        this.price = price;
        this.status = status;
    }

    // Method to add a new book
    public void addNewBooks() {
        System.out.println("New book added: " + bookName);
    }

    // Method to delete a book
    public void deleteBooks() {
        System.out.println("Book deleted: " + bookName);
    }

    // Method to display all book details
    public void displayBookDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Name: " + bookName);
        System.out.println("Author: " + bookAuthor);
        System.out.println("Year of Publication: " + yearOfPub);
        System.out.println("Price: " + price);
        System.out.println("Status: " + status);
    }

    // Method to inquire about a book
    public void inquiryBook() {
        System.out.println("Inquiry for book: " + bookName);
    }

    // Getter method to access book name
    public String getBookName() {
        return bookName;
    }
}


// User class represents a library member
 class User {

    // Private user details
    private int userId;
    private String userName;
    private String userAddress;
    private int phoneNo;

    // Constructor to initialize user details
    public User(int userId, String userName,
                String userAddress, int phoneNo) {
        this.userId = userId;
        this.userName = userName;
        this.userAddress = userAddress;
        this.phoneNo = phoneNo;
    }

    // Method for returning a book
    public void returnBooks() {
        System.out.println(userName + " returned a book.");
    }

    // Method to calculate and pay fine
    // dt = number of delayed days
    public int payFine(int dt) {
        int fine = dt * 10;   // Fine is 10 per day
        System.out.println("Fine paid: " + fine);
        return fine;
    }

    // Method to add a new user
    public void addNewUser() {
        System.out.println("User added: " + userName);
    }

    // Method to delete a user
    public void deleteUser() {
        System.out.println("User deleted: " + userName);
    }

    // Method to update user details
    public void updateDetails() {
        System.out.println("User details updated.");
    }

    // Method for purchasing a book
    public void bookPurchase() {
        System.out.println(userName + " purchased a book.");
    }

    // Getter method to access user ID
    public int getUserId() {
        return userId;
    }
}


// Librarian class represents a librarian
 class Librarian {

    // Librarian details
    private int id;
    private String name;

    // Constructor to initialize librarian details
    public Librarian(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to search for a book
    public void searchBook(String bookName) {
        System.out.println("Librarian searching for book: " + bookName);
    }

    // Method to verify a library member
    public boolean verifyMember(int id) {
        System.out.println("Verifying member ID: " + id);
        return true; // Assuming member is valid
    }

    // Method to order new books
    public void orderBooks() {
        System.out.println("Books ordered by librarian.");
    }

    // Method to sell books
    public void sellBooks() {
        System.out.println("Books sold by librarian.");
    }
}
// Publisher class represents a book publisher
 class Publisher {

    // Publisher details
    private int id;
    private String name;
    private String address;
    private int phoneNo;

    // Constructor to initialize publisher details
    public Publisher(int id, String name,
                     String address, int phoneNo) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    // Method to add a publisher
    public void addPub() {
        System.out.println("Publisher added: " + name);
    }

    // Method to modify publisher details
    public void modifyPub() {
        System.out.println("Publisher modified: " + name);
    }

    // Method to delete publisher
    public void deletePub() {
        System.out.println("Publisher deleted: " + name);
    }

    // Method to check order status
    public void orderStatus() {
        System.out.println("Order status checked.");
    }
}
// Main class where program execution starts
public class page112 {

    public static void main(String[] args) {

        // Creating Book object
        Book b1 = new Book(
                1,
                "Java Programming",
                "James Gosling",
                "2020",
                500,
                "Available"
        );

        // Creating User object
        User u1 = new User(
                101,
                "Alice",
                "Dhaka",
                123456789
        );

        // Creating Librarian object
        Librarian l1 = new Librarian(
                201,
                "Mr. Smith"
        );

        // Creating Publisher object
        Publisher p1 = new Publisher(
                301,
                "Pearson",
                "New York",
                987654321
        );

        // Book related operations
        b1.addNewBooks();
        b1.displayBookDetails();

        System.out.println();

        // User related operations
        u1.addNewUser();
        u1.bookPurchase();
        u1.payFine(2); // 2 days delay

        System.out.println();

        // Librarian operations
        l1.searchBook(b1.getBookName());
        l1.verifyMember(u1.getUserId());

        System.out.println();

        // Publisher operations
        p1.addPub();
        p1.orderStatus();
    }
}
