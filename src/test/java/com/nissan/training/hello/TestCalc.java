package com.nissan.training.hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalc {

	@Test
	public void testadd() {
		Calc c =new Calc();
		assertEquals(10, c.add(5, 5));
	}
	@Test
	public void testsub() {
		Calc c =new Calc();
		assertEquals(0, c.sub(5, 5));
	}
	@Test
	public void testmul() {
		Calc c =new Calc();
		assertEquals(25, c.mul(5, 5));
	}
	@Test
	public void testdiv() {
		Calc c =new Calc();
		assertEquals(1, c.div(5, 5));
	}

}
