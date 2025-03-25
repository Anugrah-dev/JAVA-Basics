import java.util.Scanner;

public class Challenge28MultiplicationTable {
    public static void main(String[] args) {
            int NumForMultiplication = userInput() ;
            Multiply(NumForMultiplication);

    }


    public static int userInput (){
        System.out.println("Welcome to Multiplication Table generator");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        return input.nextInt();
    }

    public static void Multiply(int number){
        int i = 1;
        while (i <= 10){
            System.out.println(number + " X " + i + "=" + (number * i));
            i++;
        }

    }
}
