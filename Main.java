import java.util.Scanner; // Import for user input

public class Main {
    public static void main(String[] args) {
        
        // Print a message
        System.out.println("Hello, welcome to Java!");

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Ask user for name
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        // Ask user for age
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // Output result
        System.out.println("Hello " + name + ", you are " + age + " years old.");

        input.close(); // Close scanner
    }
}