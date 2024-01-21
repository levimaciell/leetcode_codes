import java.util.ArrayList;
import java.util.List;

public class PlusOne {
    public static void main(String[] args) {
        // int [] digits = {1,2,3};
        //int [] digits = {9};
        // int [] digits = {4,3,2,1};
        int [] digits = {9,9,9};


        // System.out.print("Digits + 1 = ");
        for(int i : plusOne(digits)) System.out.print(i + ",");
        // System.out.println();



    }
    public static int[] plusOne(int[] digits) {
        int carry = 0;
        List<Integer> list = new ArrayList<>(digits.length + 1);

        for(int i = digits.length - 1; i >= 0; i--){
            
            if(i == digits.length - 1){
                //i == 9 then carry + 1 and act = 0;
                if(digits[i] == 9){
                    carry = 1;
                    list.addFirst(0);
                }
                else{
                    list.addFirst(digits[i] + 1);
                }
            }
            //Not in first case
            else{
                //to sum, carry must be greater than 0
                if(carry > 0){
                    //If actual == 9. If not, just sum and set carry to 0
                    if(digits[i] == 9){
                        carry = 1;
                        list.addFirst(0);
                    }
                    else{
                        list.addFirst(digits[i] + carry);
                        carry = 0;
                    }
                }
                else{
                    list.addFirst(digits[i]);
                }
            }
        }
        
        if(carry > 0){
            list.addFirst(1);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();

    }
}
