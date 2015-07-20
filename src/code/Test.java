package code;

public class Test {
	public static int max(int a,int b){
		int s = 0;
		if(a >= b){
			s = a;
		}
		else{
			s = b;
		}
		return s ;
		
	}
	
	public int findMax(int[] a,int n){
		
		if(n == 0) return 0;
		if(n == 1) return a[0];
		if(n == 2) return max(a[0],a[1]);
		int S1= this.findMax(a, n-1);
		int S2 = this.findMax(a, n-2);
		return Math.max(S1, S2+a[n-1]);
		
		
	}
	public int solution(int[] a){
		if(a == null){
			return 0;
		}
		int n = a.length;
		int max = this.findMax(a, n);
		
		return max;
	}
	public static void main(String [] args){
		int[] a = new int[0];
		int[] b = null;
		int[] c = {1,4,2,1,1,8,9};
		Test test = new Test();
		System.out.println(a.length+"\n");
		
		//System.out.println(test.solution(a));
		System.out.println(test.solution(b));
		System.out.println(test.solution(c));
		
		
		
	}

}
