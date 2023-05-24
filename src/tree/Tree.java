package tree;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: xutao
 * @Date: 2023/05/24 20:45
 * @Version 1.0
 * @Description:
 */
public class Tree {
    private int val;
    private Tree left;
    private Tree right;
    Tree(int val){
        this.val = val;
    }
    static Tree creatTree(Integer[] arr){
        int len = arr.length;
        Deque<Tree> deque = new LinkedList<>();
        if (len == 0 || arr==null) return null;
        Tree root = new Tree(arr[0]);
        deque.offerLast(root);
        for (int i = 1; i < len; i++) {
            Tree cur = deque.pollFirst();
            if (arr[i] != null){
                Tree left = new Tree(arr[i]);
                cur.left = left;
                deque.offerLast(left);
            }
            i++;
            if (i<len && arr[i]!=null) {
                Tree right = new Tree(arr[i]);
                cur.right = right;
                deque.offerLast(right);
            }
        }
        return root;
    }
    public static void dfs(Tree root){
        if (root!=null){
            dfs(root.left);
            System.out.println(root.val);
            dfs(root.right);
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, null, null, 4, null};
        Tree tree = Tree.creatTree(arr);
        dfs(tree);
    }

}
