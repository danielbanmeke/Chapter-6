import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number1 op number2 (5 * 7): ");
        Scanner input = new Scanner(System.in);
        double number1 = input.nextDouble();
        char op = input.next().charAt(0);
        double number2 = input.nextDouble();

        if ( op == '+')
            System.out.println(number1 + number2);
        else if (op == '-')
            System.out.println(number1 - number2);
        else if (op == '/')
            System.out.println(number1 / number2);
        else if (op == '*')
            System.out.println(number1 * number2);
    }
}