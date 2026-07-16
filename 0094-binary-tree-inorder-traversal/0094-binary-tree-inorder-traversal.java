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
    public List<Integer> inorderTraversal(TreeNode root) {
        List <Integer> shr=new ArrayList<>();
        inorder(root,shr);
        return shr;
        
    } 
    
     void inorder(TreeNode root, List<Integer> shr){
        if(root==null) return;
        inorder(root.left,shr);
        shr.add(root.val);
        inorder(root.right,shr);
    }
}