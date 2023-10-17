import java.util.Scanner;

public class MinimumFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 floating-point values separated by spaces: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double result = minimum(number1, number2, number3);

        System.out.println("Minimum is " + result);
    }

    public static double minimum (double x, double y, double z){
        double minimumValue = x;

        if (y < minimumValue)
            minimumValue = y;

        if (z < minimumValue)
            minimumValue = z;

        return minimumValue;
    }

}
