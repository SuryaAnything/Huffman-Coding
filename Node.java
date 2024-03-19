
public class Node implements Comparable<Node> {
    protected String str;
    protected int value;
    public Node left;
    public Node right;

    private static StringBuilder binEq = new StringBuilder();
    public Node(String str, int frequency) {
        this.str = str;
        this.value = frequency;
        this.left = null;
        this.right = null;
    }

    public static Node joinNode(Node n1, Node n2) {
        String combinedStr = n1.str + n2.str;
        int combinedInt = n1.value + n2.value;
        Node joinedNode = new Node(combinedStr, combinedInt);

        if (n1.value>n2.value) {
            joinedNode.right = n1;
            joinedNode.left = n2;
        }
        else {
            joinedNode.right = n2;
            joinedNode.left = n1;
        }

        return joinedNode;
    }

    public StringBuilder getBinaryEquivalent(String ch) {
        if (this.str.equals(ch) || this.left==null || this.right==null) {
            StringBuilder retValue = binEq;
            binEq = new StringBuilder();
            return retValue;
        }
        else {
            if(this.left.str.contains(ch)){
                binEq.append("0");
                return this.left.getBinaryEquivalent(ch);
            }
            else {
                binEq.append("1");
                return this.right.getBinaryEquivalent(ch);
            }
        }
    }




    @Override
    public int compareTo(Node o) {
        return Integer.compare(this.value, o.value);
    }

}
