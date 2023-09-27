package bcaktrack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: xutao
 * @Date: 2023/05/25 15:31
 * @Version 1.0
 * @Description:
 */
public class Subset {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    int n, k;

    public List<List<Integer>> subset(int[] arr, int k){
        int len = arr.length;
        this.n = len;
        this.k = k;
        dfs(arr, 0);
        return  ans;
    }
    public void dfs(int[] arr,int start){
        if (path.size() == k){
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < n; i++) {
            path.add(arr[i]);
            dfs(arr,i+1);
            path.remove(path.size()-1);
        }
    }

    public static void main(String[] args) {
        Subset subset = new Subset();
        int[] arr = new int[]{1,2,3};
        List<List<Integer>> subset1 = subset.subset(arr, 2);
        for (List<Integer> list : subset1) {
            System.out.println(list);
        }
    }
}
