package bcaktrack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: xutao
 * @Date: 2023/05/25 15:16
 * @Version 1.0
 * @Description:
 */
public class Combine {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    int n;
    boolean[] used;
    public List<List<Integer>> combine(int[] arr){
        int len = arr.length;
        this.n = len;
        this.used = new boolean[n];
        dfs(arr);
        return  ans;
    }
    public void dfs(int[] arr){
        if (path.size() == n){
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!used[i]){
                used[i] = true;
                path.add(arr[i]);
                dfs(arr);
                used[i] = false;
                path.remove(path.size()-1);
            }

        }
    }

    public static void main(String[] args) {
        Combine combine = new Combine();
        int[] arr = new int[]{1,2,3};
        List<List<Integer>> combine1 = combine.combine(arr);
        for (List<Integer> list : combine1) {
            System.out.println(list);
        }
    }
}
