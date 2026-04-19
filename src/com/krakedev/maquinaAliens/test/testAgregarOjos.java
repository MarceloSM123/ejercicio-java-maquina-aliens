package com.krakedev.maquinaAliens.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.krakedev.maquinaAliens.Aliens;

public class testAgregarOjos {
	private Aliens alien;

	// ============ PRUEBAS PARA ALIEN DE TAMAÑO 5-10 cm ============
	// Límite máximo: 3 ojos

	@Test
	public void testAgregarOjosTamanoPequenoCasoValido() {
		Aliens alienPequeno = new Aliens(8, "Verde");

		boolean resultado = alienPequeno.agregarOjos(2);

		assertTrue(resultado);
		assertEquals(2, alienPequeno.getNumeroOjos());
	}

	@Test
	public void testAgregarOjosTamanoPequenoLimiteJusto() {
		Aliens alienPequeno = new Aliens(10, "Azul");

		boolean resultado = alienPequeno.agregarOjos(3);

		assertTrue(resultado);
		assertEquals(3, alienPequeno.getNumeroOjos());
	}

	@Test
	public void testAgregarOjosTamanoPequenoExcedeLimite() {
		Aliens alienPequeno = new Aliens(7, "Rojo");

		boolean resultado = alienPequeno.agregarOjos(4);

		assertFalse(resultado);
		assertEquals(0, alienPequeno.getNumeroOjos());
	}

	@Test
	public void testAgregarOjosTamanoPequenoCero() {
		Aliens alienPequeno = new Aliens(6, "Amarillo");

		boolean resultado = alienPequeno.agregarOjos(0);

		assertTrue(resultado);
		assertEquals(0, alienPequeno.getNumeroOjos());
	}

	@Test
	public void testAgregarOjosTamanoPequenoAcumuladoHastaLimite() {
		Aliens alienPequeno = new Aliens(9, "Morado");

		alienPequeno.agregarOjos(2);
		boolean resultado = alienPequeno.agregarOjos(1);

		assertTrue(resultado);
		assertEquals(3, alienPequeno.getNumeroOjos());
	}

	@Test
	public void testAgregarOjosTamanoPequenoAcumuladoExcedeLimite() {
		Aliens alienPequeno = new Aliens(5, "Naranja");

		alienPequeno.agregarOjos(2);
		boolean resultado = alienPequeno.agregarOjos(2);

		assertFalse(resultado);
		assertEquals(2, alienPequeno.getNumeroOjos());
	}

	// ============ PRUEBAS PARA ALIEN DE TAMAÑO >10-20 cm ============
	// Límite máximo: 5 ojos

	@Test
	public void testAgregarOjosTamanoMedianoCasoValido() {
		Aliens alienMediano = new Aliens(15, "Verde");

		boolean resultado = alienMediano.agregarOjos(3);

		assertTrue(resultado);
		assertEquals(3, alienMediano.getNumeroOjos());
	}

	@Test
	public void testAgregarOjosTamanoMedianoLimiteJusto() {
		Aliens alienMediano = new Aliens(20, "Azul");

		boolean resultado = alienMediano.agregarOjos(5);

		assertTrue(resultado);
		assertEquals(5, alienMediano.getNumeroOjos());
	}

	@Test
	public void testAgregarOjosTamanoMedianoExcedeLimite() {
		Aliens alienMediano = new Aliens(18, "Rojo");

		boolean resultado = alienMediano.agregarOjos(6);

		assertFalse(resultado);
		assertEquals(0, alienMediano.getNumeroOjos());
	}

	@Test
	public void testAgregarOjosTamanoMedianoCero() {
		Aliens alienMediano = new Aliens(12, "Amarillo");

		boolean resultado = alienMediano.agregarOjos(0);

		assertTrue(resultado);
		assertEquals(0, alienMediano.getNumeroOjos());
	}

	@Test
	public void testAgregarOjosTamanoMedianoAcumuladoHastaLimite() {
		Aliens alienMediano = new Aliens(14, "Morado");

		alienMediano.agregarOjos(3);
		boolean resultado = alienMediano.agregarOjos(2);

		assertTrue(resultado);
		assertEquals(5, alienMediano.getNumeroOjos());
	}

	@Test
	public void testAgregarOjosTamanoMedianoAcumuladoExcedeLimite() {
		Aliens alienMediano = new Aliens(16, "Naranja");

		alienMediano.agregarOjos(4);
		boolean resultado = alienMediano.agregarOjos(2);

		assertFalse(resultado);
		assertEquals(4, alienMediano.getNumeroOjos());
	}

