package com.donghk.c_three;

/**
 * �Զ������͵ݼ�
 * @author donghk
 * @date 2016��7��1��
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
		
		// ������ǰ����ȼ��㣬�ں������ȡֵ
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
