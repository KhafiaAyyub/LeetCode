/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
     int count = 0;
    public int sumOfLeftLeaves(TreeNode root) {
       sum(root);
        return count;
    }
    
    private void sum(TreeNode root){
        if(root == null)
            return;
        if(isLeafNode(root.left))
           count += root.left.val;
         
           sum(root.left);
           sum(root.right);
    }
           
           public static boolean isLeafNode(TreeNode root){
               if(root == null)
                   return false;
               if(root.left == null && root.right == null)
                   return true;
               
               return false;
           }
        
    }
