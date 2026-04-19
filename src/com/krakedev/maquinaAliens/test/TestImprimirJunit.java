package com.krakedev.maquinaAliens.test;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

import com.krakedev.maquinaAliens.Aliens;

public class TestImprimirJunit {
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
	private final PrintStream standardOut = System.out;

	@Test
	void validaMetodoImprimir() {
	    // Se declara la salida del System.out al capturador
	    System.setOut(new PrintStream(outputStreamCaptor));

	    // Se instancia objeto alien y se llama al metodo inscribir
	    Aliens alien1 = new Aliens(10, "blanco");
	    alien1.imprimir2();
	    String valorEsperadoConsola = "tamano: 10, color: blanco";

	    // Validamos el valor esperado con el valor que se captura
	    assertEquals(valorEsperadoConsola, outputStreamCaptor.toString().trim());

	    // Se devuelve para que inscriba las demás medidas en pantalla
	    System.setOut(standardOut);
	}

}
