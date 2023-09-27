package tree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: xutao
 * @Date: 2023/05/30 10:44
 * @Version 1.0
 * @Description:
 */
public class DelNodes {
    List<TreeNode> ans = new ArrayList<>();
    Set<Integer> set = new HashSet<>();
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        for (int i : to_delete) {
            set.add(i);
        }
        dfs(root, true);
        return  ans;
    }

    private TreeNode dfs(TreeNode root, boolean isRoot) {
        if (root == null) return null;
        boolean isDel = set.contains(root.val);
        root.left = dfs(root.left, isDel);
        root.right = dfs(root.right, isDel);
        if (isDel){
            return null;
        }else{
            if (isRoot) ans.add(root);
            return root;
        }
    }

    public static void main(String[] args) {
        Integer[] node = {1,2,3,4,5,6,7};
        TreeNode treeNode = TreeNode.creatTree(node);
        DelNodes delNodes = new DelNodes();
        delNodes.delNodes(treeNode, new int[]{1});
        for (TreeNode an : delNodes.ans) {
            TreeNode.dfs(an);
        }
    }
}
