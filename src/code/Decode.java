package code;

public class Decode {
	 public int isCorrect(String s){
	        String[] code = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26"};
	        int x = 0;
	        for(String temp:code){
	            if(s.equals(temp)){
	                x = 1;
	                break;
	            }
	            
	        }
	        return x;
	    }
 public int numDecodings(String s) {
     if (s==null) return 0;
     int size = s.length();
     if(size == 0) return 0;
     int[] d = new int[size+1];
     d[0] = 1;
     if(Integer.parseInt(s.substring(0,1))<=26&&Integer.parseInt(s.substring(0,1))>=1){
        d[1] = 1; 
     }else{
        d[1] = 0; 
     }
     
     for (int i = 2; i<size+1 ; i++){
         String lastChar = s.substring(i-1,i);
         
         int x = isCorrect(lastChar);
         int y = isCorrect(s.substring(i-2,i));
         d[i] = x*d[i-1]+y*d[i-2];
         
     }
     
     return d[size];
     
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
