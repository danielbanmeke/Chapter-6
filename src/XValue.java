public class XValue {
    public static void main(String[] args) {
        System.out.printf("The value of x is: %f%n", Math.abs(7.5));
        System.out.printf("The value of x is: %f%n", Math.floor(7.5));
        System.out.printf("The value of x is: %f%n", Math.abs(0.0));
        System.out.printf("The value of x is: %f%n", Math.ceil(0.0));
        System.out.printf("The value of x is: %f%n", Math.abs(-6.4));
        System.out.printf("The value of x is: %f%n", Math.ceil(-6.4));
        System.out.printf("The value of x is: %f%n", Math.ceil(-Math.abs(-8 + Math.floor(-5.5))));
    }
}
