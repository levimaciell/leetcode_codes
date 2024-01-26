public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};    
        int[] nums2 = {2,5,6};
        int m, n;
        m = 3;
        n = 3;
        merge(nums1, m, nums2, n);
        for (int i : nums1) {
            System.out.print(i + ",");
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int merge = m + n - 1;

        while (p2 >= 0) {
            if(p1 >= 0 && nums1[p1] > nums2[p2])
                nums1[merge--] = nums1[p1--];
            else
                nums1[merge--] = nums2[p2--];
        }
        
    }
}
