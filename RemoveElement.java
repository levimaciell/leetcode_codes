public class RemoveElement {
    public static void main(String[] args) {
        int [] nums = {0,1,2,2,3,0,4,2};
        System.out.println("Result=" + removeElement(nums, 2));
    }

    //My Solution
    //Complexity: O(n²)
    
    // public static int removeElement(int[] nums, int val) {
    //     int k = 0;

    //     for (int i = 0; i < nums.length; i++) {
    //         if(nums[i] == val){
    //             for (int j = nums.length - 1; j >= k; j--) {
    //                 if(nums[j] != val){
    //                     int swap = nums[i];
    //                     nums[i] = nums[j];
    //                     nums[j] = swap;
    //                     break;
    //                 }
    //             }
    //         }
    //         if(nums[i] != val){
    //             k++;
    //         }
    //         System.out.println(nums[i]);
    //     }

    //     return k;
    // }

    //Better solution(index only changes if the value is not val, so this keeps track of all pointers.)
    //Complexity: O(N)
    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }

        for(int j : nums) System.out.println(j);

        return index;
    }

}
