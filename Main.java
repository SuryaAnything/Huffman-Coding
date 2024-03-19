import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        HuffmanCode hc = new HuffmanCode();
        hc.input("input.txt");
        Encoder encode = new Encoder(hc);
        String encoded = encode.encodeText();
        encode.write("output.txt");
        Decoder dec = new Decoder(encode);
    }
}
