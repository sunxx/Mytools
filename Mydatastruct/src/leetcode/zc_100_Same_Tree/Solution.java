/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null||q==null)
        {
            if(p==null&&q==null)
                return true;
            else
                return false;
        }
        else
        {
            if((p.val==q.val)&&isSameTree(p.left,q.left)&&isSameTree(p.right,q.right))
                return true;
            else
                return false;
        }
    }
}