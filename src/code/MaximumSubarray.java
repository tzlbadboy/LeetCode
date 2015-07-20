package code;

public class MaximumSubarray {
	 public static int maxSubArray(int[] nums) {
	        if (null == nums) return 0;
	        int size = nums.length;
	        if (size == 0) return 0;
	        int[] d = new int[size];
	        d[0] = nums[0];
	        int ans = d[0];
	        for(int i = 1; i<size ; i++){
	        	System.out.println(".....");
	        	
	            if(d[i-1]<0){
	                d[i] = nums[i];
	            }else{
	                d[i] = d[i-1] + nums[i];
	            }
	            ans = Math.max(ans,d[i]);
	        }
	        return ans;
	        
	        
	        
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1};
		maxSubArray(nums);
		for(int x = 3; x<2; x++){
			System.out.print(1);
		}

	}

}
