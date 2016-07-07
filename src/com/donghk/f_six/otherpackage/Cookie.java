package com.donghk.f_six.otherpackage;

public class Cookie {

	public Cookie(){
		System.out.println("Cookie Constructor");
	}
	
	// 访问权限不能跨包
	void bite(){
		System.out.println("bite");
	}
}
