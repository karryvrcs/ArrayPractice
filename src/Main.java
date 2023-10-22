import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // create an integer array
        int[] myIntArray = new int[10];
                        // array initializer
        int[] secondArray = {5,4,3,2,1};

        // When you don't use an array initializer statement,
        // all array elements get initialized to the default value for that type\
        // zero get assigned to each element in the array by default.
        int[] thirdArray;

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
        System.out.println("Sort the number in ascending:");
        Arrays.sort(randomArray);
        System.out.println(Arrays.toString(randomArray));

        int[] newArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        // Call the fill method to set all elements to 5.
        Arrays.fill(secondArray,9);
        System.out.println(Arrays.toString(secondArray));

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