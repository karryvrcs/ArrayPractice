import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // create an integer array
        int[] myIntArray = new int[10];
                        // array initializer
        int[] myArray = {5,4,3,2,1};

        // When you don't use an array initializer statement,
        // all array elements get initialized to the default value for that type\
        // zero get assigned to each element in the array by default.
        int[] anotherArray;

        myIntArray[5] = 50;
        for(int element : myIntArray){
            System.out.println(element);
        }

        double[] myDoubleArray = new double[10];
        myDoubleArray[1] = 3.52; // set the second element in the array with a floating point number 3.52

        //Loop through the element to retrieve each value with the loop index.
        for(double element: myDoubleArray){
            System.out.println(element);
        }

        for(int i = 0; i < myDoubleArray.length; i++){
            // print out the element using the loop index to get the current element.
            System.out.println(myDoubleArray[i]);
        }

        System.out.println("----");
        System.out.println(Arrays.toString(myDoubleArray));

        // We can create array of Object, that supports any kind of type in JAVA
        Object[] objectArray = new Object[3];

        // lesson 120
        System.out.println("---------------------------------");
        int[] randomArray = getRandomArray(10);
        System.out.println(Arrays.toString(randomArray));
        System.out.println("Sort the number in ascending order:");
        Arrays.sort(randomArray);
        System.out.println(Arrays.toString(randomArray));

        int[] newArray = new int[10];
        // All the element are set to zero because the value will be set to the default value of the element type
        // when the array was initialized.
        System.out.println(Arrays.toString(newArray));
        // Call the fill method to set all elements to 5.
        Arrays.fill(newArray,9);
        System.out.println(Arrays.toString(newArray));

        System.out.println();
        System.out.println("copyOf");
        int[] secondArray = getRandomArray(10);
        System.out.println(Arrays.toString(secondArray));
        int[] thirdArray = new int[5];
        // make copies of an array:
        int[] fourthArray = Arrays.copyOf(secondArray, 10);
        System.out.println(Arrays.toString(fourthArray));

        System.out.println("Sort the second Array in ascending order");
        Arrays.sort(secondArray);
        System.out.println(Arrays.toString(secondArray));
        // The fourthArray will not be sorted because it is a new Array.
        System.out.println(Arrays.toString(fourthArray));

        // If the new length less than original length, only the first 'new length' elements are included in the copied Array.
        // If the new length greater than original length, the remaining parts of new Array will be filled with specific default value
        // (depend on the element type)
        int[] smallerArray = Arrays.copyOf(secondArray, 7);
        System.out.println(Arrays.toString(smallerArray));
        int[] largerArray = Arrays.copyOf(secondArray,12);
        System.out.println(Arrays.toString(largerArray));


        System.out.println("---------------Binary Search--------------");
        // Create an array, populating the elements with array initializer.
        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        // Binary Search method only works on the sorted array
        Arrays.sort(sArray);
        // BinarySearch method returns the position of match if match founded.
        // It returns -1 if match is not founded.
        // If there are duplicate value in the array, there's no guarantee which one it will match on.
        System.out.println(Arrays.toString(sArray));
        if(Arrays.binarySearch(sArray,"Mark") >= 0){
            System.out.println("Found Mark in the list");
        }

        // To compare if two array is equal:
        int[] s1 = {1,2,3,4,5};
        int[] s2 = {1,2,3,4,5};
        if (Arrays.equals(s1,s2)){
            System.out.println("Arrays are equal!");
        }

        int[] sdArray = SortedArray.getRandomArray(10);
        System.out.println(Arrays.toString(sdArray));


        int[] Array2 = SortedArray.bubbleSort(sdArray);
        System.out.println(Arrays.toString(Array2));
    }


    private static int[] getRandomArray(int len){ // Specify a len...
        Random random = new Random();
        int[] newInt = new int[len];
        for(int i = 0; i < len; i++){
            // upper bound.
            // If we don't pass any argument, it will return a number from zero to maximum integer.
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}