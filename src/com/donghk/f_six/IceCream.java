package com.donghk.f_six;

class Sundae{
	private Sundae(){
	}
	
	static Sundae makeASundae(){
		return new Sundae();
	}
}

public class IceCream {

	public static void main(String[] args) {
		//Sundae xx = new Sundae();
		Sundae x = Sundae.makeASundae();
	}
	
}
