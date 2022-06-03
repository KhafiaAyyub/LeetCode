class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> li=new ArrayList<>();
        pre(root,li);
        return li;
    }
    public static void pre(TreeNode root,List<Integer> li){
        if(root==null){
            return;
        }
        li.add(root.val);
        pre(root.left,li);
        pre(root.right,li);
    }
}