package com.krakedev.maquinaAliens.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.krakedev.maquinaAliens.Aliens;

public class testCalcularPrecioTotalJunit {

    // ============ PRUEBAS DE CÁLCULO INICIAL ============

    @Test
    public void testPrecioTotalInicialSinExtremidadesNiOjos() {
        Aliens alien = new Aliens(15, "Verde");
        // precioCuerpo = 0.2 * 15 = 3.0
        // extremidades = 0
        // ojos = 0
        alien.calcularPrecioTotal();
        
        assertEquals(3.0, alien.getPrecioTotal(), 0.0001);
    }

    @Test
    public void testPrecioTotalInicialTamanoMinimo() {
        Aliens alien = new Aliens(3, "Azul"); // Tamaño ajustado a 5
        // precioCuerpo = 0.2 * 5 = 1.0
        alien.calcularPrecioTotal();
        
        assertEquals(1.0, alien.getPrecioTotal(), 0.0001);
    }

    @Test
    public void testPrecioTotalInicialTamanoMaximo() {
        Aliens alien = new Aliens(35, "Rojo"); // Tamaño ajustado a 30
        // precioCuerpo = 0.2 * 30 = 6.0
        alien.calcularPrecioTotal();
        
        assertEquals(6.0, alien.getPrecioTotal(), 0.0001);
    }

    @Test
    public void testPrecioTotalInicialTamanoLimiteInferior() {
        Aliens alien = new Aliens(5, "Verde");
        // precioCuerpo = 0.2 * 5 = 1.0
        alien.calcularPrecioTotal();
        
        assertEquals(1.0, alien.getPrecioTotal(), 0.0001);
    }

    @Test
    public void testPrecioTotalInicialTamanoLimiteSuperior() {
        Aliens alien = new Aliens(30, "Azul");
        // precioCuerpo = 0.2 * 30 = 6.0
        alien.calcularPrecioTotal();
        
        assertEquals(6.0, alien.getPrecioTotal(), 0.0001);
    }

    // ============ PRUEBAS AGREGANDO BRAZOS ============

    @Test
    public void testPrecioTotalDespuesDeAgregarBrazos() {
        Aliens alien = new Aliens(15, "Verde"); // precioCuerpo = 3.0, precioExtremidad = 1.5
        alien.agregarBrazos(4);
        // 4 brazos * 1.5 = 6.0
        // Total = 3.0 + 6.0 = 9.0
        
        assertEquals(9.0, alien.getPrecioTotal(), 0.0001);
    }

    @Test
    public void testPrecioTotalDespuesDeAgregarUnBrazo() {
        Aliens alien = new Aliens(10, "Amarillo"); // precioCuerpo = 2.0, precioExtremidad = 1.0
        alien.agregarBrazos(1);
        
        assertEquals(3.0, alien.getPrecioTotal(), 0.0001); // 2.0 + (1 * 1.0) = 3.0
    }

    @Test
    public void testPrecioTotalDespuesDeAgregarBrazosMultiplesVeces() {
        Aliens alien = new Aliens(20, "Amarillo"); // precioCuerpo = 4.0, precioExtremidad = 2.0
        alien.agregarBrazos(2); // 2 * 2.0 = 4.0, total = 8.0
        alien.agregarBrazos(3); // 3 * 2.0 = 6.0, total acumulado = 4.0 + 6.0 = 10.0
        
        assertEquals(14.0, alien.getPrecioTotal(), 0.0001); // 4.0 (cuerpo) + 10.0 (brazos)
    }

    @Test
    public void testPrecioTotalNoCambiaAlAgregarBrazosExcediendoLimite() {
        Aliens alien = new Aliens(15, "Verde"); // precioCuerpo = 3.0
        alien.agregarBrazos(8); // 8 brazos
        double precioAntes = alien.getPrecioTotal();
        
        boolean resultado = alien.agregarBrazos(3); // Excede límite (8+3=11 >=10)
        
        assertFalse(resultado);
        assertEquals(precioAntes, alien.getPrecioTotal(), 0.0001);
    }

