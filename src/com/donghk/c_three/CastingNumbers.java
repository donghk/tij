package com.donghk.c_three;

/**
 * 窄化转换，截尾和舍入
 * @author donghk
 *
 */
public class CastingNumbers {
	
	public static void main(String[] args) {
		
		double above = 0.7, below = 0.4;
		float fabove = 0.7f, fbelow = 0.4f;
		
		// 截尾
		System.out.println("(int)above" + (int)above);
		System.out.println("(int)below" + (int)below);
		System.out.println("(int)fabove" + (int)fabove);
		System.out.println("(int)fbelow" + (int)fbelow);
		
		// 舍入
		System.out.println("Math.round(above): " + Math.round(above));
		System.out.println("Math.round(below): " + Math.round(below));
		System.out.println("Math.round(fabove): " + Math.round(fabove));
		System.out.println("Math.round(fbelow): " + Math.round(fbelow));
				
	}

}
