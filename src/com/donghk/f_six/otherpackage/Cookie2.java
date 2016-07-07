package com.donghk.f_six.otherpackage;

public class Cookie2 {

	public Cookie2(){
		System.out.println("Cookie Constructor");
	}
	
	// 访问权限不能跨包
	protected void bite(){
		System.out.println("bite");
	}
}
