package com.donghk.c_three;

import java.util.Random;

/**
 * 算术操作符
 * @author donghk
 * @date 2016年7月1日
 */
public class MathOps {

	public static void main(String[] args) {
		Random rand = new Random(47);
		// 整数
		int i, j, k;
		j = rand.nextInt(100) + 1;
		Print.print("j: " + j);
		k = rand.nextInt(100) + 1;
		Print.print("k: " + k);
		i = j + k;
		Print.print("j + k : " + i);
		i = j - k;
		Print.print("j - k : " + i);
		i = k / j;
		Print.print("k / j : " + i);
		i = k * j;
		Print.print("k * j : " + i);
		i = k % j;
		Print.print("k % j : " + i);
		j %= k;
		Print.print("j %= k : " + j);
		
		// 浮点型
		float u, v, w;
		v = rand.nextFloat();
		Print.print("v: " + v);
		w = rand.nextFloat();
		Print.print("w: " + w);
		u = v + w;
		Print.print("v + w : " + u);
		u = v - w;
		Print.print("v - w : " + u);
		u = v * w;
		Print.print("v * w : " + u);
		u = v / w;
		Print.print("v / w : " + u);
		u += v;
		Print.print("u += v : " + u);
		u -= v;
		Print.print("u -= v : " + u);
		u *= v;
		Print.print("u *= v : " + u);
		u /= v;
		Print.print("u /= v : " + u);
		
		int a = 3;
		float b = (float)0.3333333;
		float c;
		double d = 0.3333333333;
		double e;
		c = a * b;
		System.out.println(c);
		c = a * -b;
		System.out.println(c);
		c = a * +b;
		System.out.println(c);
		e = a * d;
		System.out.println(e);
		e = a * -d;
		System.out.println(e);
		e = a * +d;
		System.out.println(e);
		
	}
}
