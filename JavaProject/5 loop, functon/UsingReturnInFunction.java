import java.util.Scanner;

public class UsingReturnInFunction {
    public static void main(String[] args) {
        greet();
        int first = readNumber();
        int second = readNumber();

        int sum = first + second;
        System.out.println("Sum of the number is: " + sum);

    }

    public static void greet() {
        System.out.println("Welcome To Basic Calculator");
    }

    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number: ");
        int number = input.nextInt(); // the yellow underline in number is not an error it's that we can shorten the line
        return number;
        //Removing the underline in number
        // return input.nextInt();
    }


}
