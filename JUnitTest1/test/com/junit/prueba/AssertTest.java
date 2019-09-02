package com.junit.prueba;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.omg.IOP.Codec;

class AssertTest {

	@Test
	void test() {
		boolean condn = true;
		assertEquals(true, condn);
		assertTrue(condn);
		// assertFalse(condn);
		assertNotNull(condn);
		assertNull(condn);
		// assertArrayEquals(expected, actual);
	}

}
