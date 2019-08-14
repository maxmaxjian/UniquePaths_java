import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;

public class Solution1 implements Solution {
    private Map<Pair<Integer,Integer>, Integer> map = new HashMap<>();

    @Override
    public int uniquePaths(int m, int n) {

        return uniquePathsFunc(m-1, n-1, m, n);
    }

    private int uniquePathsFunc(int row, int col, int m, int n) {
        Pair curr = new Pair<>(row,col);
        if (!map.containsKey(curr)) {
            if (row == 0 || col == 0) {
                map.put(curr, 1);
            } else {
                int result = 0;
                result += row > 0 ? uniquePathsFunc(row-1, col, m, n) : 0;
                result += col > 0 ? uniquePathsFunc(row, col-1, m, n) : 0;
                map.put(curr, result);
            }
        }
        return map.get(curr);
    }
}
