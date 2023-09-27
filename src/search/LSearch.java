package search;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: xutao
 * @Date: 2023/09/27 16:18
 * @Version 1.0
 * @Description:
 */
public class LSearch<T extends Comparable> extends BinSearch<T> {

    @Override
    int binSearch(T[] arr, T target) {
        int l = 0 , r = arr.length-1, ans = -1;
        while (l <= r){
            int mid = (l +((r - l) >> 1));
            if (arr[mid].compareTo(target) >= 0){
                ans = mid;
                r = mid - 1;
            }else {
                l = mid+1;
            }
        }
        return  ans;
    }

    public static void main(String[] args) {
        String[] arr = {"2","2","2","2","2"};
        int i = new LSearch<String>().binSearch(arr, "2");
        System.out.println(i);
    }
}
