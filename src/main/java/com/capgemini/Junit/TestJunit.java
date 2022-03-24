package com.capgemini.Junit;

public class TestJunit {

	public int calculate(int a, int b) {
		return a + b;
	}

	public void multiply(int a, int b) throws Exception {
		System.out.println(a * b);
		throw new Exception();
	}
	
	public void testString(String s) {
		System.out.println(s);
	}
	
	public void testGitFeatureBranch() {
		System.out.println("Hello Gitsss");
	}
}
