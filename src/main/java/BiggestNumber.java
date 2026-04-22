public class BiggestNumber {

    public static int biggestNumber(int[] nums){
        int biggest = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > biggest) {
                biggest = nums[i];
            }
        }

        return biggest;
    }

    public static void main(String[] args) {
        int [] nums = {11, 22, 33, 44, 55, 66, 77, 88, 99};

        System.out.println(biggestNumber(nums));
    }
}
