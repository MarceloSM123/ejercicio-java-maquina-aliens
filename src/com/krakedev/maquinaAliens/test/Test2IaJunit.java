package com.krakedev.maquinaAliens.test;
import org.junit.jupiter.api.*;

import com.krakedev.maquinaAliens.Aliens;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Test2IaJunit {
private Aliens alien;

    @BeforeEach
    void setUp() {
        alien = new Aliens(15, "Verde");
       
    }
    
    @AfterEach
    void tearDown() {
        alien = null;
    }
    
    // ========== PRUEBAS DEL CONSTRUCTOR ==========
    
    @Test
    @Order(1)
    @DisplayName("Constructor con tamaño normal dentro del rango")
    void testConstructorTamanioNormal() {
        Aliens alienNormal = new Aliens(15, "Azul");
        
        assertEquals(15, alienNormal.getTamanio());
        assertEquals("Azul", alienNormal.getColor());
        assertEquals(3.0, alienNormal.getPrecioCuerpo()); // 0.2 * 15
        assertEquals(1.5, alienNormal.getPrecioExtremidad()); // 0.1 * 15
        assertEquals(0.75, alienNormal.getPrecioOjo()); // 0.05 * 15
    }
    
    @Test
    @Order(2)
    @DisplayName("Constructor con tamaño menor al mínimo (ajusta a 5)")
    void testConstructorTamanioMinimo() {
        Aliens alienPequeno = new Aliens(3, "Rojo");
        
        assertEquals(5, alienPequeno.getTamanio());
        assertEquals(1.0, alienPequeno.getPrecioCuerpo()); // 0.2 * 5
        assertEquals(0.5, alienPequeno.getPrecioExtremidad()); // 0.1 * 5
        assertEquals(0.25, alienPequeno.getPrecioOjo()); // 0.05 * 5
    }
    
    @Test
    @Order(3)
    @DisplayName("Constructor con tamaño mayor al máximo (ajusta a 30)")
    void testConstructorTamanioMaximo() {
        Aliens alienGrande = new Aliens(50, "Morado");
        
        assertEquals(30, alienGrande.getTamanio());
        assertEquals(6.0, alienGrande.getPrecioCuerpo()); // 0.2 * 30
        assertEquals(3.0, alienGrande.getPrecioExtremidad()); // 0.1 * 30
        assertEquals(1.5, alienGrande.getPrecioOjo()); // 0.05 * 30
    }
    
    @Test
    @Order(4)
    @DisplayName("Constructor con límites exactos")
    void testConstructorLimitesExactos() {
        Aliens alienLimiteInferior = new Aliens(5, "Amarillo");
        assertEquals(5, alienLimiteInferior.getTamanio());
        
        Aliens alienLimiteSuperior = new Aliens(30, "Negro");
        assertEquals(30, alienLimiteSuperior.getTamanio());
    }
    
    // ========== PRUEBAS DE GETTERS ==========
    
    @Test
    @Order(5)
    @DisplayName("Getter de tamaño")
    void testGetTamanio() {
        assertEquals(15, alien.getTamanio());
    }
    
    @Test
    @Order(6)
    @DisplayName("Getter de color")
    void testGetColor() {
        assertEquals("Verde", alien.getColor());
    }
    
    @Test
    @Order(7)
    @DisplayName("Getter de número de ojos (inicialmente 0)")
    void testGetNumeroOjosInicial() {
        assertEquals(0, alien.getNumeroOjos());
    }
    
    @Test
    @Order(8)
    @DisplayName("Getter de número de brazos (inicialmente 0)")
    void testGetNumeroBrazosInicial() {
        assertEquals(0, alien.getNumeroBrazos());
    }
    
    @Test
    @Order(9)
    @DisplayName("Getter de número de pies (inicialmente 0)")
    void testGetNumeroPiesInicial() {
        assertEquals(0, alien.getNumeroPies());
    }
    
    // ========== PRUEBAS DE PRECIOS ==========
    
    @Test
    @Order(10)
    @DisplayName("Cálculo correcto de precios para tamaño 5")
    void testCalculoPreciosTamanio5() {
        Aliens a = new Aliens(5, "Test");
        assertEquals(1.0, a.getPrecioCuerpo(), 0.01);
        assertEquals(0.5, a.getPrecioExtremidad(), 0.01);
        assertEquals(0.25, a.getPrecioOjo(), 0.01);
    }
    
    @Test
    @Order(11)
    @DisplayName("Cálculo correcto de precios para tamaño 10")
    void testCalculoPreciosTamanio10() {
        Aliens a = new Aliens(10, "Test");
        assertEquals(2.0, a.getPrecioCuerpo(), 0.01);
        assertEquals(1.0, a.getPrecioExtremidad(), 0.01);
        assertEquals(0.5, a.getPrecioOjo(), 0.01);
    }
    
    @Test
    @Order(12)
    @DisplayName("Cálculo correcto de precios para tamaño 15")
    void testCalculoPreciosTamanio15() {
        Aliens a = new Aliens(15, "Test");
        assertEquals(3.0, a.getPrecioCuerpo(), 0.01);
        assertEquals(1.5, a.getPrecioExtremidad(), 0.01);
        assertEquals(0.75, a.getPrecioOjo(), 0.01);
    }
    
    @Test
    @Order(13)
    @DisplayName("Cálculo correcto de precios para tamaño 20")
    void testCalculoPreciosTamanio20() {
        Aliens a = new Aliens(20, "Test");
        assertEquals(4.0, a.getPrecioCuerpo(), 0.01);
        assertEquals(2.0, a.getPrecioExtremidad(), 0.01);
        assertEquals(1.0, a.getPrecioOjo(), 0.01);
    }
    
    @Test
    @Order(14)
    @DisplayName("Cálculo correcto de precios para tamaño 25")
    void testCalculoPreciosTamanio25() {
        Aliens a = new Aliens(25, "Test");
        assertEquals(5.0, a.getPrecioCuerpo(), 0.01);
        assertEquals(2.5, a.getPrecioExtremidad(), 0.01);
        assertEquals(1.25, a.getPrecioOjo(), 0.01);
    }
    
    @Test
    @Order(15)
    @DisplayName("Cálculo correcto de precios para tamaño 30")
    void testCalculoPreciosTamanio30() {
        Aliens a = new Aliens(30, "Test");
        assertEquals(6.0, a.getPrecioCuerpo(), 0.01);
        assertEquals(3.0, a.getPrecioExtremidad(), 0.01);
        assertEquals(1.5, a.getPrecioOjo(), 0.01);
    }
    
    // ========== PRUEBAS DEL MÉTODO imprimir() ==========
    
    @Test
    @Order(16)
    @DisplayName("Método imprimir no lanza excepciones")
    void testImprimirNoLanzaExcepcion() {
        assertDoesNotThrow(() -> alien.imprimir());
    }
    
    // ========== PRUEBAS DE VALORES NEGATIVOS Y BORDES ==========
    
    @Test
    @Order(17)
    @DisplayName("Constructor con tamaño negativo (debe ajustar a 5)")
    void testConstructorTamanioNegativo() {
        Aliens alienNegativo = new Aliens(-10, "Gris");
        assertEquals(5, alienNegativo.getTamanio());
    }
    
    @Test
    @Order(18)
    @DisplayName("Constructor con tamaño cero (debe ajustar a 5)")
    void testConstructorTamanioCero() {
        Aliens alienCero = new Aliens(0, "Blanco");
        assertEquals(5, alienCero.getTamanio());
    }
    
    @Test
    @Order(19)
    @DisplayName("Constructor con color nulo")
    void testConstructorColorNulo() {
        assertDoesNotThrow(() -> new Aliens(15, null));
        Aliens alienNulo = new Aliens(15, null);
        assertNull(alienNulo.getColor());
    }
    
    // ========== PRUEBAS MÚLTIPLES (sin usar colecciones) ==========
    
    @Test
    @Order(20)
    @DisplayName("Prueba de 6 aliens con diferentes tamaños")
    void testMultiplesInstancias() {
        // Alien 1
        Aliens a1 = new Aliens(5, "Color5");
        assertEquals(5, a1.getTamanio());
        
        // Alien 2
        Aliens a2 = new Aliens(10, "Color10");
        assertEquals(10, a2.getTamanio());
        
        // Alien 3
        Aliens a3 = new Aliens(15, "Color15");
        assertEquals(15, a3.getTamanio());
        
        // Alien 4
        Aliens a4 = new Aliens(20, "Color20");
        assertEquals(20, a4.getTamanio());
        
        // Alien 5
        Aliens a5 = new Aliens(25, "Color25");
        assertEquals(25, a5.getTamanio());
        
        // Alien 6
        Aliens a6 = new Aliens(30, "Color30");
        assertEquals(30, a6.getTamanio());
    }
    
    // ========== PRUEBAS DE CONSISTENCIA ==========
    
    @Test
    @Order(21)
    @DisplayName("Consistencia de precios: cuerpo = 2 * extremidad")
    void testConsistenciaPrecios() {
        assertEquals(alien.getPrecioCuerpo(), alien.getPrecioExtremidad() * 2, 0.01);
        assertEquals(alien.getPrecioExtremidad(), alien.getPrecioOjo() * 2, 0.01);
    }
    
    @Test
    @Order(22)
    @DisplayName("Todos los aliens creados con el mismo color tienen mismo color")
    void testMismoColor() {
        Aliens alien1 = new Aliens(10, "Rojo");
        Aliens alien2 = new Aliens(20, "Rojo");
        assertEquals(alien1.getColor(), alien2.getColor());
    }
    
    @Test
    @Order(23)
    @DisplayName("Diferentes colores son diferentes")
    void testDiferentesColores() {
        Aliens alienRojo = new Aliens(10, "Rojo");
        Aliens alienAzul = new Aliens(10, "Azul");
        assertNotEquals(alienRojo.getColor(), alienAzul.getColor());
    }
    
    // ========== PRUEBAS ADICIONALES DE BORDE ==========
    
    @Test
    @Order(24)
    @DisplayName("Tamaño justo por debajo del mínimo (4 debe ir a 5)")
    void testTamanioJustoDebajoMinimo() {
        Aliens alien = new Aliens(4, "Test");
        assertEquals(5, alien.getTamanio());
    }
    
    @Test
    @Order(25)
    @DisplayName("Tamaño justo por encima del máximo (31 debe ir a 30)")
    void testTamanioJustoEncimaMaximo() {
        Aliens alien = new Aliens(31, "Test");
        assertEquals(30, alien.getTamanio());
    }
    
    @Test
    @Order(26)
    @DisplayName("Color vacío debe funcionar")
    void testColorVacio() {
        Aliens alien = new Aliens(15, "");
        assertEquals("", alien.getColor());
    }
}
