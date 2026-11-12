import java.lang.reflect.Array;
import java.util.Arrays;

public class Ticket {
    private Block[] blocks;

    public Ticket(int numBlocks) {
        blocks = new Block[numBlocks];
        for (int i = 0; i < blocks.length; i++) {
            blocks[i] = new Block(6);
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < blocks.length; i++) {
            s += blocks[i] + "\n";
        }
        return s;
    }

    public String printUsedNumbers() {

        for (int i = 0; i < blocks.length; i++) {

        }
    }
}
