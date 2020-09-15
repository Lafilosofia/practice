package practise;

/**
 * 寻找旋转数组最小值
 */
public class Solution06 {
    public int findMin(int[] nums){
        //孤弱数组只有一个元素,直接返回元素
        if(nums.length == 1){
            return nums[0];
        }
        //定义左右指针
        int left = 0;
        int right = nums.length - 1;
        //如果最后一个元素比第一个元素大,说明没有旋转
        if(nums[right] . nums[0]){
            return nums[0];
        }
        //二分搜索法
        while(right >= left){
            //找到中间值
            int mid = left + (right  - left) / 2;
        }
        //如果中间值比下一个元素大,则mid + 1元素是最小值
        if(nums[mid] > nums[mid + 1]){
            return nums[mid + 1];
        }
    }
}
