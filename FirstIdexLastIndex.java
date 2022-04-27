class Solution {
    public int[] searchRange(int[] nums, int target) {
		
		int[] result = {-1,-1};

		ArrayList<Integer> res = new ArrayList<Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target)
				res.add(i);
		}		
		if(res.size()>=1){
            result[0]= res.get(0);
            result[1]= res.get(res.size()-1);
        }
        
		return result;
    }
}
