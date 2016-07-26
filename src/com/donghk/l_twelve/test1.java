package com.donghk.l_twelve;

public class test1 {
	
	class Cat{
		
	}
	public static void main(String[] args) {
		
		try {
			
			//throw new Exception("aaa");
			
//			Cat cat = null;
//			cat.toString();
//			
			int[] a = {1,2,3};
			a[4] = 5;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace(System.out);
			//e.printStackTrace();
		}finally {
			System.out.println("fff");
		}
	}

}
