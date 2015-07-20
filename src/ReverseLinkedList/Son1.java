package ReverseLinkedList;

import other.Da;

public class Son1 extends fatherson {
	public int c = 3;
	public void m2(){
		System.out.println(c);
		
	}
	
	public void m3(){
		System.out.println(c);
	}
	
	public static void main(String [] args){
		Son1 fa = (Son1)new fatherson();
		fa.m3();
		
		System.out.println();
	}
}
