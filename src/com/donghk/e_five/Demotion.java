package com.donghk.e_five;

public class Demotion {

	void f1(char x){System.out.println("f1(char x) ");}
	void f1(byte x){System.out.println("f1(byte x) ");}
	void f1(short x){System.out.println("f1(short x) ");}
	void f1(int x){System.out.println("f1(int x) ");}
	void f1(long x){System.out.println("f1(long x) ");}
	void f1(float x){System.out.println("f1(float x) ");}
	void f1(double x){System.out.println("f1(double x) ");}
	
	void f2(char x){System.out.println("f2(char x) ");}
	void f2(byte x){System.out.println("f2(byte x) ");}
	void f2(short x){System.out.println("f2(short x) ");}
	void f2(int x){System.out.println("f2(int x) ");}
	void f2(long x){System.out.println("f2(long x) ");}
	void f2(float x){System.out.println("f2(float x) ");}
	
	void f3(char x){System.out.println("f3(char x) ");}
	void f3(byte x){System.out.println("f3(byte x) ");}
	void f3(short x){System.out.println("f3(short x) ");}
	void f3(int x){System.out.println("f3(int x) ");}
	void f3(long x){System.out.println("f3(long x) ");}
	
	void f4(char x){System.out.println("f4(char x) ");}
	void f4(byte x){System.out.println("f4(byte x) ");}
	void f4(short x){System.out.println("f4(short x) ");}
	void f4(int x){System.out.println("f4(int x) ");}
	
	void f5(char x){System.out.println("f5(char x) ");}
	void f5(byte x){System.out.println("f5(byte x) ");}
	void f5(short x){System.out.println("f5(short x) ");}
	
	void f6(char x){System.out.println("f6(char x) ");}
	void f6(byte x){System.out.println("f6(byte x) ");}
	
	void f7(char x){System.out.println("f7(char x) ");}
	
	
	void testDouble(){
		double x = 0;
		System.out.println("double argument: ");
		f1(x);
		f2((float)x);
		f3((long)x);
		f4((int)x);
		f5((short)x);
		f6((byte)x);
		f7((char)x);
	}
	
	public static void main(String[] args) {
		
		Demotion p = new Demotion();
		p.testDouble();
	}
}
