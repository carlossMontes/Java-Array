public class ArraySum {
    // Write a program that declares an array of integers and calculates the sum of all its elements

    public static int sumFor(int[] nums){
        int sum = 0;

        // Iterate over the array and sum all the values, cicle for
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        return sum;
    }

    public static int sumForEach(int[] nums){
        int sum = 0;

        // Iterate over all the array and sum the digit, cicle foreach
        for (int num : nums) {
            sum += num;
        }

        return sum;
    }

    public static void main(String[] args) {
        // Set the array and print the sum
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(sumFor(nums));

    }
    
}
