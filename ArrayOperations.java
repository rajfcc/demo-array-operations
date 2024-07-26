package Practice.Array;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ArrayOperations {
    Scanner scanner = new Scanner(System.in);
    public int[] scanArray(int size){

        int[] array = new int[size];
        System.out.println("Enter array elements: ");
        for(int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        printArray(array);
        return array;
    }
    public void printArray(int[] arr) {
        System.out.println("The elements in array are:  ");
        for (int i:arr) {
            System.out.print(i+ "\t");
        }
        System.out.println("\n");
    }

    public String getChoiceFromUser(){
        System.out.println("The available options are: ");
        System.out.println("1. Show the elements of array");
        System.out.println("2. Update the array");
        System.out.println("3. Sum of all elements in the array");
        System.out.println("4. Get max element in the array");
        System.out.println("5. Get min element in the array");
        System.out.println("6. Reverse the array");
        System.out.println("7. Insert element in the array");
        System.out.println("8. Delete element in the array");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        String choice;
        choice = scanner.next();
        return choice;
    }

    public int sumArray(int[] arr) {
        int sum = 0;
        for(int i:arr){
            sum += i;
        }
        return sum;
    }

    public int maxArray(int[] arr) {
        int max = arr[0];
        for(int i:arr){
            if(max<i) {
                max = i;
            }
        }
        return max;
    }

    public int minArray(int[] arr){
        int min = arr[0];
        for(int i:arr){
            if(min>i) {
                min = i;
            }
        }
        return min;
    }
    public int[] reverseArray(int[] arr) {
        int[] reversedArr = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            reversedArr[i] = arr[arr.length-1-i];
        }
        return reversedArr;
    }
    public int getIndexFromUser(){
        System.out.print("Enter the index: ");
        return scanner.nextInt();
    }

    public int[] insertIntoArray(int[] arr,int index, int val) {
        int[] newArr = new int[arr.length+1];
        if(index <= arr.length){
            newArr[index] = val;
            //from suggestion
            IntStream.range(0, index).forEach(i -> newArr[i] = arr[i]);
            for(int i = index+1;i<newArr.length;i++){
                newArr[i]=arr[i-1];
            }
        }
        else{
            System.out.println("Index out of bounds");
        }
        return newArr;
    }
    public int[] removeElement(int[] arr, int index) {
        int[] newArr = new int[arr.length-1];
        if(index ==0 || index<arr.length){
            for(int i = 0;i<index;i++){
                newArr[i]=arr[i];
            }
            for(int i = index+1;i<arr.length;i++){
                newArr[i-1]=arr[i];
            }
        }
        else{
            System.out.println("Index out of bounds");
        }
        return newArr;
    }

}
