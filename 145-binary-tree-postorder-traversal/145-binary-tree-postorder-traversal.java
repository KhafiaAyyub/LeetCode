class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> li=new ArrayList<>();
        post(root,li);
        return li;
    }
    public static void post(TreeNode root,List<Integer> li){
        if(root==null){
            return;
        }
        
        post(root.left,li);
        post(root.right,li);
        li.add(root.val);
    }
}