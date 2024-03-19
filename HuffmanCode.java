
import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HuffmanCode {
    protected HashMap<String,Character> outMap;
    protected String text;
    protected DynamicHeap heap;
    public void input(String fileName) throws IOException {
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        StringBuilder content = new StringBuilder();
        while (br.ready()) {
            content.append(br.readLine());
            content.append('\n');
        }
        text = content.toString();

        HashMap<Character,Integer> map = new HashMap<>();
        for (int i=0; i<text.length(); i++) {
            char ch = text.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch,map.get(ch)+1);
            }
            else {
                map.put(ch,1);
            }
        }

        Iterator<Map.Entry<Character,Integer>> itr = map.entrySet().iterator();

        heap = new DynamicHeap();

        while (itr.hasNext()) {
            Map.Entry<Character,Integer> entry = itr.next();
            Node node1 = new Node(""+entry.getKey(),entry.getValue());
            heap.insert(node1);
        }
    }
}
