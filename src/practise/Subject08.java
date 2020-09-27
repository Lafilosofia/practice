import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 从扑克牌中随机抽5张牌，判断是不是一个顺子，即这5张牌是不是连续的。
 * 2～10为数字本身，A为1，J为11，Q为12，K为13，而大、小王为 0 ，可以看成任意数字。A 不能视为 14。
 */

//方法一 集合Set+遍历
public class Subject08 {
    public boolean isStraight(int[] nums){
        Set<Integer> repeat = new HashSet<>();
        int max = 0;
        int min = 14;
        for (int num : nums){
            if (num == 0)   continue;   //跳过大小王
            max = Math.max(max,num);    //最大牌
            min = Math.min(min,num);    //最小牌
            if (repeat.contains(num))   return false;   //若有重复,提前返回false
            repeat.add(num);    //添加此牌至set
        }
        return max - min < 5;   //最大牌 - 最小牌 < 5 则可构成顺子
    }


    /*
    方法二
    public boolean isStraight(int[] nums){
        int joker = 0;  //大小王的数量
        Arrays.sort(nums);  //数组排序
        for(int i = 0;i < 4;i ++){
            if (nums[i] == 0) joker ++;   //统计大小王数量
            else if (nums[i] == nums[i + 1]) return false;  //若有重复,提前返回false
        }
        return nums[4] - nums[joker] < 5;   //最大牌
    }
    */

}




