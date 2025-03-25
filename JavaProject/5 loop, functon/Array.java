public class Array {
    public static void main(String[] args) {
        int[] myArray = new int[5];
        myArray[0] = 24;
        myArray[1] = 36;
        myArray[2] = 42;
        myArray[3] = 54;
        myArray[4] = 66;


//        System.out.println(myArray[0]);
//        System.out.println(myArray[1]);
//        System.out.println(myArray[2]);
//        System.out.println(myArray[3]);
//        System.out.println(myArray[4]);
        int index = 0;
        while (index < 5) {
            System.out.println(myArray[index]);
            index++;
        }

    }
}
