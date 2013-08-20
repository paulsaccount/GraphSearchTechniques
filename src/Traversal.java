/**
 * Traversal for Post-Order, Pre-Order, and In-Order Techniques
 */
public class Traversal {
    private class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
        }

        private int getData() {
            return data;
        }

        private void setData(int data) {
            this.data = data;
        }

        private Node getLeft() {
            return left;
        }

        private void setLeft(Node left) {
            this.left = left;
        }

        private Node getRight() {
            return right;
        }

        private void setRight(Node right) {
            this.right = right;
        }
    }

    /**
     * Just print out the tree in In-Order fashion
     * @param node
     */
    public void inOrder(Node node) {
        if(node == null) return;

        inOrder(node.left);
        System.out.println(node.data);
        inOrder(node.right);
    }

    /**
     * Just print out the tree in Pre-Order fashion
     * @param node
     */
    public void preOrder(Node node) {
        if(node == null) return;

        System.out.println(node.data);
        preOrder(node.left);
        preOrder(node.right);
    }


    /**
     * Just print out the tree in Post-Order fashion
     * @param node
     */
    public void postOrder(Node node) {
        if(node == null) return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data);
    }

}
