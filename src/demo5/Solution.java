package demo5;
class Solution {
    public static int[] sortArray(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }


    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 2}; // 创建一个整数数组
        int[] sortedNumbers = sortArray(numbers); // 调用 sortArray 方法对数组进行排序

        // 打印排序后的数组
        for (int number : sortedNumbers) {
            System.out.print(number + " ");
        }
    }

}