    @Test
    public void testPrecioTotalConAgregarBrazosLimiteJusto() {
        Aliens alien = new Aliens(12, "Verde"); // precioCuerpo = 2.4, precioExtremidad = 1.2
        alien.agregarBrazos(5); // 5 brazos
        alien.agregarBrazos(5); // 10 extremidades totales, debería fallar
        
        assertEquals(2.4 + (5 * 1.2), alien.getPrecioTotal(), 0.0001); // Solo primeros 5 brazos
    }

    // ============ PRUEBAS AGREGANDO PIES ============

    @Test
    public void testPrecioTotalDespuesDeAgregarPies() {
        Aliens alien = new Aliens(10, "Morado"); // precioCuerpo = 2.0, precioExtremidad = 1.0
        alien.agregarPies(5);
        // 5 pies * 1.0 = 5.0
        // Total = 2.0 + 5.0 = 7.0
        
        assertEquals(7.0, alien.getPrecioTotal(), 0.0001);
    }

    @Test
    public void testPrecioTotalDespuesDeAgregarUnPie() {
        Aliens alien = new Aliens(8, "Naranja"); // precioCuerpo = 1.6, precioExtremidad = 0.8
        alien.agregarPies(1);
        
        assertEquals(2.4, alien.getPrecioTotal(), 0.0001); // 1.6 + (1 * 0.8) = 2.4
    }

    @Test
    public void testPrecioTotalDespuesDeAgregarPiesMultiplesVeces() {
        Aliens alien = new Aliens(25, "Naranja"); // precioCuerpo = 5.0, precioExtremidad = 2.5
        alien.agregarPies(2); // 2 * 2.5 = 5.0, total = 10.0
        alien.agregarPies(2); // 2 * 2.5 = 5.0, total = 15.0
        
        assertEquals(15.0, alien.getPrecioTotal(), 0.0001);
    }

    @Test
    public void testPrecioTotalNoCambiaAlAgregarPiesExcediendoLimite() {
        Aliens alien = new Aliens(18, "Rojo");
        alien.agregarPies(9); // 9 pies
        double precioAntes = alien.getPrecioTotal();
        
        boolean resultado = alien.agregarPies(2); // Excede límite (9+2=11 >=10)
        
        assertFalse(resultado);
        assertEquals(precioAntes, alien.getPrecioTotal(), 0.0001);
    }

    // ============ PRUEBAS AGREGANDO OJOS ============

    @Test
    public void testPrecioTotalDespuesDeAgregarOjosTamanoPequeno() {
        Aliens alien = new Aliens(8, "Verde"); // precioCuerpo = 1.6, precioOjo = 0.4
        alien.agregarOjos(2);
        // 2 ojos * 0.4 = 0.8
        // Total = 1.6 + 0.8 = 2.4
        
        assertEquals(2.4, alien.getPrecioTotal(), 0.0001);
    }

    @Test
    public void testPrecioTotalDespuesDeAgregarOjosTamanoMediano() {
        Aliens alien = new Aliens(15, "Azul"); // precioCuerpo = 3.0, precioOjo = 0.75
        alien.agregarOjos(3);
        // 3 ojos * 0.75 = 2.25
        // Total = 3.0 + 2.25 = 5.25
        
        assertEquals(5.25, alien.getPrecioTotal(), 0.0001);
    }

    @Test
    public void testPrecioTotalDespuesDeAgregarOjosTamanoGrande() {
        Aliens alien = new Aliens(28, "Rojo"); // precioCuerpo = 5.6, precioOjo = 1.4
        alien.agregarOjos(4);
        // 4 ojos * 1.4 = 5.6
        // Total = 5.6 + 5.6 = 11.2
        
        assertEquals(11.2, alien.getPrecioTotal(), 0.0001);
    }

    @Test
    public void testPrecioTotalDespuesDeAgregarUnOjo() {
        Aliens alien = new Aliens(12, "Verde"); // precioCuerpo = 2.4, precioOjo = 0.6
        alien.agregarOjos(1);
        
        assertEquals(3.0, alien.getPrecioTotal(), 0.0001); // 2.4 + (1 * 0.6) = 3.0
    }

