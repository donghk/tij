package com.donghk.c_three;

class Letter{
	char c;
}

/**
 * 方法中调用别名问题
 * @author donghk
 * @date 2016年7月1日
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
