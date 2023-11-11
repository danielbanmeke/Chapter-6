import java.util.Scanner;

public class Exponentiation {
    public static int integerPower(int base, int exponent) {
        int power = 1;

        for(int count = 1; count <= exponent; count++) {
            power = power * base;
        }

        return power;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter base: ");
        int b = in.nextInt();

        System.out.println("Enter exponent: ");
        int e = in.nextInt();

        System.out.printf("%d exponent %d equals %d", b, e, integerPower(b, e));
    }
}