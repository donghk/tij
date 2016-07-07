package com.donghk.f_six;

import com.donghk.f_six.otherpackage.Cookie;

public class ChocolateChip extends Cookie{
	
	public ChocolateChip(){
		System.out.println("ChocolateChip Constructor");
	}
	
	public void chomp(){
		// bite();
	}

	public static void main(String[] args) {
		
		ChocolateChip x = new ChocolateChip();
		x.chomp();
		
	}
}
