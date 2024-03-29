package leetcode.C_01_array_two_pointers.D2023_11_14_do_5_Q283_move_zeroes;

/**
 * 双指针解法
 */
public class index_2 {

    public static void main(String[] args) {
        System.out.println("index_2");
    }

    public void moveZeroes(int[] nums) {
        int i = 0, j = 0;
        while (j < nums.length) {
            if (nums[j] != 0) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                i++;
            }
            j++;
        }
    }
}