import java.util.ArrayList;
import java.util.List;

public class LengthOfLastWord{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello World");
        list.add("   fly me   to   the moon  ");
        list.add("luffy is still joyboy");

        for(String s : list){
            System.out.println("The lenght of last word is = " + lengthOfLastWord(s));
            System.out.println("String = " + s);
        }
    }

    public static int lengthOfLastWord(String s) {

        String alt = s.strip();
        String [] arr = alt.split(" ");

        return arr[arr.length - 1].length();
    }
}