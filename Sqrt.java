public class Sqrt {
    public static void main(String[] args) {
        // System.out.println(46340 * 46340);
        System.out.println(mySqrt(8));
        System.out.println(mySqrt(2147395599));
    }
    // BruteForce Way
    public static int mySqrt(int x) {
        
        int closest = 0;
        int diff = Integer.MAX_VALUE;
        int actDiff;
        int maxRange = x > 46340? 46340 : x;

        for(int i = 0; i <= maxRange ; i++){
            int power = i * i;
            
            if(power <= x && power > 0){
                actDiff = x - power;

                if(i == 0) diff = actDiff;
                else{
                    if(actDiff < diff){
                        diff = actDiff;
                        closest = i;
                    } 
                }
            }
        }

        return closest;
    }
}    
    