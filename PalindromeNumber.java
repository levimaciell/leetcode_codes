public class PalindromeNumber {
    
    public static void main(String[] args) {
        int num = 121;
        boolean isPal = PalindromeNumber.isPalindrome(num);

        if(isPal)
            System.out.println(num + " is a palindrome ");
        else
            System.out.println(num + " is not a palindrome");

    }

    //Converting to a string 
    // public static boolean isPalindrome(int x) {
    //     if(x < 0)
    //         return false;

    //     String num = Integer.toString(x);
    //     char[] arr = num.toCharArray();
    //     String reverse = "";

    //     for(int i = num.length() - 1; i >= 0; i--){
    //         reverse += arr[i];
    //     }
        
    //     return reverse.equals(num);
    // }

    //Using stringbuilder
    // public static boolean isPalindrome(int x) {
    //     StringBuilder sb = new StringBuilder("" + x);
    //     return sb.reverse().toString().equals("" + x);
    // }

    //Using only nums
    public static boolean isPalindrome(int x) {
        
        int num = x;
        int reversed = 0;
        int digit;

        while(num != 0){
            digit = num % 10;
            reversed = (reversed * 10) + digit;
            num /= 10;
        }
        return reversed == x;

    }
}