    @Test
    public void testPrecioTotalDespuesDeAgregarOjosMultiplesVeces() {
        Aliens alien = new Aliens(18, "Verde"); // precioCuerpo = 3.6, precioOjo = 0.9
        alien.agregarOjos(2); // 2 * 0.9 = 1.8, total = 5.4
        alien.agregarOjos(2); // 2 * 0.9 = 1.8, total = 7.2
        
        assertEquals(7.2, alien.getPrecioTotal(), 0.0001);
    }

    @Test
    public void testPrecioTotalConOjosLimiteTamanoPequeno() {
        Aliens alien = new Aliens(8, "Verde"); // Límite 3 ojos
        alien.agregarOjos(3);
        double precioCon3Ojos = alien.getPrecioTotal();
        
        alien.agregarOjos(1); // Intenta agregar más allá del límite
        
        assertEquals(precioCon3Ojos, alien.getPrecioTotal(), 0.0001);
        assertEquals(3, alien.getNumeroOjos());
    }

    @Test
    public void testPrecioTotalConOjosLimiteTamanoMediano() {
        Aliens alien = new Aliens(15, "Azul"); // Límite 5 ojos
        alien.agregarOjos(5);
        double precioCon5Ojos = alien.getPrecioTotal();
        
        alien.agregarOjos(1); // Intenta agregar más allá del límite
        
        assertEquals(precioCon5Ojos, alien.getPrecioTotal(), 0.0001);
        assertEquals(5, alien.getNumeroOjos());
    }

    @Test
    public void testPrecioTotalConOjosLimiteTamanoGrande() {
        Aliens alien = new Aliens(25, "Rojo"); // Límite 7 ojos
        alien.agregarOjos(7);
        double precioCon7Ojos = alien.getPrecioTotal();
        
        alien.agregarOjos(1); // Intenta agregar más allá del límite
        
        assertEquals(precioCon7Ojos, alien.getPrecioTotal(), 0.0001);
        assertEquals(7, alien.getNumeroOjos());
    }

    // ============ PRUEBAS COMBINADAS ============

    @Test
    public void testPrecioTotalAgregandoBrazosYPies() {
        Aliens alien = new Aliens(15, "Verde"); // precioCuerpo = 3.0, precioExtremidad = 1.5
        alien.agregarBrazos(3); // 3 * 1.5 = 4.5, total = 7.5
        alien.agregarPies(2); // 2 * 1.5 = 3.0, total = 10.5
        
        assertEquals(10.5, alien.getPrecioTotal(), 0.0001);
        assertEquals(3, alien.getNumeroBrazos());
        assertEquals(2, alien.getNumeroPies());
    }

    @Test
    public void testPrecioTotalAgregandoBrazosYOjos() {
        Aliens alien = new Aliens(12, "Azul"); // precioCuerpo = 2.4, precioExtremidad = 1.2, precioOjo = 0.6
        alien.agregarBrazos(4); // 4 * 1.2 = 4.8, total = 7.2
        alien.agregarOjos(3); // 3 * 0.6 = 1.8, total = 9.0
        
        assertEquals(9.0, alien.getPrecioTotal(), 0.0001);
    }

    @Test
    public void testPrecioTotalAgregandoPiesYOjos() {
        Aliens alien = new Aliens(25, "Rojo"); // precioCuerpo = 5.0, precioExtremidad = 2.5, precioOjo = 1.25
        alien.agregarPies(3); // 3 * 2.5 = 7.5, total = 12.5
        alien.agregarOjos(2); // 2 * 1.25 = 2.5, total = 15.0
        
        assertEquals(15.0, alien.getPrecioTotal(), 0.0001);
    }

    @Test
    public void testPrecioTotalAgregandoBrazosPiesYOjos() {
        Aliens alien = new Aliens(20, "Morado"); // precioCuerpo = 4.0, precioExtremidad = 2.0, precioOjo = 1.0
        alien.agregarBrazos(2); // 2 * 2.0 = 4.0, total = 8.0
        alien.agregarPies(2); // 2 * 2.0 = 4.0, total = 12.0
        alien.agregarOjos(3); // 3 * 1.0 = 3.0, total = 15.0
        
        assertEquals(15.0, alien.getPrecioTotal(), 0.0001);
    }

 

