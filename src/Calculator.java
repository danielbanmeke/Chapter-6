import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter num1 operator num2 (example: 1 + 2): ");

        double d1 = input.nextDouble();
        char op = input.next().charAt(0);
        double d2 = input.nextDouble();

        if (op == '+')
            System.out.println(d1 + d2);
        else if (op == '-')
            System.out.println(d1 - d2);
        else if (op == '*')
            System.out.println(d1 * d2);
        else if (op == '/')
            System.out.println(d1 / d2);
        else
            System.out.println("Invalid operator");
    }
}
