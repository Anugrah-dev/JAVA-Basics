import java.util.Scanner;


public class OddEvenUsingBitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd/Even Calculator");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();

        if ((num & 1) == 1 ){
            System.out.println("Your Number is Odd");
        } else {
            System.out.println("Your Number is Even");
        }
    }
}
