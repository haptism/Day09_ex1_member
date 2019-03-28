package com.iu.mod2;

public class StaticTest {
	public int num = 10;
	public static int num2 = 20;

	public void instanseMethod() {
		System.out.println("멤버 메서드");
		StaticTest.staticMethod();
	}

	public static void staticMethod() {
		System.out.println("클래스 메서드");
//		this.instanceMethod();
//		System.out.println(this.num);
		System.out.println(StaticTest.num2);
	}
}
