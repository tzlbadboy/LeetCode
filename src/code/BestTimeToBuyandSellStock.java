package code;

public class BestTimeToBuyandSellStock {
	 public static int maxProfit(int[] prices) {
		 if (prices == null){
			 return 0;
		 }
	     int size = prices.length;
	     if(size == 0){
	    	 return 0;
	     }
	     
	     int[] d = new int[size];
	     
	    // d[0] = 0;
	    // d[1] = prices[1] -prices[0];数组不一定有2个元素
	     int min = prices[0];
	     int ans = 0;
	     for(int i = 0; i<size; i++){
	    	 d[i] = prices[i] - min;
	    	 ans = Math.max(ans, d[i]);
	    	 min = Math.min(min, prices[i]);
	    
	    	 
	     }
	     
		 return ans;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
