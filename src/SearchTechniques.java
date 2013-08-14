import java.util.*;

public class SearchTechniques {
    private class Node {
        private char data;
        private boolean visited;
        private List<Node> nodeList;
        public Node(char c) {
            this.data = c;
            this.visited = false;
            this.nodeList = new ArrayList<Node>();
        }
        private char getData() {
            return data;
        }

        private boolean isVisited() {
            return visited;
        }

        private void setVisited(boolean visited) {
            this.visited = visited;
        }

        public List<Node> getAdjacentNodes() {
            return this.nodeList;
        }

        public void addAdjacentNode(Node n) {
            this.nodeList.add(n);
        }


    }

    public void bfs(Node rootNode) {
        // Breadth First Search uses Queue data structure
        Queue queue = new LinkedList<Node>();
        queue.add(rootNode);
        printNode(rootNode);
        rootNode.setVisited(true);
        while(!queue.isEmpty()) {
            Node node = (Node)queue.remove();
            for(Node child : node.getAdjacentNodes()) {
                child.setVisited(true);
                printNode(child);
                queue.add(child);
            }
        }

        // !!! we should really clear flag for visited
    }

    public void dfs(Node rootNode) {
        // Depth first search uses Stack data structure
        Stack stack = new Stack();
        stack.push(rootNode);
        rootNode.setVisited(true);
        printNode(rootNode);
        while(!stack.isEmpty()) {
            Node node = (Node) stack.peek();
            for(Node child : node.getAdjacentNodes()) {
                if(child != null) {
                    child.setVisited(true);
                    printNode(child);
                    stack.push(child);
                } else {
                    stack.pop();
                }
            }
        }
        // !!! we should really clear flag for visited
    }

    public void printNode(Node n) {
        System.out.println(n.getData());
    }
}

