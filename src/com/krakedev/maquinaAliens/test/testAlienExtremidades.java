package com.krakedev.maquinaAliens.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.krakedev.maquinaAliens.Aliens;

public class testAlienExtremidades {
	private Aliens alien;

    @BeforeEach
    public void setUp() {
        alien = new Aliens(15, "Verde");
    }

    // ============ PRUEBAS PARA agregarBrazos ============

    @Test
    public void testAgregarBrazosCasoValido() {
        boolean resultado = alien.agregarBrazos(3);

        assertTrue(resultado);
        assertEquals(3, alien.getNumeroBrazos());
        assertEquals(0, alien.getNumeroPies());
    }

    @Test
    public void testAgregarBrazosCasoLimiteJusto() {
        // 8 brazos + 0 pies = 8 extremidades (< 10)
        boolean resultado = alien.agregarBrazos(8);

        assertTrue(resultado);
        assertEquals(8, alien.getNumeroBrazos());
    }

    @Test
    public void testAgregarBrazosCasoExcedeLimite() {
        // 11 brazos excede el límite de 10 extremidades
        boolean resultado = alien.agregarBrazos(11);

        assertFalse(resultado);
        assertEquals(0, alien.getNumeroBrazos());
        assertEquals(0, alien.getNumeroPies());
    }

    @Test
    public void testAgregarBrazosCero() {
        boolean resultado = alien.agregarBrazos(0);

        assertTrue(resultado);
        assertEquals(0, alien.getNumeroBrazos());
    }

    @Test
    public void testAgregarBrazosValorNegativo() {
        boolean resultado = alien.agregarBrazos(-5);

        assertTrue(resultado); // Suma negativa, pero la condición se cumple
        assertEquals(-5, alien.getNumeroBrazos()); // Permite valores negativos
    }

    // ============ PRUEBAS PARA agregarPies ============

    @Test
    public void testAgregarPiesCasoValido() {
        boolean resultado = alien.agregarPies(4);

        assertTrue(resultado);
        assertEquals(4, alien.getNumeroPies());
        assertEquals(0, alien.getNumeroBrazos());
    }

    @Test
    public void testAgregarPiesCasoLimiteJusto() {
        // 10 pies + 0 brazos = 10 extremidades (NO debería agregarse porque >=10)
        boolean resultado = alien.agregarPies(10);

        assertFalse(resultado);
        assertEquals(0, alien.getNumeroPies());
    }

    @Test
    public void testAgregarPiesCasoLimiteJusto9() {
        // 9 pies + 0 brazos = 9 extremidades (< 10)
        boolean resultado = alien.agregarPies(9);

        assertTrue(resultado);
        assertEquals(9, alien.getNumeroPies());
    }

    @Test
    public void testAgregarPiesExcedeLimite() {
        boolean resultado = alien.agregarPies(12);

        assertFalse(resultado);
        assertEquals(0, alien.getNumeroPies());
    }

    @Test
    public void testAgregarPiesCero() {
        boolean resultado = alien.agregarPies(0);

        assertTrue(resultado);
        assertEquals(0, alien.getNumeroPies());
    }

    // ============ PRUEBAS COMBINADAS ============

    @Test
    public void testAgregarBrazosYLuegoPiesCasoValido() {
        alien.agregarBrazos(4);
        alien.agregarPies(3);

        assertEquals(4, alien.getNumeroBrazos());
        assertEquals(3, alien.getNumeroPies());
        assertEquals(7, alien.getNumeroBrazos() + alien.getNumeroPies());
    }

    @Test
    public void testAgregarBrazosLuegoPiesExcedeLimite() {
        alien.agregarBrazos(6);
        // 6 brazos + 5 pies = 11 extremidades -> debe fallar
        boolean resultadoPies = alien.agregarPies(5);

        assertFalse(resultadoPies);
        assertEquals(6, alien.getNumeroBrazos());
        assertEquals(0, alien.getNumeroPies());
    }

    @Test
    public void testAgregarPiesLuegoBrazosExcedeLimite() {
        alien.agregarPies(7);
        // 7 pies + 4 brazos = 11 extremidades -> debe fallar
        boolean resultadoBrazos = alien.agregarBrazos(4);

        assertFalse(resultadoBrazos);
        assertEquals(0, alien.getNumeroBrazos());
        assertEquals(7, alien.getNumeroPies());
    }

    @Test
    public void testAgregarBrazosLuegoPiesLimiteJusto() {
        alien.agregarBrazos(5);
        // 5 brazos + 5 pies = 10 extremidades -> debe fallar (>=10)
        boolean resultadoPies = alien.agregarPies(5);

        assertFalse(resultadoPies);
        assertEquals(5, alien.getNumeroBrazos());
        assertEquals(0, alien.getNumeroPies());
    }

    @Test
    public void testAgregarPiesLuegoBrazosLimiteJusto() {
        alien.agregarPies(5);
        // 5 pies + 5 brazos = 10 extremidades -> debe fallar (>=10)
        boolean resultadoBrazos = alien.agregarBrazos(5);

        assertFalse(resultadoBrazos);
        assertEquals(0, alien.getNumeroBrazos());
        assertEquals(5, alien.getNumeroPies());
    }

    @Test
    public void testAgregarMultiplesVecesBrazosYPies() {
        alien.agregarBrazos(2);
        alien.agregarPies(3);
        alien.agregarBrazos(2);
        alien.agregarPies(2);
        // Total: 4 brazos + 5 pies = 9 extremidades

        assertEquals(4, alien.getNumeroBrazos());
        assertEquals(5, alien.getNumeroPies());
        assertEquals(9, alien.getNumeroBrazos() + alien.getNumeroPies());
    }

    @Test
    public void testAgregarMultiplesVecesHastaLimite() {
        alien.agregarBrazos(3);
        alien.agregarPies(3);
        alien.agregarBrazos(3);
        // 6 brazos + 3 pies = 9 extremidades
        // Intento agregar 2 pies más = 11 -> debe fallar
        boolean resultado = alien.agregarPies(2);

        assertFalse(resultado);
        assertEquals(6, alien.getNumeroBrazos());
        assertEquals(3, alien.getNumeroPies());
    }

    // ============ PRUEBA CON DIFERENTES TAMAÑOS DE ALIEN ============

    @Test
    public void testAgregarBrazosConAlienPequeno() {
        Aliens alienPequeno = new Aliens(6, "Azul");
        boolean resultado = alienPequeno.agregarBrazos(5);

        assertTrue(resultado);
        assertEquals(5, alienPequeno.getNumeroBrazos());
    }

    @Test
    public void testAgregarPiesConAlienGrande() {
        Aliens alienGrande = new Aliens(28, "Rojo");
        boolean resultado = alienGrande.agregarPies(8);

        assertTrue(resultado);
        assertEquals(8, alienGrande.getNumeroPies());
    }
}
