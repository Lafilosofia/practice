package solution;

import java.util.HashSet;
import java.util.Set;

/**
 * 找出数组中重复的数字。
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，
 * 也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 */

/*初始化集合为空集合，重复的数字 repeat = -1
遍历数组中的每个元素：
将该元素加入集合中，判断是否添加成功
如果添加失败，说明该元素已经在集合中，因此该元素是重复元素，
将该元素的值赋给 repeat，并结束遍历*/
public class Solution01 {
    public int findRepeatNumber(int[] nums){
        Set<Integer> set = new HashSet<Integer>();  //遍历数组使用哈希集合
        int repeat = -1;
        for (int num : nums){
            if (! set.add(num)){
                repeat = num;
                break;
            }
        }
        return repeat;
    }
}

//for(元素类型t 元素变量x : 遍历对象obj)