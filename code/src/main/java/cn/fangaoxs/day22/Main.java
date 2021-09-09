package cn.fangaoxs.day22;

import cn.fangaoxs.day22.subject79.Solution;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 吴青珂
 * @Date: 2021/09/10/1:01
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[][] board = {
                {'C','A','A'},
                {'A','A','A'},
                {'B','C','D'},
        };
        String word = "AAB";
        boolean exist = solution.exist(board, word);
        System.out.println("exist = " + exist);
    }
}
