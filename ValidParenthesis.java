import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String fir = "()[]{}";
        String fir2 = "{[]}";
        String fir3 = "(]";
        String fir4 = "){";
        System.out.println(isValid(fir));
        System.out.println(isValid(fir2));
        System.out.println(isValid(fir3));
        System.out.println(isValid(fir4));

    }

    public static boolean isValid(String s){
        if(s.length() == 0) return false;

        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(map.containsKey(c))
                stack.push(c);
            else{
                if(stack.size() == 0) return false;
                if(map.get(stack.peek()) == c)
                    stack.pop();
                else
                    return false;
            }
        } 

        if(stack.size() != 0) return false;
        return true;
    }
    // Open brackets must be closed by the same type of brackets.
    // Open brackets must be closed in the correct order.
    // Every close bracket has a corresponding open bracket of the same type.
    // public static boolean isValid(String s) {

    //     if(s.length() == 1) return false;

    //     Map<Character, Character> map = new HashMap<>();
    //     map.put('(', ')');
    //     map.put('[', ']');
    //     map.put('{', '}');

    //     char [] arr = s.toCharArray();
    //     int countO = 0;
    //     int countC = 0;

    //     for(int i = 0; i < arr.length; i++){
    //         if(i + 1 < arr.length){
    //             if(!map.containsKey(arr[i+1])){
    //                 if(arr[i] == '(' && arr[i+1] != ')')
    //                     return false;
    //                 if(arr[i] == '[' && arr[i+1] != ']')
    //                     return false;
    //                 if(arr[i] == '{' && arr[i+1] != '}')
    //                     return false;
    //             }
                
    //         }
    //         if(map.containsKey(arr[i]))
    //             countO++;
    //         if(map.containsValue(arr[i]))
    //             countC++;
    //     }

    //     if(countO != countC) return false;

    //     return true;
    // }
}
