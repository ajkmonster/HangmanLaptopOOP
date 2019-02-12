import java.util.ArrayList;

public class IntCharNumber {
    private String[] list;
    public IntCharNumber (){
       list = new String[]{"","","","","","","","","","",""};
    }
    public String[] getList() {
        return list;
    }
    public void setList(String[] splitStr) {
        for (int i = 0; i < splitStr.length; i++) {
            list[i] = "-";
        }
    }
}
