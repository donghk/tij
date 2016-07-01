package com.donghk.c_three;

/**
 * 自动递增和递减
 * @author donghk
 * @date 2016年7月1日
 */
public class AutoInc {
	
	public static void main(String[] args) {
		int i = 1;
		Print.print("i : " + i);
		Print.print("++i : " + ++i);
		Print.print("i++ : " + i++);
		Print.print("i : " + i);
		Print.print("--i : " + --i);
		Print.print("i-- : " + i--);
		
		// 符号在前面的先计算，在后面的先取值
		int a = 3;
		int b = a++;
		System.out.println(a);// 4
		System.out.println(b);// 3
		a = 3;
		int c = ++a;
		System.out.println(a);// 4
		System.out.println(c);// 4
	}
}
