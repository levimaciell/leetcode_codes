import java.util.HashMap;

public class TwoSum{

    public static void main(String[] args) {
        TwoSum s = new TwoSum();
        int [] arr = s.twoSum(new int[] {3,2,3}, 6);

        if(arr == null)
            System.out.print("Arr is null");
        else{
            System.out.println("result");
            for (int i : arr) {
                System.out.println(i);
            }
        }
        
    }

    //BRUTEFORCE O(N²)
    // public int[] twoSum(int[] nums, int target) {
    //     for(int i = 0; i < nums.length; i++){
    //         for(int j = i+1; j < nums.length; j++){
    //             if (nums[j] + nums[i] == target) {
    //                 int [] arr = {i, j};
    //                 return arr;
    //             }
    //         }
    //     }
    //     return null;    
    // }

    //HASHMAP
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){

            int comp = target - nums[i];
            if(map.containsKey(comp)){
                return new int[]{map.get(comp), i};
            }
            map.put(nums[i], i);
        }
        return null;    
    }

}