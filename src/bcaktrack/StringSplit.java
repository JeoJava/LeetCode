package bcaktrack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: xutao
 * @Date: 2023/05/25 15:35
 * @Version 1.0
 * @Description:
 */
public class StringSplit {
    List<List<String>> ans = new ArrayList<>();
    List<String> path = new ArrayList<>();

    int n;

    public List<List<String>> stringSplit(String s){
        int len = s.length();
        this.n = len;
        dfs(s, 0);
        return  ans;
    }
    public void dfs(String s,int start){
        if (start == n){
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < n; i++) {
            String cur = s.substring(start, i+1);
            path.add(cur);
            dfs(s,i+1);
            path.remove(path.size()-1);
        }
    }

    public static void main(String[] args) {
        StringSplit stringSplit = new StringSplit();
        List<List<String>> ab = stringSplit.stringSplit("abc");
        for (List<String> strings : ab) {
            System.out.println(strings);
        }
        
    }
}
