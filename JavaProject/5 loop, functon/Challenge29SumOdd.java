import java.util.Scanner;

public class Challenge29SumOdd {
    public static void main(String[] args) {
        int receivedNumber = userNumber();
        int sum = sumOfAllOddsBeforeReceivedNumber(receivedNumber);
        System.out.println("OddSum till " + receivedNumber + " is: " + sum);

    }

    public static int userNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        return input.nextInt();
    }


    public static int sumOfAllOddsBeforeReceivedNumber(int num){
        int sum = 0;
        int i = 1;
        while (i <= num) {
                sum += i;
                i += 2;
            }

        return sum;
    }
}
