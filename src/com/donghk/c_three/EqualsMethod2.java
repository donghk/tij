package com.donghk.c_three;

/**
 * equals相等，已创建类
 * @author donghk
 *
 */

class Value{
	int i;
}

class Dog{
	String name;
	String says;
}

public class EqualsMethod2 {
	
	public static void main(String[] args) {
		
		Value v1 = new Value();
		Value v2 = new Value();
		v1.i = v2.i = 100;
		System.out.println(v1.equals(v2));
		
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		d1.name = "spot";
		d1.says = "Ruff";
		d2.name = "scruffy";
		d2.says = "Wurf";
		System.out.println(d1.name + d1.says);
		System.out.println(d2.name + d2.says);
		Dog d3;
		d3 = d1;
		System.out.println(d3 == d1);
		System.out.println(d3.equals(d1));
		Dog d4 = new Dog();
		d4.name = d1.name;
		d4.says = d1.says;
		System.out.println(d4 == d1);
		System.out.println(d4.equals(d1));
				
	}

}
