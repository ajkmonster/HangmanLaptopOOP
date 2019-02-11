import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class InitializeWords {
    private  ArrayList<String> words;
    public InitializeWords() {
        words = new ArrayList<>();

    }

    public ArrayList<String> getWords() {
        return words;
    }

 public void setWords() {
     Collections.addAll(words, "tree", "rain", "bear", "encourage", "promise", "soup", "chess",
             "insurance", "pancakes", "stream");
 }
}
