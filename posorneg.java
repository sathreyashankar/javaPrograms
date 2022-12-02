import java.util.Scanner;

public class posorneg {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int number = s.nextInt();
        if (number > 0) {
            System.out.println(number + " is Positive.");
        } else if (number < 0) {
            System.out.println(number + " is Negative.");
        } else {
            System.out.println(number + " is neither Positive nor Negative, It is Zero.");
        }
        s.close();
    }
}
