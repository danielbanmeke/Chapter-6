import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number: ");
        int x = input.nextInt();

        if ( x % 2 == 0) {
            System.out.println("The Number is Even");
        }

        if (x % 2 == 1){

            System.out.println("The Number is Odd");
        }

    }
}
