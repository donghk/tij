package com.donghk.h_eight;

public class Music {

	
	public static void tune(Instrument i ){
		i.play(Note.Middle_C);
	}
	
	public static void main(String[] args) {
		Wind flute = new Wind();
		tune(flute);
	}
}
