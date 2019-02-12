import java.util.ArrayList;
import java.util.Random;

public class RandomGenerator {
    private int index;

    public void setIndex(ArrayList<String> words) {
        Random random = new Random();
        index = random.nextInt(words.size());
    }

    public int getIndex() {
        return index;
    }

}
