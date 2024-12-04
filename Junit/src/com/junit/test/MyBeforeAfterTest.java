package com.junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyBeforeAfterTest {
	
	
	@BeforeAll
	static void beforeAll() {
		System.out.print("Before All ");
	}
	
	@BeforeEach
	void beforeEach() {
		System.out.print("BeforeEach ");
	}

	@Test
	void test1() {
		System.out.print("test1 ");
	}
	
	@Test
	void test2() {
		System.out.print("test2 ");
	}
	
	@Test
	void test3() {
		System.out.print("test3 ");
	}
	
	@AfterEach
	void afterEach() {
		System.out.print("After Each ");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.print("After All ");
	}

}
