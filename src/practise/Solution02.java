package solution;

/**
 * 难度简单139收藏分享切换为英文关注反馈在一个 n * m 的二维数组中，
 * 每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */

/*如果不考虑二维数组排好序的特点，则直接遍历整个二维数组的每一个元素，
判断目标值是否在二维数组中存在。依次遍历二维数组的每一行和每一列。
如果找到一个元素等于目标值，则返回 true。
如果遍历完毕仍未找到等于目标值的元素，则返回 false。*/
public class Solution02 {
    public boolean findNumberIn2DArray(int[][] matrix,int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        int rows = matrix.length;
        int colums = matrix[0].length;
        for(int i = 0;i < rows;i ++){
            for (int j = 0;j < colums;j ++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
