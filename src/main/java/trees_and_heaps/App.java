package trees_and_heaps;

public class App {
    public static void main(String[] args) {


        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(25);
        bst.insert(20);
        bst.insert(22);
        bst.insert(27);
        bst.insert(26);
        bst.insert(15);
        bst.insert(17);
        bst.insert(29);
        bst.insert(30);
        bst.insert(32);


        bst.traverseInOrder();

        System.out.println("Minimal Value:");
        System.out.println(bst.min());




    }
}
