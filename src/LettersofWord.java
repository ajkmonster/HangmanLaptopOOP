import java.util.ArrayList;

public class LettersofWord {

private String[] splitStr;
public LettersofWord(){
   splitStr = new String[]{};
}
    public String[] getSplitStr() {
        return splitStr;
    }

    public void setSplitStr(ArrayList<String> words,int index) {
    splitStr = words.get(index).split("");
    }
}
