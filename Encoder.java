import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Encoder {
    private final DynamicHeap heap;
    private final String text;
    final HashMap<String,Character> outMap;
    final StringBuilder binEq;
    public Encoder(HuffmanCode object) {
        this.binEq = new StringBuilder();
        this.outMap = new HashMap<>();
        this.heap = object.heap;
        this.text = object.text;
    }
    public String encodeText() {
        while(heap.getSize()>1) {
            Node first = heap.remove();
            Node second = heap.remove();
            Node join = Node.joinNode(first,second);
            heap.insert(join);
        }

        Node root = heap.remove();

        for (int i=0; i<text.length();i++) {
            StringBuilder str = new StringBuilder();
            char ch = text.charAt(i);
            str.append(root.getBinaryEquivalent("" + ch));
            binEq.append(str);
            outMap.put(str.toString(), ch);
        }

        return binEq.toString();
    }

    public void write(String file) {
        try(FileWriter fw = new FileWriter(file)) {
            fw.write(binEq.toString());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
