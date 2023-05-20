import java.util.HashMap;
import java.util.Map;
public class PMemo {
    private static Map<Integer, Map<Integer, Long>> memo = new HashMap<>();
    public static void main(String[] args) {
        int numRows = 10;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(getCoefficient(i, j) + " ");
            }
            System.out.println();
        }
    }

    private static long getCoefficient(int row, int col) {
        if (col == 0 || col == row) {
            return 1;
        }
        if (memo.containsKey(row) && memo.get(row).containsKey(col)) {
            return memo.get(row).get(col);
        }
        long coefficient = getCoefficient(row - 1, col - 1) + getCoefficient(row - 1, col);
        memo.computeIfAbsent(row, k -> new HashMap<>()).put(col, coefficient);

        return coefficient;
    }
}
