package cn.fangaoxs.day2.subject54;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 吴青珂
 * @Date: 2021/08/21/0:25
 * @Description:
 */
class Solution {

    public static void main(String[] args) {
        int[][] matrix = { {1,2,3,4},{5,6,7,8},{9,10,11,12} };
        System.out.println("spiralOrder(matrix) = " + spiralOrder(matrix));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        int left = 0;
        int right = matrix[0].length;
        int bottom = matrix.length;
        int top = 0;
        int direction = 0;
        while ( (left<right)&&(top<bottom) ){
            if (direction == 0){
                // 右移动
                for (int i = left; i < right; i++) {
                    result.add(matrix[top][i]);
                }
                top++;
                direction = 1; //接下来往下
            } else if (direction == 1){
                // 下移动
                for (int i = top; i < bottom; i++) {
                    result.add(matrix[i][right-1]);
                }
                right--;
                direction = 2; //接下来往左
            } else if (direction == 2){
                //左移动
                for (int i = right-1; i >= left; i--) {
                    result.add(matrix[bottom-1][i]);
                }
                bottom--;
                direction = 3; //接下来往上
            } else if (direction == 3) {
                //上移动
                for (int i = bottom-1; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
                direction = 0;
            }
        }
        return result;
    }
}
