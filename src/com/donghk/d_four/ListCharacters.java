package com.donghk.d_four;

import java.util.Random;

public class ListCharacters {
	
	public static void main(String[] args) {
		
		for(char c = 0; c < 120; c++){
			if(Character.isLowerCase(c))
				System.out.println("value: " + (int)c 
						+ " character: " + c);
		}
		
		for(int i = 1; i < 101; i++){
			System.out.println(i);
		}
		
		Random random = new Random();
		int last = 0, now;
		for(int i = 0 ; i < 25; i++){
			now = random.nextInt(100);
			System.out.println(now);
			if(last < now)
				System.out.println("小于");
			else if(last > now)
				System.out.println("大于");
			else
				System.out.println("等于");
			last = now;
		}
		
	}

}
