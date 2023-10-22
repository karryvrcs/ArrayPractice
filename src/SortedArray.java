import java.util.Scanner;
import java.util.Arrays;

public class SortedArray {
    // write code here
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();

    public static int[] getIntegers(int size){
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = i+1;
        }
        return array;
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " contents "+ array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        int[] newArray = Arrays.copyOf(array, array.length);
        Arrays.sort(newArray);
        //reverse

        for(int i = 0; i < newArray.length / 2; i++){
            // Store the i-th elements
            int temporary = newArray[i];

            newArray[i] = newArray[array.length - i -1];
            newArray[array.length - i -1] = temporary;
        }
        return newArray;
    }
}