package com.donghk.c_three;

class Tank{
	int level;
}

/**
 * ��ֵ
 * @author donghk
 * @date 2016��7��1��
 */
public class Assignment {
	
	public static void main(String[] args) {
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		t1.level = 9;
		t2.level = 47;
		Print.print("1: t1.level: " + t1.level +
				", t2.level: " + t2.level);
		t1 = t2;
		Print.print("2: t1.level: " + t1.level +
				", t2.level: " + t2.level);
		t1.level = 27;
		Print.print("3: t1.level: " + t1.level +
				", t2.level: " + t2.level);
	}

}
