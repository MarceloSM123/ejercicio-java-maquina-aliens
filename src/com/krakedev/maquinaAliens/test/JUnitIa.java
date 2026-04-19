package com.krakedev.maquinaAliens.test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.krakedev.maquinaAliens.Aliens;
public class JUnitIa {
 // ========== PRUEBAS DEL CONSTRUCTOR - RAMA ELSE (tamaño normal 5-30) ==========
    
    @Test
    public void testConstructorTamanioNormal15() {
        Aliens a = new Aliens(15, "Azul");
        assertEquals(15, a.getTamanio());
        assertEquals("Azul", a.getColor());
        assertEquals(3.0, a.getPrecioCuerpo(), 0.01);
        assertEquals(1.5, a.getPrecioExtremidad(), 0.01);
        assertEquals(0.75, a.getPrecioOjo(), 0.01);
    }
    
    @Test
    public void testConstructorTamanioNormal10() {
        Aliens a = new Aliens(10, "Verde");
        assertEquals(10, a.getTamanio());
        assertEquals(2.0, a.getPrecioCuerpo(), 0.01);
        assertEquals(1.0, a.getPrecioExtremidad(), 0.01);
        assertEquals(0.5, a.getPrecioOjo(), 0.01);
    }
    
    @Test
    public void testConstructorTamanioNormal20() {
        Aliens a = new Aliens(20, "Rojo");
        assertEquals(20, a.getTamanio());
        assertEquals(4.0, a.getPrecioCuerpo(), 0.01);
        assertEquals(2.0, a.getPrecioExtremidad(), 0.01);
        assertEquals(1.0, a.getPrecioOjo(), 0.01);
    }
    
    @Test
    public void testConstructorTamanioNormal25() {
        Aliens a = new Aliens(25, "Amarillo");
        assertEquals(25, a.getTamanio());
        assertEquals(5.0, a.getPrecioCuerpo(), 0.01);
        assertEquals(2.5, a.getPrecioExtremidad(), 0.01);
        assertEquals(1.25, a.getPrecioOjo(), 0.01);
    }
    
    @Test
    public void testConstructorTamanioNormal5() {
        Aliens a = new Aliens(5, "Naranja");
        assertEquals(5, a.getTamanio());
        assertEquals(1.0, a.getPrecioCuerpo(), 0.01);
        assertEquals(0.5, a.getPrecioExtremidad(), 0.01);
        assertEquals(0.25, a.getPrecioOjo(), 0.01);
    }
    
    @Test
    public void testConstructorTamanioNormal30() {
        Aliens a = new Aliens(30, "Morado");
        assertEquals(30, a.getTamanio());
        assertEquals(6.0, a.getPrecioCuerpo(), 0.01);
        assertEquals(3.0, a.getPrecioExtremidad(), 0.01);
        assertEquals(1.5, a.getPrecioOjo(), 0.01);
    }
    
    @Test
    public void testConstructorTamanioNormal18() {
        Aliens a = new Aliens(18, "Rosa");
        assertEquals(18, a.getTamanio());
        assertEquals(3.6, a.getPrecioCuerpo(), 0.01);
        assertEquals(1.8, a.getPrecioExtremidad(), 0.01);
        assertEquals(0.9, a.getPrecioOjo(), 0.01);
    }
    
    @Test
    public void testConstructorTamanioNormal22() {
        Aliens a = new Aliens(22, "Cafe");
        assertEquals(22, a.getTamanio());
        assertEquals(4.4, a.getPrecioCuerpo(), 0.01);
        assertEquals(2.2, a.getPrecioExtremidad(), 0.01);
        assertEquals(1.1, a.getPrecioOjo(), 0.01);
    }
    
    @Test
    public void testConstructorTamanioNormal28() {
        Aliens a = new Aliens(28, "Gris");
        assertEquals(28, a.getTamanio());
        assertEquals(5.6, a.getPrecioCuerpo(), 0.01);
        assertEquals(2.8, a.getPrecioExtremidad(), 0.01);
        assertEquals(1.4, a.getPrecioOjo(), 0.01);
    }
    
    // ========== PRUEBAS DEL CONSTRUCTOR - RAMA IF (tamaño < 5) ==========
    
    @Test
    public void testConstructorTamanioMenor5_con3() {
        Aliens a = new Aliens(3, "Rojo");
        assertEquals(5, a.getTamanio());
        assertEquals("Rojo", a.getColor());
        assertEquals(1.0, a.getPrecioCuerpo(), 0.01);
        assertEquals(0.5, a.getPrecioExtremidad(), 0.01);
        assertEquals(0.25, a.getPrecioOjo(), 0.01);
    }
    
