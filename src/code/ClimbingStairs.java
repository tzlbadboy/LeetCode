package code;

public class ClimbingStairs {
	public static int climbStairs(int n) {
		if (n == 0) return 0;
		if (n == 1) return 1;
		if (n == 2 ) return 2;
		int[] d = new int[n+1];
		d[0] = 0; d[1] = 1; d[2] = 2;
		for(int i = 3; i<n+1 ;i++){
			d[i] =  d[i-2] + d[i-1];
		}
		return d[n];
		
		
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		
		System.out.println(climbStairs(n));

	}

}
