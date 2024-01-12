import java.util.HashMap;
import java.util.Map;

public class RomanToInt{

    public static void main(String[] args){
        System.out.println(romanToInt("MCMXCIV"));
    }

    //I, V, X, L, C, D, M, 
    //IV, IX, XL, XC, CD, CM
    public static int romanToInt(String s) {
        int sum = 0;

        Map<Character, Integer> milan = new HashMap<>();
        milan.put('I', 1);
        milan.put('V', 5);
        milan.put('X', 10);
        milan.put('L', 50);
        milan.put('C', 100);
        milan.put('D', 500);
        milan.put('M', 1000);

        char [] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++){
            
            if(i > 0){
                char prev = arr[i - 1];
                if((arr[i] == 'V' || arr[i] == 'X') && prev == 'I')
                    continue;
                if((arr[i] == 'C' || arr[i] == 'L') && prev == 'X')
                    continue;
                if((arr[i] == 'D' || arr[i] == 'M') && prev == 'C')
                    continue;
            }

            if(i + 1 != arr.length){
                if(arr[i] == 'I' && (arr[i+1] == 'V' || arr[i+1] == 'X'))
                    sum += milan.get(arr[i+1]) - milan.get(arr[i]);

                else if(arr[i] == 'X' && (arr[i+1] == 'L' || arr[i+1] == 'C'))
                    sum += milan.get(arr[i+1]) - milan.get(arr[i]);

                else if(arr[i] == 'C' && (arr[i+1] == 'D' || arr[i+1] == 'M'))
                    sum += milan.get(arr[i+1]) - milan.get(arr[i]);
                else
                    sum += milan.get(arr[i]);
            }
            else{
                sum += milan.get(arr[i]);
            }
        }
            
        return sum;
        
    }
}