package com.krakedev.maquinaAliens.test;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.maquinaAliens.Aliens;
class JUnit {
	@Test
	void testCrearAlienNormal() {
		Aliens alien=new Aliens(3,"rojo");
		assertEquals(5,alien.getTamanio());
		assertEquals("rojo",alien.getColor());
		assertEquals(1.0,alien.getPrecioCuerpo(),0.01);
		assertEquals(0.5,alien.getPrecioExtremidad(),0.01);
		assertEquals(0.25,alien.getPrecioOjo(),0.01);
				
	}
	
}
