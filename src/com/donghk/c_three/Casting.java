package com.donghk.c_three;

/**
 * 类型转换操作符
 * @author donghk
 *
 */
public class Casting {

		public static void main(String[] args) {
			int i = 200;
			long lng = (long)i;
			lng = i;
			System.out.println(lng);
			long lng2 = (long)200;
			lng2 = 200;
			i = (int)lng2;
		}
}
