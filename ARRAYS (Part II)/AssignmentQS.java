/* Ans 1 */

// import java.util.Scanner;

// public class AssignmentQS {

//     public static boolean containDuplicate(int[] nums){
//         for(int i=0; i<nums.length; i++){
//             for(int j=i+1; j<nums.length; j++){
//                 if(nums[i] == nums[j]){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // take size of array
//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();

//         int nums[] = new int[n];

//         //take array input
//         System.out.println("Enter " +n+ " elements:");
//         for(int i=0; i<n; i++){
//             nums[i] = sc.nextInt();
//         }
//         // check duplicates
//         System.out.println("Contains duplicate? " +containDuplicate(nums));

//         sc.close();
//     }
// }


// // Time Complexity : Brute Force Method : O(n^2)


/* Ans 2 */

// public class AssignmentQS {

//     public static int search(int[] nums, int target) {
//         int left = 0, right = nums.length - 1;

//         while (left <= right) {
//             int mid = left + (right - left) / 2;

//             // target found
//             if (nums[mid] == target) {
//                 return mid;
//             }

//             // Check if left half is sorted
//             if (nums[left] <= nums[mid]) {
//                 if (target >= nums[left] && target < nums[mid]) {
//                     right = mid - 1; // search left
//                 } else {
//                     left = mid + 1; // search right
//                 }
//             }
//             // Otherwise right half is sorted
//             else {
//                 if (target > nums[mid] && target <= nums[right]) {
//                     left = mid + 1; // search right
//                 } else {
//                     right = mid - 1; // search left
//                 }
//             }
//         }

//         return -1; // not found
//     }

//     public static void main(String[] args) {
//         int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
//         int target1 = 0;
//         System.out.println("Output: " + search(nums1, target1)); // 4

//         int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
//         int target2 = 3;
//         System.out.println("Output: " + search(nums2, target2)); // -1
//     }
// }



/* Ans 3  - 3Sum*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AssignmentQS8 {

    public List<List<Integer>> threeSum(int[] nums){
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>>ans = new ArrayList<>();
        Set<List<Integer>>s = new HashSet<>();

        for(int i=0; i<n-2; i++){
            int low = i+1;
            int high = n-1;
            while (low<high) {
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0){
                    s.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;
                } else if (sum<0){
                    low++;
                } else {
                    high--;
                }
            }
        }
        ans.addAll(s);
        return ans;
    }

     public static void main(String[] args) {
        int[] nums = {-4, -1, -1, 0, 1, 2};

        AssignmentQS8 obj = new AssignmentQS8(); 
        List<List<Integer>> result = obj.threeSum(nums);

        System.out.println(result);
    }

}


