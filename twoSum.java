package ArraysAllQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int req_num=target-nums[i];
            if(map.containsKey(req_num))
            {
                return new int[]{map.get(req_num),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};

    }
    public static void main(String[] args) {
        int[] nums=new int[] {2,0,11,15};
        int target=9;
        System.out.println(Arrays.toString(new twoSum().twoSum(nums,target)));

    }
}
