import java.util.Arrays;
//import java.util.HashMap;

public class Problem1{
    public static void main(String[] args) {
        Problem1Solution solution = new Problem1Solution();

        // Test cases
        System.out.println(Arrays.toString(solution.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(solution.twoSum(new int[]{2, 7, 11, 15}, 10)));
    }
    
}

class Problem1Solution{

    public int[] twoSum(int[] nums, int target){
        for(int i = 0; i<nums.length; i++)
        {
            for(int j = i+1; j<nums.length; j++)
            {
                if(nums[i]+nums[j] == target)
                {
                    return new int[] {i,j};
                }
            }
        }

//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++){
////        for (int num : nums){
//            int num = nums[i];
//            int diff = target - num;
//            if (map.containsKey(diff)){
//                return new int[]{map.get(diff), i};
//            }
//            map.put(num, i);
//        }

     return new int[]{-1, -1};
    }
}
