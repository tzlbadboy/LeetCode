package code;

import java.util.HashSet;
import java.util.Set;

public class RoberExtension {
	public static int rob(int[] nums) {
        if(nums == null) return 0;
        int size = nums.length;
        if (size == 0) return 0;
        int maxElement = nums[0];
        int maxElementIndex = 0;
        for (int i = 1 ; i < size ; i++){
           if(maxElement < nums[i]){
               maxElement = nums[i];
               maxElementIndex = i;
           }
        }
        int[] firstD = new int[size+1];
        int[] secondD = new int[size+1];
        int temp = maxElementIndex;
        for(int i = 0 ; i < size + 1 ; i++){
            if(temp >= size){
                temp = 0;
            }
            if(i == 0) {
                firstD[i] = 0;
                
            }else if(i == 1) {
                firstD[i] = maxElement;
                temp = temp + 1;
            }else {
            firstD[i] = Math.max(firstD[i-1],firstD[i-2] + nums[temp]);
            temp = temp + 1;
            }
        }
        int temp2 = maxElementIndex;
        for(int i = 0 ; i < size + 1 ; i++){
            if(temp2 < 0){
                temp2 = size -1;
            }
            if(i == 0) {
                secondD[i] = 0;
                
            }else if(i == 1) {
                secondD[i] = maxElement;
                temp2 = temp2 - 1;
            }else {
            secondD[i] = Math.max(secondD[i-1],secondD[i-2] + nums[temp2]);
            temp2 = temp2 - 1;
            }
        }
        return Math.max(firstD[size],secondD[size]);
        
        
    }

	public static void main(String[] args) {
		int[] nums = {1,1,1};
		System.out.println(rob(nums));
		
		Set a = new HashSet();
		
		// TODO Auto-generated method stub

	}

}
