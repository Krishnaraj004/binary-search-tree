class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data=data;
        left=right=null;
    }
}
class Tree{
    public void preorder(TreeNode node){    
        if(node==null){
            return;
        }
        System.out.println(node.data+" ");
        preorder(node.left);
        preorder(node.right);
    }
    public void inorder(TreeNode node){
        if(node==null){
            return;
        }
        preorder(node.left);
        System.out.println(node.data+" ");
        preorder(node.right);
    }
    public void postorder(TreeNode node){
        if(node==null){
            return;
        }
        preorder(node.left);
        preorder(node.right);
        System.out.println(node.data+" ");
    }
    public static void main(String args[]){
        TreeNode obj = new TreeNode(1);
        obj.left=new TreeNode(2);
        obj.right=new TreeNode(3);
        obj.left.left=new TreeNode(4);
        obj.left.right=new TreeNode(5);
        obj.left.right.left = new TreeNode(8);
        obj.right.left = new TreeNode(6);
        obj.right.right = new TreeNode(7);
        obj.right.right.left = new TreeNode(9);
        obj.right.right.left = new TreeNode(10);


        Tree res = new Tree();
        System.out.println("Preorder");
        res.preorder(obj);
        System.out.println("Inorder");
        res.inorder(obj);
        System.out.print("Postorder");
        res.postorder(obj);

    }
}
