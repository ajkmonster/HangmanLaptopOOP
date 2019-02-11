public class IntCharNumber extends LettersofWord {
    private String[] list;
    public IntCharNumber (){
       list = new String[]{"","","","","","","","","","",""};
    }
    public String[] getList() {
        return list;
    }
    public void setList() {
        setSplitStr();
        for (int i = 0; i < getSplitStr().length; i++) {
            list[i] = "-";
        }

    }
}