    @Test
    public void testConstructorTamanioMenor5_con1() {
        Aliens a = new Aliens(1, "Azul");
        assertEquals(5, a.getTamanio());
        assertEquals(1.0, a.getPrecioCuerpo(), 0.01);
    }
    
    @Test
    public void testConstructorTamanioMenor5_con2() {
        Aliens a = new Aliens(2, "Verde");
        assertEquals(5, a.getTamanio());
        assertEquals(1.0, a.getPrecioCuerpo(), 0.01);
    }
    
    @Test
    public void testConstructorTamanioMenor5_con4() {
        Aliens a = new Aliens(4, "Amarillo");
        assertEquals(5, a.getTamanio());
        assertEquals(1.0, a.getPrecioCuerpo(), 0.01);
    }
    
    @Test
    public void testConstructorTamanioNegativo_conMenos5() {
        Aliens a = new Aliens(-5, "Negro");
        assertEquals(5, a.getTamanio());
        assertEquals(1.0, a.getPrecioCuerpo(), 0.01);
    }
    
    @Test
    public void testConstructorTamanioNegativo_conMenos10() {
        Aliens a = new Aliens(-10, "Gris");
        assertEquals(5, a.getTamanio());
        assertEquals(1.0, a.getPrecioCuerpo(), 0.01);
    }
    
    @Test
    public void testConstructorTamanioNegativo_conMenos100() {
        Aliens a = new Aliens(-100, "Blanco");
        assertEquals(5, a.getTamanio());
        assertEquals(1.0, a.getPrecioCuerpo(), 0.01);
    }
    
    @Test
    public void testConstructorTamanioCero() {
        Aliens a = new Aliens(0, "Cafe");
        assertEquals(5, a.getTamanio());
        assertEquals(1.0, a.getPrecioCuerpo(), 0.01);
    }
    
    // ========== PRUEBAS DEL CONSTRUCTOR - RAMA ELSE IF (tamaño > 30) ==========
    
    @Test
    public void testConstructorTamanioMayor30_con31() {
        Aliens a = new Aliens(31, "Morado");
        assertEquals(30, a.getTamanio());
        assertEquals("Morado", a.getColor());
        assertEquals(6.0, a.getPrecioCuerpo(), 0.01);
        assertEquals(3.0, a.getPrecioExtremidad(), 0.01);
        assertEquals(1.5, a.getPrecioOjo(), 0.01);
    }
    
    @Test
    public void testConstructorTamanioMayor30_con35() {
        Aliens a = new Aliens(35, "Rosa");
        assertEquals(30, a.getTamanio());
        assertEquals(6.0, a.getPrecioCuerpo(), 0.01);
    }
    
    @Test
    public void testConstructorTamanioMayor30_con40() {
        Aliens a = new Aliens(40, "Rojo");
        assertEquals(30, a.getTamanio());
        assertEquals(6.0, a.getPrecioCuerpo(), 0.01);
    }
    
    @Test
    public void testConstructorTamanioMayor30_con50() {
        Aliens a = new Aliens(50, "Verde");
        assertEquals(30, a.getTamanio());
        assertEquals(6.0, a.getPrecioCuerpo(), 0.01);
    }
    
    @Test
    public void testConstructorTamanioMayor30_con100() {
        Aliens a = new Aliens(100, "Azul");
        assertEquals(30, a.getTamanio());
        assertEquals(6.0, a.getPrecioCuerpo(), 0.01);
    }
    
    @Test
    public void testConstructorTamanioMayor30_con1000() {
        Aliens a = new Aliens(1000, "Negro");
        assertEquals(30, a.getTamanio());
        assertEquals(6.0, a.getPrecioCuerpo(), 0.01);
    }
    
    // ========== PRUEBAS DE COLOR (nulo y vacío) ==========
    
    @Test
    public void testConstructorColorNulo() {
        Aliens a = new Aliens(15, null);
        assertEquals(15, a.getTamanio());
        assertEquals(null, a.getColor());
        assertEquals(3.0, a.getPrecioCuerpo(), 0.01);
    }
    
    @Test
    public void testConstructorColorVacio() {
        Aliens a = new Aliens(15, "");
        assertEquals(15, a.getTamanio());
        assertEquals("", a.getColor());
        assertEquals(3.0, a.getPrecioCuerpo(), 0.01);
    }
    
    @Test
    public void testConstructorColorConEspacios() {
        Aliens a = new Aliens(15, "   ");
        assertEquals(15, a.getTamanio());
        assertEquals("   ", a.getColor());
    }
    
    // ========== PRUEBAS DE GETTERS ==========
    
    @Test
    public void testGetTamanio() {
        Aliens a = new Aliens(15, "Verde");
        assertEquals(15, a.getTamanio());
    }
    
