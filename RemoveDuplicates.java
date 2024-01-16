public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println("Number of uniques: " + removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));

        System.out.println("Number of uniques: " + removeDuplicates(new int[]{1,1}));

    }

    public static int removeDuplicates(int[] nums) {

        int k = 0;
        int unique = -1;

        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                k++;
                unique = i;
            }
            else{
                if(nums[i] != nums[unique]){
                    int swap = nums[unique+1];
                    nums[unique+1] = nums[i];
                    nums[i] = swap;
                    unique++;
                    k++;
                }
            }
                
        }

        return k;
    }
}
