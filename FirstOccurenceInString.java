public class FirstOccurenceInString{
    public static void main(String[] args) {
        int num1 = strStr("sadbutsad", "sad");
        System.out.println("Index of occurence of needle: " + num1);


        int num2 = strStr("abc", "c");
        System.out.println("Index of occurence of needle: " + num2);

    }

    //Big brain solution
    // public static int strStr(String haystack, String needle) {
    //     return haystack.indexOf(needle);
    // }

    //Not cheating solution
    public static int strStr(String haystack, String needle) {
        if(haystack.length() == needle.length())
            return haystack.equals(needle) ? 0 : 1;
        
        char [] arr = haystack.toCharArray();

        for(int i = 0; i < arr.length; i++){
            
            if(arr[i] == needle.charAt(0)){
                if(i + needle.length() <= haystack.length())
                    if(haystack.substring(i, i + needle.length()).equalsIgnoreCase(needle))
                        return i;
            }

        }
        return -1;
    }
}