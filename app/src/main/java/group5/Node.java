package group5;

public class Node implements Comparable<Node> {
    private Integer n;
    private Node left, right;

    public Node(Integer n) {
        this.n = n;
        left = null;
        right = null;
    }

    public static Node mitosis(Node l, Node r) {
        temp.left = l;
        temp.right = r;
        return temp;
    }

    @Override
    public int compareTo(Node n) {
        return this.frequency.compareTo(n.frequency);
    }
}
