package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: xutao
 * @Date: 2023/06/04 22:19
 * @Version 1.0
 * @Description:
 */
public class Order {
    public List<Integer> preOder(TreeNode treeNode){
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (treeNode == null) return ans;
        stack.add(treeNode);
        while(!stack.isEmpty()){
            TreeNode cur = stack.pop();
            ans.add(cur.val);
            if (cur.right!=null) stack.add(cur.right);
            if (cur.left != null) stack.add(cur.left);
        }
        return ans;
    }

    public List<Integer> inOder(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) return ans;
        TreeNode cur = root;
        while(!stack.isEmpty() || cur!=null){
            if (cur!=null){
                stack.add(cur);
                cur = cur.left;
            }else{
                TreeNode tem = stack.pop();
                ans.add(tem.val);
                cur = tem.right;
            }
        }
        return ans;
    }
    public List<Integer>  postOrder (TreeNode root){
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) return ans;
        stack.add(root);
        while(!stack.isEmpty()){
            TreeNode cur = stack.pop();
            ans.add(cur.val);
            if (cur.left != null) stack.add(cur.left);
            if (cur.right!=null) stack.add(cur.right);
        }
        Collections.reverse(ans);
        return ans;
    }

    public List<Integer>  postOrder2 (TreeNode root){
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root, r = null;

        while(!stack.isEmpty() || cur!=null){
            if (cur!=null){
                stack.push(cur);
                cur=cur.left;
            }else {
                TreeNode tem = stack.peek();
                if (tem.right == null || tem.right == r){
                    ans.add(tem.val);
                    r = tem;
                    stack.pop();
                    cur = null;
                }else {
                    cur = tem.right;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.creatTree(new Integer[]{1,2,3});
        List<Integer> list = new Order().postOrder2(root);
        System.out.println(list);
    }
}
