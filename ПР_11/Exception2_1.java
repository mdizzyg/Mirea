import java.util.Scanner;

public class Exception_2_1 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");

        try {
            String intString = myScanner.next();
            int i = Integer.parseInt(intString); // Возможное NumberFormatException
            System.out.println(2 / i); // Возможное ArithmeticException
        } catch (Exception e) {
            System.out.println("General exception caught: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Input is not a valid integer.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Execution complete.");
        }
    }

    public static void main(String[] args) {
        Exception2 ex = new Exception2();
        ex.exceptionDemo();
    }
}
