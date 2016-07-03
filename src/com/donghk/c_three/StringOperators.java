package com.donghk.c_three;

/**
 * 字符串操作符
 * @author donghk
 *
 */
public class StringOperators {
	
	/**
	 * 如果表达式以一个字符串起头，那么后续所有操作数都会自动转成字符串
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 0, y = 1, z = 2;
		String s = "x, y, z ";
		System.out.println(s +  x + y + z);
		System.out.println(x + y + " " + s);
		s += "(summed) = ";
		System.out.println(s + (x + y + z));
		System.out.println("" + x);
	}

}
