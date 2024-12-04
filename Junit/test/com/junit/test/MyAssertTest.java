package com.junit.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MyAssertTest {

	List<String> todos = Arrays.asList("AWS", "Azure", "DevOps");
	
	@Test
	void test() {
		boolean test1 = todos.contains("AWS");
		boolean test2 = todos.contains("LKJL");
//		assertEquals(true, test);
		assertTrue(test1);
		assertTrue(test2);
		assertArrayEquals(new int[] {1,2}, new int[] {2,1});
		
		assertEquals(3, todos.size());
	}

}
