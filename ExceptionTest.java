import java.util.*;

public class ExceptionTest {
    public static void main(String[] args) {
        int k, m;
        try {
            k = 0;
            m = 33 / k;
            System.out.println("This will not printed");
        } catch (ArithmeticException exceptioRference) {
            System.out.println("Exception messege :" + exceptioRference.getMessage());
            System.out.println("Division by zero");
        }
        System.out.printf("After catch statement");

        Scanner scan = new Scanner(System.in);
        boolean successful = false;
        while (!successful) {
            System.out.println("Enter 2 integers.");
            try {
                int a = scan.nextInt();
                int b = Integer.parseInt(scan.nextLine().trim());
                int c = a / b;
                System.out.println("Result: " + c);
                successful = true;
            } catch (ArithmeticException e) {
                System.out.println("Can not divide by 0.");
            } catch (InputMismatchException e) {
                System.out.println("Need 2 numbers for division.");
                if (scan.hasNextLine())
                    scan.nextLine();
            } catch (NumberFormatException e) {
                System.out.println("Need 2 numbers for division.");
            }
        }
        scan.close();
    }
}