	// ============ PRUEBAS PARA ALIEN DE TAMAÑO >20-30 cm ============
	// Límite máximo: 7 ojos

	@Test
	public void testAgregarOjosTamanoGrandeCasoValido() {
		Aliens alienGrande = new Aliens(25, "Verde");

		boolean resultado = alienGrande.agregarOjos(4);

		assertTrue(resultado);
		assertEquals(4, alienGrande.getNumeroOjos());
	}

	@Test
	public void testAgregarOjosTamanoGrandeLimiteJusto() {
		Aliens alienGrande = new Aliens(30, "Azul");

		boolean resultado = alienGrande.agregarOjos(7);

		assertTrue(resultado);
		assertEquals(7, alienGrande.getNumeroOjos());
	}

	@Test
	public void testAgregarOjosTamanoGrandeExcedeLimite() {
		Aliens alienGrande = new Aliens(28, "Rojo");

		boolean resultado = alienGrande.agregarOjos(8);

		assertFalse(resultado);
		assertEquals(0, alienGrande.getNumeroOjos());
	}

	@Test
	public void testAgregarOjosTamanoGrandeCero() {
		Aliens alienGrande = new Aliens(22, "Amarillo");

		boolean resultado = alienGrande.agregarOjos(0);

		assertTrue(resultado);
		assertEquals(0, alienGrande.getNumeroOjos());
	}

	@Test
	public void testAgregarOjosTamanoGrandeAcumuladoHastaLimite() {
		Aliens alienGrande = new Aliens(26, "Morado");

		alienGrande.agregarOjos(4);
		boolean resultado = alienGrande.agregarOjos(3);

		assertTrue(resultado);
		assertEquals(7, alienGrande.getNumeroOjos());
	}

	@Test
	public void testAgregarOjosTamanoGrandeAcumuladoExcedeLimite() {
		Aliens alienGrande = new Aliens(29, "Naranja");

		alienGrande.agregarOjos(6);
		boolean resultado = alienGrande.agregarOjos(2);

		assertFalse(resultado);
		assertEquals(6, alienGrande.getNumeroOjos());
	}

	// ============ PRUEBAS DE LÍMITES ENTRE RANGOS ============

	@Test
	public void testAgregarOjosLimiteInferiorRangoPequeno() {
		// Tamaño 5 es el mínimo (rango 5-10)
		Aliens alien = new Aliens(5, "Blanco");

		boolean resultado = alien.agregarOjos(3);

		assertTrue(resultado);
		assertEquals(3, alien.getNumeroOjos());
	}

	@Test
	public void testAgregarOjosLimiteSuperiorRangoPequeno() {
		// Tamaño 10 es el límite superior del rango pequeño
		Aliens alien = new Aliens(10, "Blanco");

		boolean resultado = alien.agregarOjos(3);

		assertTrue(resultado);
		assertEquals(3, alien.getNumeroOjos());
	}

	@Test
	public void testAgregarOjosLimiteInferiorRangoMediano() {
		// Tamaño 11 es el límite inferior del rango mediano (>10)
		Aliens alien = new Aliens(11, "Blanco");

		boolean resultado = alien.agregarOjos(5);

		assertTrue(resultado);
		assertEquals(5, alien.getNumeroOjos());
	}

	@Test
	public void testAgregarOjosLimiteSuperiorRangoMediano() {
		// Tamaño 20 es el límite superior del rango mediano
		Aliens alien = new Aliens(20, "Blanco");

		boolean resultado = alien.agregarOjos(5);

		assertTrue(resultado);
		assertEquals(5, alien.getNumeroOjos());
	}

	@Test
	public void testAgregarOjosLimiteInferiorRangoGrande() {
		// Tamaño 21 es el límite inferior del rango grande (>20)
		Aliens alien = new Aliens(21, "Blanco");

		boolean resultado = alien.agregarOjos(7);

		assertTrue(resultado);
		assertEquals(7, alien.getNumeroOjos());
	}

	// ============ PRUEBAS CON VALORES NEGATIVOS ============

	@Test
	public void testAgregarOjosValorNegativo() {
		Aliens alien = new Aliens(15, "Gris");

		boolean resultado = alien.agregarOjos(-3);

		assertTrue(resultado);
		assertEquals(-3, alien.getNumeroOjos());
	}
}
