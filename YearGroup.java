import java.util.*;

public class YearGroup {
    Student groupStudent = new Student();

    /* A binary tree node has key, pointer to
    left child and a pointer to right child */
    static class Node<T> {
        Object key;
        Node<Object> left;
        Node<Object> right;

        // constructor
        Node(Object key) {
            this.key = key;
            left = null;
            right = null;
        }
    }

    Node root;
    Node temp = root;

    /* Inorder traversal of a binary tree*/
    static void inorder(Node temp) {
        if (temp == null)
            return;

        inorder(temp.left);
        System.out.print(temp.key + " ");
        inorder(temp.right);
    }

    /*function to insert element in binary tree */
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


    public void PrintLeafLeftToRight(Node root) {
        // Stack to store all the nodes of tree
        Stack<Node> s1 = new Stack<>();

        // Stack to store all the leaf nodes
        Stack<Node> s2 = new Stack<>();
        ;

        // Push the root node
        s1.push(root);

        while (!s1.empty()) {
            Node curr = s1.peek();
            s1.pop();

            // If current node has a left child
            // push it onto the first stack
            if (curr.left != null)
                s1.push(curr.left);

            // If current node has a right child
            // push it onto the first stack
            if (curr.right != null)
                s1.push(curr.right);

                // If current node is a leaf node
                // push it onto the second stack
            else if (curr.left == null && curr.right == null)
                s2.push(curr);
        }

        // Print all the leaf nodes
        while (!s2.empty()) {
            System.out.print(s2.peek().key + " ");
            s2.pop();
        }
    }

}
