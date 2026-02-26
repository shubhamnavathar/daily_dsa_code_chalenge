import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) { // Fixed: added [] to args
        // Using try-with-resources to automatically close the scanner
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the side of the square: ");
            
            // Using long to prevent overflow for larger inputs
            long side = sc.nextLong(); 
            long area = side * side;
            
            System.out.println("Area of the square is: " + area);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a number.");
        }
    }
}