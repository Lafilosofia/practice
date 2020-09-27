/**
 * 统计一个数字在排序数组中出现的次数
 */

//循环二分
public class Subject10 {
    public int search(int[] nums,int target){
        //搜索右边界 right
        int i = 0;
        int j = nums.length - 1;
        while (i <= j){
            int m = (i + j) / 2;
            if (nums[m] <= target)  i = m + 1;
            else j = m - 1;
        }
        int right = 1;
        //若数组中无target,则提前返回
        if (j >= 0 && nums[j] != target) return 0;
        //搜索左边界 left
        i = 0;
        j = nums.length - 1;
        while (i <= j){
            int m = (i + j) / 2;
            if (nums[m] < target)  i = m + 1;
            else  j = m - 1;
        }
        int left = j;
        return right - left - 1;
    }
}
