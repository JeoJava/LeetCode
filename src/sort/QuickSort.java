package sort;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: xutao
 * @Date: 2023/05/24 20:13
 * @Version 1.0
 * @Description:
 */
public class QuickSort implements Sort {
    @Override
    public void sort(int[] arr) {
        int len = arr.length;
        quickSort(arr, 0, len-1);
    }
    public void quickSort(int[] arr, int l, int r){
        if (l>=r) return;
        int i = l , j = r;
        int mid = arr[i];
        while (i<j){
            while (i<j && arr[j] >= mid) j--;
            arr[i] = arr[j];
            while(i<j && arr[i] <= mid) i++;
            arr[j] = arr[i];
        }
        arr[i] = mid;
        quickSort(arr, l, i-1);
        quickSort(arr, i+1, r);
    }
}
