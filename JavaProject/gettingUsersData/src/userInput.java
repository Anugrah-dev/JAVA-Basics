import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what is your name? ");
        String Name = input.nextLine();
        System.out.println("Konichiwa " + Name);
    }
}
