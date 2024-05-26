package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P48_RotateImage {

    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(matrix);
    }

    public static void rotate(int[][] matrix) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix.length - 1; j >= 0; j--) {
                list.add(matrix[j][i]);
            }
        }

        int idx = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = list.get(idx);
                idx++;
            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }
}


