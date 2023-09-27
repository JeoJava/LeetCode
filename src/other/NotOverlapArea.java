package other;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: xutao
 * @Date: 2023/09/04 17:16
 * @Version 1.0
 * @Description:
 */
import java.util.*;

public class NotOverlapArea {
    public static int compute(int[][] segments) {
        if (segments == null || segments.length == 0) {
            return 0;
        }
        Arrays.sort(segments, (a, b) -> a[1] - b[1]);
        int count = 1;
        int prevEnd = segments[0][1];

        for (int i = 1; i < segments.length; i++) {
            int start = segments[i][0];
            int end = segments[i][1];

            if (start >= prevEnd) {
                count++;
                prevEnd = end;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int[][] segments = new int[x][2];
        for (int i =0;i<x; i++){
            segments[i][0] = scanner.nextInt();
            segments[i][1] = scanner.nextInt();
        }
        int ans = compute(segments);
        System.out.println(ans);
    }
}

