package com.donghk.g_seven;


class Plate{
	Plate(int i){
		System.out.println("Plate constructor");
	}
}

class DinnerPlate extends Plate{
	DinnerPlate(int i){
		super(i);
		System.out.println("DinnerPlate constructor");
	}
}

class Utensil{
	Utensil(int i){
		System.out.println("Utensil constructor");
	}
}

class Spoon extends Utensil{
	Spoon(int i){
		super(i);
		System.out.println("Spoon constructor");
	}
}

class Fork extends Utensil{
	Fork(int i){
		super(i);
		System.out.println("Fork constructor");
	}
}

class Knife extends Utensil{
	Knife(int i){
		super(i);
		System.out.println("Knife constructor");
	}
}

class Customer{
	Customer(int i){
		System.out.println("Custom constructor");
	}
}



public class PlaceSetting extends Customer{
	
	private Spoon sp;
	private Fork frk;
	private Knife kn;
	private DinnerPlate pl;
	public PlaceSetting(int i){
		super(i + 2);
		sp = new Spoon(i + 2);
		frk = new Fork(i + 3);
		kn = new Knife(i + 4);
		pl = new DinnerPlate(i + 5);
		System.out.println("PlaceSetting contructor");
	}
	public static void main(String[] args) {
		PlaceSetting x = new PlaceSetting(9);
	}

}
