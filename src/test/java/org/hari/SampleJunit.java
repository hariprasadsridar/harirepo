package org.hari;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SampleJunit {


	@BeforeClass
	public static void beforeclass() {
		System.out.println("in before class public static is compulsory");
	}
	@Before
	public void before() {
		System.out.println("before class is execute each time  before execute of test class ");
	}
	@Test
	public void test() {
		System.out.println("test is the best");
	}
	@After
	public void after() {
			System.out.println("After");
	}
	@AfterClass
	public static void afterclass() {
		System.out.println("after class");
	}
}
