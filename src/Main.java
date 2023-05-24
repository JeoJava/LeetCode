import sort.MergeSort;
import sort.QuickSort;
import sort.Sort;

import java.util.Arrays;

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
        Sort sort = new MergeSort();
        int[] arr = {5, 5,5,5,5,5,2};
        sort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
