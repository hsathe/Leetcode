package TwoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public int[] twoSum(int[] nums, int target){
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] result = new int[2];
		
		for(int i=0;i<nums.length;i++){
			int key = target - nums[i];
			
			if(map.containsKey(key)){
				result[0] = map.get(key);
				result[1] = i;
				return result;
			}else{
				map.put(nums[i], i);
			}
		}
		
		return result;
	}
	public static void main(String[] args) {
		TwoSum solution = new TwoSum();
		int[] nums = {2,4,7,8};
		int[] result = solution.twoSum(nums, 10);
		System.out.println(result[0] + " " + result[1]);
	}

}
