import java.util.ArrayList;
import java.util.Random;

public class RandomGenerator extends InitializeWords{
    private int index;
    public void setIndex() {
        setWords();
        Random random = new Random();
        index = random.nextInt(getWords().size());
    }
    public int getIndex() {
        return index;
    }

}
