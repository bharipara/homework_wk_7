package homework_wk_7;

/**
 * 19. Write a Java program to calculate the average value of array elements.
 */

public class P19_CalculateTheAverage {
    public static void main(String[] args) {
        // create an array
        double [] array = { 1, 2, 3, 4, 5, 6  };
        // getting array length
        double length = array.length;
        // default sum value.
        double sum = 0;
        // sum of all values in array using for loop
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum / length;
        System.out.println("Average of array : "+average);
    }
}

