import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class SortedArray {
    // write code here
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();

    public static int[] getRandomArray (int size){

        Random random = new Random();
        int[] newArray = new int[size];
        for (int i = 0; i<size ;i++){
            // argument: upper bound
            newArray[i] = random.nextInt(100);
        }
        return newArray;
    }

    public static int[] getIntegers(int len){
        int[] array = new int[len];
        for(int i = 0; i < len; i++){
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
        // Array copying with Array.copyOf method:
        // when we use this method to manipulate the array, we actually create a new Array object and copy the contents of the original array into new array.
        // This new array and the original array occupy different positions in the memory.
        // However, When you directly assign one array to another, you are not creating a new array. Instead, you are making the two array variables point to the same array object.
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

    // Bubble Sort in descending order
    public static int[] bubbleSort (int[] array){
        int[] newArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        while (flag){
            flag = false;
            for (int i = 0; i < newArray.length - 1; i++){
                if (newArray[i] < newArray[i + 1]){
                    int temp = newArray[i];
                    newArray[i] = newArray[i+1];
                    newArray[i+1] = temp;
                    flag = true;
                }
            }

        }

        return newArray;
    }
}