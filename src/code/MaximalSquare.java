package code;

public class MaximalSquare {
	 public static int maximalSquare(char[][] matrix) {
		 if (matrix == null) return 0;
		 int rowNum = matrix.length;
		 if (rowNum == 0) return 0;
		 int colNum = matrix[0].length;
		 if (rowNum == 0 || colNum == 0) return 0;
		 int[][] dp = new int[rowNum ][colNum];
		 
		 for (int i = 0; i < rowNum ;i++)
			 for(int j =0; j < colNum; j++){
				 dp[i][j] = Integer.valueOf(matrix[i][j]) - 48;
			 }
		 
		 int ans = 0;
		 for (int i = 0; i < rowNum ;i++){
			 for(int j = 0; j < colNum; j++){
				 if(i > 0 && j > 0 && dp[i][j] == 1){
					
					 dp[i][j] = Math.min(Math.min(dp[i][j-1], dp[i-1][j]), dp[i-1][j-1]) + 1;
				 }
				ans = Math.max(ans, dp[i][j]);
			 }
		 }
		 
		 
		 return ans*ans;
	        
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] matrix = {{'1','0' ,'1', '0', '0'},{'1','0' ,'1', '1', '1'},{'1','1' ,'1', '1', '1'},{'1','0' ,'0', '1', '0'}};
		System.out.println(maximalSquare(matrix) );
	}

}
