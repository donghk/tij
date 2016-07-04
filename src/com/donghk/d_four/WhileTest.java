package com.donghk.d_four;

public class WhileTest {
	
	static boolean condition(){
		boolean result = Math.random() < 0.099;
		System.out.println(result + ", ");
		return result;
	}
	
	public static void main(String[] args) {
		while(condition())
			System.out.println("Inside while");
		System.out.println("Outside while");
		
		do
			System.out.println("Inside do while");
		while(condition());
		System.out.println("Outside do while");
	}
}
