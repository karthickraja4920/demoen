package org.enc;

public class coursedetail {
	public static void main(String[] args) {
		
		geterseter g = new geterseter();
		g.setA(123);
		g.setS("karthick");
		g.setC('a');
		
		int a = g.getA();
		System.out.println(a);
		String s = g.getS();
		System.out.println(s);
		char c = g.getC();
		System.out.println(c);
	}

}
