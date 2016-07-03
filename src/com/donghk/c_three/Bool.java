package com.donghk.c_three;

import java.util.Random;

/**
 * 逻辑操作符
 * @author donghk
 *
 */
public class Bool {
	
	public static void main(String[] args) {
		
		Random rand = new Random(37);
		int i = rand.nextInt(100);
		int j = rand.nextInt(100);
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("i > j is " + (i > j));
		System.out.println("i < j is " + (i < j));
		System.out.println("i >= j is " + (i >= j));
		System.out.println("i <= j is " + (i <= j));
		System.out.println("i == j is " + (i == j));
		System.out.println("i != j is " + (i != j));
		
		System.out.println("(i < 10) && (j < 10) is " + ((i < 10) && (j < 10)));
		System.out.println("(i < 10) || (j < 10) is " + ((i < 10) || (j < 10)));
		
	}
}