    // ============ PRUEBAS DE CONSISTENCIA ============

    @Test
    public void testPrecioTotalSeActualizaCorrectamenteDespuesDeMultiplesOperaciones() {
        Aliens alien = new Aliens(15, "Verde"); // precioCuerpo = 3.0
        
        alien.agregarBrazos(2);
        double precio1 = alien.getPrecioTotal(); // 3.0 + (2 * 1.5) = 6.0
        
        alien.agregarPies(3);
        double precio2 = alien.getPrecioTotal(); // 6.0 + (3 * 1.5) = 10.5
        
        alien.agregarOjos(2);
        double precio3 = alien.getPrecioTotal(); // 10.5 + (2 * 0.75) = 12.0
        
        assertEquals(6.0, precio1, 0.0001);
        assertEquals(10.5, precio2, 0.0001);
        assertEquals(12.0, precio3, 0.0001);
    }

    @Test
    public void testPrecioTotalDespuesDeAgregarVariosElementosEnDiferenteOrden() {
        Aliens alien1 = new Aliens(15, "Verde");
        alien1.agregarBrazos(2);
        alien1.agregarPies(3);
        alien1.agregarOjos(4);
        
        Aliens alien2 = new Aliens(15, "Verde");
        alien2.agregarOjos(4);
        alien2.agregarPies(3);
        alien2.agregarBrazos(2);
        
        assertEquals(alien1.getPrecioTotal(), alien2.getPrecioTotal(), 0.0001);
    }

    // ============ PRUEBAS DE FÓRMULA ============

    @Test
    public void testVerificarFormulaPrecioTotal() {
        Aliens alien = new Aliens(18, "Cyan");
        alien.agregarBrazos(3);
        alien.agregarPies(4);
        alien.agregarOjos(5);
        
        double esperado = alien.getPrecioCuerpo() 
                        + (alien.getNumeroBrazos() + alien.getNumeroPies()) * alien.getPrecioExtremidad()
                        + alien.getNumeroOjos() * alien.getPrecioOjo();
        
        assertEquals(esperado, alien.getPrecioTotal(), 0.0001);
    }

    @Test
    public void testCalcularPrecioTotalDirecto() {
        Aliens alien = new Aliens(20, "Test");
        alien.agregarBrazos(3);
        alien.agregarPies(2);
        alien.agregarOjos(4);
        
        alien.calcularPrecioTotal();
        
        double esperado = 4.0 + (5 * 2.0) + (4 * 1.0); // 4.0 + 10.0 + 4.0 = 18.0
        assertEquals(esperado, alien.getPrecioTotal(), 0.0001);
    }

    // ============ PRUEBAS DE PRECIOS POR TAMAÑO ============

    @Test
    public void testPreciosSegunTamano() {
        Aliens alienPeq = new Aliens(5, "Rojo");
        assertEquals(1.0, alienPeq.getPrecioCuerpo(), 0.0001);
        assertEquals(0.5, alienPeq.getPrecioExtremidad(), 0.0001);
        assertEquals(0.25, alienPeq.getPrecioOjo(), 0.0001);
        
        Aliens alienMed = new Aliens(15, "Verde");
        assertEquals(3.0, alienMed.getPrecioCuerpo(), 0.0001);
        assertEquals(1.5, alienMed.getPrecioExtremidad(), 0.0001);
        assertEquals(0.75, alienMed.getPrecioOjo(), 0.0001);
        
        Aliens alienGrande = new Aliens(30, "Azul");
        assertEquals(6.0, alienGrande.getPrecioCuerpo(), 0.0001);
        assertEquals(3.0, alienGrande.getPrecioExtremidad(), 0.0001);
        assertEquals(1.5, alienGrande.getPrecioOjo(), 0.0001);
    }
}
