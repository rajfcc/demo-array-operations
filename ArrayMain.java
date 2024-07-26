package Practice.Array;
import java.util.Scanner;

public class ArrayMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();


        ArrayOperations arrOp = new ArrayOperations();

        //Scanning and printing an Array
        int[] arr = arrOp.scanArray(size);

        //looping the program to run continuously
        boolean run = true;

        while(run) {
            String choice = arrOp.getChoiceFromUser();
            switch (choice) {
                case "1":
                    arrOp.printArray(arr);
                    break;
                case "2":
                    arr = arrOp.scanArray(arr.length);
                    break;
                case "3":
                    System.out.println("Sum = " + arrOp.sumArray(arr));
                    break;
                case "4":
                    System.out.println("Max element = " + arrOp.maxArray(arr));
                    break;
                case "5":
                    System.out.println("Min Element =  " + arrOp.minArray(arr));
                    break;
                case "6":
                    int[] rev = arrOp.reverseArray(arr);
                    arrOp.printArray(rev);
                    break;
                case "7":
                    int insertIndex = arrOp.getIndexFromUser();
                    System.out.print("Enter the value: ");
                    int val = sc.nextInt();
                    arr = arrOp.insertIntoArray(arr, insertIndex, val);
                    arrOp.printArray(arr);
                    break;
                case "8":
                    int removeIndex = arrOp.getIndexFromUser();
                    arr = arrOp.removeElement(arr, removeIndex);
                    arrOp.printArray(arr);
                    break;
                case "0":
                    run = false;
                    break;
                default:
                    System.out.println("\n\nEnter valid choice only!!\n\n");

            }
        }

    }
}
