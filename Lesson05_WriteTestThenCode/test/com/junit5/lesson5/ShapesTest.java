package com.junit5.lesson5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTest {

	@Test
	void testCalcSquareArea() {
		Shapes shape = new Shapes();
		
		assertEquals(576, shape.calcSquareArea(24));
	}

}
