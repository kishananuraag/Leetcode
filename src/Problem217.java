import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Problem217 {
    public static void main(String[] args)
    {
        Problem217Solution solution = new Problem217Solution();

        //Test cases
        System.out.println(solution.ContainsDuplicate(new int[]{1,2,3,1}));
        System.out.println(solution.ContainsDuplicate(new int[]{1,2,3,4}));
        System.out.println(solution.ContainsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }
}

// Solution using Sets
class Problem217Solution{

    public boolean ContainsDuplicate(int[] nums)
    {
        // 1. Create a set
        Set<Integer> set = new HashSet<>();
        // 2. iterate the array for the current num
        for(int num: nums)
        {
            // 3. check for duplication of current num in the set
                if(set.contains(num))
                {
                    // if found duplication, end of program returning true
                    return true;
                }

                // 4. If there is no duplication, add the current num to the set
                set.add(num);
        }

        // 5. If there is no duplication in the array, return false
        return false;
    }
}

//// Solution using HashMap
//class Problem217Solution {
//    public boolean ContainsDuplicate(int[] nums)
//    {
//        // 1. Creating a HashMap
//        HashMap<Integer,Integer> hm = new HashMap<>();
//
//        // 2. iteration for current number 'Curr'
//        for(int i = 0; i<nums.length; i++)
//        {
//            int Curr = nums[i]; // Current number in the array
//
//            if(hm.containsKey(Curr)) // Checks for duplication of Curr in hm
//            {
//                return true; // returns true if duplication found in list
//            }
//            hm.put(Curr,i);  // If not, add the integer to the list
//
//        }
//        return false; // If no duplication found in the loop, it will return false.
//    }
//}