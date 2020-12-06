/**
 * Import
 */
import java.util.*;

/**
 * A class that classified students into tear groups
 */
public class YearGroup {

    // creating an instance of the Student class
    Student groupStudent = new Student();

    /**
     * A static class that stores and references data
     * @param <T>
     */
    static class Node<T> {
        /**
         * class instance variables
         */
        Object key;
        Node<Object> left;
        Node<Object> right;

        /**
         * A loaded constructor of the class
         * @param key
         */
        Node(Object key) {
            this.key = key;
            left = null;
            right = null;
        }
    }

    /**
     * Creating a node item
     */
    Node root;
    Node temp = root;

    /**
     * A method that traverses a tree tree from left to right
     * @param temp
     */
    static void inorder(Node temp) {
        if (temp == null)
            return;
        inorder(temp.left);
        System.out.print(temp.key + " ");
        inorder(temp.right);
    }

    /**
     * A method that allows the insertion of a node
     * @param temp
     * @param key
     */
    public void insert(Node temp, Object key) {

        if (temp == null) {
            root = new Node(key);
            return;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(temp);

        // Do level order traversal until we find
        // an empty place.
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();

            if (temp.left == null) {
                temp.left = new Node(key);
                break;
            } else
                q.add(temp.left);

            if (temp.right == null) {
                temp.right = new Node(key);
                break;
            } else
                q.add(temp.right);
        }
    }


    /**
     * A method to get all the leaves of th tree.
     * @param root
     */
    public void PrintLeafLeftToRight(Node root) {
        // Stack to store all the nodes of tree
        Stack<Node> allStudents = new Stack<>();

        // Stack to store all the leaf nodes
        Stack<Node> leaves = new Stack<>();

        // Push the root node
        allStudents.push(root);

        while (!allStudents.empty()) {
            Node curr = allStudents.peek();
            allStudents.pop();

            // If current node has a left child
            // push it onto the first stack
            if (curr.left != null)
                allStudents.push(curr.left);

            // If current node has a right child
            // push it onto the first stack
            if (curr.right != null)
                allStudents.push(curr.right);

                // If current node is a leaf node
                // push it onto the second stack
            else if (curr.left == null && curr.right == null)
                leaves.push(curr);
        }

        // Print all the leaf nodes
        while (!leaves.empty()) {
            System.out.print(leaves.peek().key + " ");
            leaves.pop();
        }
    }

}
