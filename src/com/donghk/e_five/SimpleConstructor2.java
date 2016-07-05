package com.donghk.e_five;

class Rock2{
	
	Rock2(int i){
		System.out.println("Rock2 " + i + " ");
	}
	
}

class St{
	String aa;
}

class St2{
	String aa = "aa";
	String bb;
	
	St2(String bb){
		this.bb = bb;
	}
}

public class SimpleConstructor2 {
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 8; i++){
			new Rock2(i);
		}
		
		St st = new St();
		System.out.println(st.aa);
		
		St2 st2 = new St2("bbbb");
		System.out.println(st2.aa + " " + st2.bb);
	}
	
}
