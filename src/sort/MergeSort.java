package sort;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: xutao
 * @Date: 2023/05/24 20:23
 * @Version 1.0
 * @Description:
 */
public class MergeSort implements Sort {
    @Override
    public void sort(int[] arr) {
        int len = arr.length;
        mergeSort(arr, 0, len-1);
    }
    public void mergeSort(int[] arr, int l, int r){
        if (l>=r) return;
        int mid = l+((r-l) >> 1);
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        int i = l, j = mid+1, k=0;
        int[] tem = new int[r-l+1];
        while (i<=mid && j <= r){
            if (arr[i] < arr[j])tem[k] = arr[i++];
            else tem[k] = arr[j++];
            k++;
        }
        while (i<=mid){
            tem[k++] = arr[i++];
        }
        while(j<=r){
            tem[k++] = arr[j++];
        }
        k = 0;
        for (int m = l; m <=r; m++) {
            arr[m] = tem[k++];
        }
    }
}
