class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> li=new ArrayList<Integer>();
        if(root == null) //empty tree
            return li; 
        Stack<TreeNode> st = new Stack<TreeNode>();
        st.push(root);
        while(!st.isEmpty()){
            root = st.pop();
            li.add(root.val);
        if(root.right != null){
            st.push(root.right);
        }
        if(root.left != null){
            st.push(root.left);
        }
    }
        return li;
    }
}
   
 