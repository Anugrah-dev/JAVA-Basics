import java.util.Scanner;

public class SearchingInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {3, 6, 8, 87, 4, 65, 23, 9, 98, 34};
        System.out.println("Welcome to Array Searching\n");
        System.out.println("Enter the number you want to search for: ");
        int num = input.nextInt();
        boolean isFound = isFound(arr, num);
        if (isFound){
            System.out.println("Your Number IS In The Array");
        } else {
            System.out.println("Your Number Was Not Found In The Array");
        }
    }
    public static boolean isFound(int[] arr, int num) {
        int index = 0;
        while(index < arr.length){
            if (arr[index] == num){
                return true;
            }
            index++;
        }
        return false;
    }
}
