public class ArraySumExample {
    public static void main(String[] args) {
        int[] myArray = {1, 5, 10, 25, 50}; // Declare and initialize an array
        int sum = 0; // Initialize a variable to store the sum

        // Loop through the array elements
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i]; // Add each element to the sum
        }

        System.out.println("The sum is: " + sum); // Output: The sum is: 91
    }
}
