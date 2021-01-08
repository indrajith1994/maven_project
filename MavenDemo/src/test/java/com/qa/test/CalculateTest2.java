package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculateTest2 {
	
	@Test
	public void sum() {
		System.out.println("Addition");
		int a =20;
		int b =40;
		Assert.assertEquals(60, a+b);
	}
	
	@Test
	public void sub() {
		System.out.println("Subraction");
		int a =10;
		int b =10;
		Assert.assertEquals(0, b-a);
	}
	
	@Test
	public void mul() {
		System.out.println("Multiplication");
		int a =10;
		int b =10;
		Assert.assertEquals(100, a*b);
	}
	
	@Test
	public void div() {
		System.out.println("Division");
		int a =10;
		int b =10;
		Assert.assertEquals(1, b/a);
	}

}
