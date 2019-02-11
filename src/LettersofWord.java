public class LettersofWord extends RandomGenerator {

private String[] splitStr;
public LettersofWord(){
   splitStr = new String[]{};
}
    public String[] getSplitStr() {
        return splitStr;
    }

    public void setSplitStr() {
        setIndex();
        splitStr = getWords().get(getIndex()).split("");
        this.splitStr = splitStr;
    }
}
