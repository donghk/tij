package com.donghk.c_three;

class Letter{
	char c;
}

/**
 * �����е��ñ�������
 * @author donghk
 * @date 2016��7��1��
 */
public class PassObject {
	
	static void f(Letter y){
		y.c = 'z';
	}
	
	public static void main(String[] args) {
		Letter x = new Letter();
		x.c = 'a';
		Print.print("1: x.c: " + x.c);
		f(x);
		Print.print("2: x.c: " + x.c);
	}
	

}
