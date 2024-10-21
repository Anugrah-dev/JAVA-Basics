import java.util.Scanner;

public class challenge2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Give the number you wanna add \n1st number:");
        int firstNumber = input.nextInt();
        System.out.print("2nd number:");
        int secondNumber = input.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.println("The sum is " + sum);
    }
}
