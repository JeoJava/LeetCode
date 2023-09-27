import sort.MergeSort;
import sort.QuickSort;
import sort.Sort;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: xutao
 * @Date: 2023/05/24 20:02
 * @Version 1.0
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
//        PriorityQueue<Integer> queue = new PriorityQueue<>(((o1, o2) -> o2-o1));
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt(), m = scanner.nextInt();
//        for (int i = 0; i < m; i++) {
//            int k = scanner.nextInt(), num = scanner.nextInt();
//            for (int j = 0; j < k; j++) {
//                queue.add(num);
//            }
//            Integer[] cur = new Integer[n];
//            int h =0;
//            while(!queue.isEmpty() && h<n){
//                int tem = queue.poll();
//                cur[h++] = tem;
//                System.out.print(tem);
//            }
//            if (i<m-1)
//                System.out.println();
//            for (Integer integer : cur) {
//                if (integer!=null) queue.offer(integer);
//            }
            int count = 0;
            for (int j = 1; j <=20 ; j++) {
                for (int l = 1; l <=20 ; l++) {
                    if (Math.abs(j-l) > 3){
                        count++;
                        System.out.println(1);

                    }
                }
            }
            System.out.println(count);
        }

}
