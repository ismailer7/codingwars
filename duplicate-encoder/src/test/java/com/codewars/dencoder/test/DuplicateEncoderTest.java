package com.codewars.dencoder.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.codewars.dencoder.DuplicateEncoder;

public class DuplicateEncoderTest {

	@Test
	public void testDuplicateEnoder() {
		assertEquals("(((", DuplicateEncoder.encode("din"));
		assertEquals("()()()", DuplicateEncoder.encode("recede"));
		assertEquals(")())())", DuplicateEncoder.encode("Success"));
		assertEquals("))((", DuplicateEncoder.encode("(( @"));
		assertEquals("", DuplicateEncoder.encode(""));
		assertEquals(")()())()(()()(",DuplicateEncoder.encode("Prespecialized"));
		assertEquals("))))())))",DuplicateEncoder.encode("   ()(   "));
	}
	
	
}
