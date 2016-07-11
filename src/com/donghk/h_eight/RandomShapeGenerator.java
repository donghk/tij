/**
 * @author donghk
 * @date 2016年7月11日
 */
package com.donghk.h_eight;

import java.util.Random;

/**
 * @author donghk
 * @date 2016年7月11日
 */
public class RandomShapeGenerator {

	private Random rand = new Random();

	public Shape next() {
		switch (rand.nextInt(3)) {
		default:
		case 0:
			return new Circle();
		case 1:
			return new Square();
		case 2:
			return new Triangle();
		}
	}
}
