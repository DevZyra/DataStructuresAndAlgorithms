package trees_and_heaps;

public class BinarySearchTree {

    private TreeNode root;


    public void delete(int value){
        root = delete(root,value);
    }
    private TreeNode delete(TreeNode subtreeRoot,int value){
        if(subtreeRoot==null){
            return null;
        }
      if(value < subtreeRoot.getData()){
          subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(),value));
      }else if(value> subtreeRoot.getData()){
          subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), value));
      }else {
          if(subtreeRoot.getLeftChild()==null){
              return subtreeRoot.getRightChild();
          }else if(subtreeRoot.getRightChild() == null){
              return subtreeRoot.getLeftChild();
          }
      }
    return subtreeRoot;

    }


    public int min(){
        if(root==null){
            return Integer.MIN_VALUE;
        }else
            return root.min();
    }
    public int max(){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        else{
            return root.max();
        }
    }

    public TreeNode get(int value){
        if (root!=null){
         root.get(value);
        }
        return null;
    }


    public void insert(int value){
        if(root == null){
            root = new TreeNode(value);
        }
        else {
            root.insert(value);
        }
    }

    public void traverseInOrder(){
        if(root != null){
            root.traverseInOrder();
        }
    }

}
