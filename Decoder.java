import java.util.HashMap;

public class Decoder extends HuffmanCode {
    private final HashMap<String,Character> outMap;
    private final StringBuilder binEq;
    public Decoder(Encoder object) {
        this.outMap = object.outMap;
        this.binEq = object.binEq;
    }
    public String decode() {

        StringBuilder decode = new StringBuilder();
        StringBuilder outText = new StringBuilder();
        for (int i=0; i<binEq.toString().length(); i++) {
            char ch = binEq.toString().charAt(i);
            decode.append(ch);
            if (outMap.containsKey(decode.toString())) {
                outText.append(outMap.get(decode.toString()));
                decode = new StringBuilder();
            }
        }

        return outText.toString();
    }
}
