public class SearchInsertPosition{
    public static void main(String[] args) {
        int x = 0;
        System.out.println("Index of where x will be = " + searchInsert(new int[]{1,3,5,6}, x));
    }

    public static int searchInsert(int[] nums, int target) {
        
        int min = 0;
        int max = nums.length - 1;
        

        while(min <= max){
            int half = min + ((max-min) / 2);

            if(nums[half] == target)
                return half;
            else if(nums[half] < target)
                min = half + 1;
            else
                max = half - 1;

        }

        System.out.println("Overtake!");
        return min;
    }
}