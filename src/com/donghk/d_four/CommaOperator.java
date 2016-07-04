package com.donghk.d_four;

/**
 * 逗号操作符
 * @author donghk
 * @date 2016年7月4日
 */
public class CommaOperator {
	
	public static void main(String[] args) {
		
		for(int i = 1, j = i + 10; i < 5; i++, j = i * 2){
			System.out.println("i= " + i + " j= " + j);
		}
	}

}
