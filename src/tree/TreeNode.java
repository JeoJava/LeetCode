package tree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: xutao
 * @Date: 2023/05/24 20:45
 * @Version 1.0
 * @Description:
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
    static TreeNode creatTree(Integer[] arr){
        int len = arr.length;
        Deque<TreeNode> deque = new LinkedList<>();
        if (len == 0 || arr==null) return null;
        TreeNode root = new TreeNode(arr[0]);
        deque.offerLast(root);
        for (int i = 1; i < len; i++) {
            TreeNode cur = deque.pollFirst();
            if (arr[i] != null){
                TreeNode left = new TreeNode(arr[i]);
                cur.left = left;
                deque.offerLast(left);
            }
            i++;
            if (i<len && arr[i]!=null) {
                TreeNode right = new TreeNode(arr[i]);
                cur.right = right;
                deque.offerLast(right);
            }
        }
        return root;
    }
    public static void dfs(TreeNode root){
        if (root!=null){
            dfs(root.left);
            System.out.println(root.val);
            dfs(root.right);
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, null, null, 4, null};
        TreeNode treeNode = TreeNode.creatTree(arr);
        dfs(treeNode);
        Deque<TreeNode> q = new ArrayDeque<>();
        String s = "[1,2,3]";
        System.out.println(s.substring(1, s.length() - 1));
        List<Integer> list = List.of(1, 2);
        list.add(null);
        System.out.println(list.toString().substring(1, list.size() - 1));
    }


}
