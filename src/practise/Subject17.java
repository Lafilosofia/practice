import javax.swing.tree.TreeNode;

/**
 * 输入一棵二叉树的根节点，判断该树是不是平衡二叉树。如果某二叉树中任意节点的左右子树的深度相差不超过1，那么它就是一棵平衡二叉树。
 */
public class Subject17 {
    class TreeNode{

      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    //方法一
    public boolean isBalanced(TreeNode root){
        if (root == null) return true;
        return Math.abs(depth(root.left) - depth(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    private int depth(TreeNode root){
        if(root == null){
            return 0;
        }
        return Math.max(depth(root.left), depth(root.right));
    }

}
