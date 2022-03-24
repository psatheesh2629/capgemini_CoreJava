package com.capgemini.Junit;

import static org.junit.Assert.assertNotNull;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class JunitTest{
	
	TestJunit testJunit;
	
	
	@BeforeAll
	public static void beforeAllTestCase() {
		System.out.println("Inside Before ALL");
	}
	
	@BeforeEach
	public void beforeEachMethod() {
		testJunit=new TestJunit();
		System.out.println("Before Each Method");
	}
	
	@AfterAll
	public static void afterAllTestCases() {
		System.out.println("After all Test cases");
	}
	
	@AfterEach
	public void afterEachMethod() {
		System.out.println("After Each Test Method");

	}
	
	@Test
	@DisplayName("Testing first Junit Test Case")
	//@Disabled
	//@Tag("DEV")
	@RepeatedTest(2)
	public void testDummy() {
		Assertions.assertTrue(true);
	}
	
	@Test
	@DisplayName("Testing  Calculator Test Case")
	public void testCalculate() {
		int expectedResponse=5;
		int actualResponse=testJunit.calculate(3, 2);
		Assertions.assertEquals(expectedResponse,actualResponse);
	}
	
	@Test
	@DisplayName("Testing Exception")
	public void testMultiplicationException() {
		Assertions.assertThrows(Exception.class, () -> testJunit.multiply(2,3));
	}
	
	@ParameterizedTest
	@MethodSource("test")
	public void testString(String s) {
		Assertions.assertNotNull(s);
	}
	
	static Stream<String> test(){
		return Stream.of("SOme String");
	}
}

