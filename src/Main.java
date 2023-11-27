import sort.MergeSort;
import sort.QuickSort;
import sort.Sort;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: xutao
 * @Date: 2023/05/24 20:02
 * @Version 1.0
 * @Description:
 */
public class Main {
    static List<Integer> intList = Arrays.asList(1, 2, 3);
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] arr = new int[]{3,8,2,5,1,4,7,6,11,-1};
        mergeSort.sort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

}
