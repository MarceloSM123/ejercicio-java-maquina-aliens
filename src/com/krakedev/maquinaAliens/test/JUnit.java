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
		
		Aliens alien1=new Aliens(50,"rojo");
		assertEquals(30,alien1.getTamanio());
		assertEquals("rojo",alien1.getColor());
		assertEquals(6.0,alien1.getPrecioCuerpo(),0.01);
		assertEquals(3.0,alien1.getPrecioExtremidad(),0.01);
		assertEquals(1.5,alien1.getPrecioOjo(),0.01);
		
		Aliens alien2=new Aliens(20,"rojo");
		assertEquals(20,alien2.getTamanio());
		assertEquals("rojo",alien2.getColor());
		assertEquals(4.0,alien2.getPrecioCuerpo(),0.01);
		assertEquals(2.0,alien2.getPrecioExtremidad(),0.01);
		assertEquals(1.0,alien2.getPrecioOjo(),0.01);
		
		alien2.imprimir();
				
	}
	
}
