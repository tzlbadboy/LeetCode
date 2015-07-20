package code;

public class UniqueBinarySearchTrees {
	
	    public static int numTrees(int n) {
	    	if(n == 0) return 0;
	    	if(n == 1) return 1;
	    	if(n == 2) return 2;
	    	int[] d = new int[n+1];
	    	d[0] = 1; d[1] = 1; 
	    	for(int i = 2; i < n+1; i++){
	    		d[i] = 0;
	    		//System.out.println("\n");
	    		//System.out.println(i);
	    		for(int j = 0; j < i; j++){
	    			//System.out.println(j);
	    			//System.out.println(i-j-1);
	    			d[i] = d[i] + d[j]*d[i-j-1];
	    		
	    		}
	    	}
	    	
	    	return d[n];
	    	
	    			
	        
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numTrees(3));

	}

}