    @Test
    public void testGetTamanioCon5() {
        Aliens a = new Aliens(5, "Rojo");
        assertEquals(5, a.getTamanio());
    }
    
    @Test
    public void testGetTamanioCon30() {
        Aliens a = new Aliens(30, "Azul");
        assertEquals(30, a.getTamanio());
    }
    
    @Test
    public void testGetColor() {
        Aliens a = new Aliens(15, "Verde");
        assertEquals("Verde", a.getColor());
    }
    
    @Test
    public void testGetColorRojo() {
        Aliens a = new Aliens(15, "Rojo");
        assertEquals("Rojo", a.getColor());
    }
    
    @Test
    public void testGetColorNulo() {
        Aliens a = new Aliens(15, null);
        assertEquals(null, a.getColor());
    }
    
    @Test
    public void testGetNumeroOjos() {
        Aliens a = new Aliens(15, "Verde");
        assertEquals(0, a.getNumeroOjos());
    }
    
    @Test
    public void testGetNumeroBrazos() {
        Aliens a = new Aliens(15, "Verde");
        assertEquals(0, a.getNumeroBrazos());
    }
    
    @Test
    public void testGetNumeroPies() {
        Aliens a = new Aliens(15, "Verde");
        assertEquals(0, a.getNumeroPies());
    }
    
    @Test
    public void testGetPrecioExtremidad() {
        Aliens a = new Aliens(15, "Verde");
        assertEquals(1.5, a.getPrecioExtremidad(), 0.01);
    }
    
    @Test
    public void testGetPrecioOjo() {
        Aliens a = new Aliens(15, "Verde");
        assertEquals(0.75, a.getPrecioOjo(), 0.01);
    }
    
    @Test
    public void testGetPrecioCuerpo() {
        Aliens a = new Aliens(15, "Verde");
        assertEquals(3.0, a.getPrecioCuerpo(), 0.01);
    }
    
    // ========== PRUEBAS DEL MÉTODO imprimir() ==========
    
    @Test
    public void testImprimirNoLanzaExcepcion() {
        Aliens a = new Aliens(15, "Verde");
        a.imprimir(); // Solo verifica que no lance excepción
    }
    
    @Test
    public void testImprimirConTamanioMinimo() {
        Aliens a = new Aliens(3, "Rojo");
        a.imprimir();
    }
    
    @Test
    public void testImprimirConTamanioMaximo() {
        Aliens a = new Aliens(50, "Morado");
        a.imprimir();
    }
    
    @Test
    public void testImprimirConColorNulo() {
        Aliens a = new Aliens(15, null);
        a.imprimir();
    }
    
    // ========== PRUEBAS DE CONSISTENCIA ==========
    
    @Test
    public void testConsistenciaPrecioCuerpoVsExtremidad() {
        Aliens a = new Aliens(15, "Verde");
        assertEquals(a.getPrecioCuerpo(), a.getPrecioExtremidad() * 2, 0.01);
    }
    
    @Test
    public void testConsistenciaPrecioExtremidadVsOjo() {
        Aliens a = new Aliens(15, "Verde");
        assertEquals(a.getPrecioExtremidad(), a.getPrecioOjo() * 2, 0.01);
    }
    
    @Test
    public void testConsistenciaPreciosTamanio10() {
        Aliens a = new Aliens(10, "Test");
        assertEquals(2.0, a.getPrecioCuerpo(), 0.01);
        assertEquals(1.0, a.getPrecioExtremidad(), 0.01);
        assertEquals(0.5, a.getPrecioOjo(), 0.01);
    }
    
    @Test
    public void testConsistenciaPreciosTamanio20() {
        Aliens a = new Aliens(20, "Test");
        assertEquals(4.0, a.getPrecioCuerpo(), 0.01);
        assertEquals(2.0, a.getPrecioExtremidad(), 0.01);
        assertEquals(1.0, a.getPrecioOjo(), 0.01);
    }
    
    @Test
    public void testConsistenciaPreciosTamanio5() {
        Aliens a = new Aliens(5, "Test");
        assertEquals(1.0, a.getPrecioCuerpo(), 0.01);
        assertEquals(0.5, a.getPrecioExtremidad(), 0.01);
        assertEquals(0.25, a.getPrecioOjo(), 0.01);
    }
    
    @Test
    public void testConsistenciaPreciosTamanio30() {
        Aliens a = new Aliens(30, "Test");
        assertEquals(6.0, a.getPrecioCuerpo(), 0.01);
        assertEquals(3.0, a.getPrecioExtremidad(), 0.01);
        assertEquals(1.5, a.getPrecioOjo(), 0.01);
    }
}
