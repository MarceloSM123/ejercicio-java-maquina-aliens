package com.krakedev.maquinaAliens;

public class Aliens {

	private int tamanio;
	private String color;
	private int numeroOjos;
	private int numeroBrazos;
	private int numeroPies;
	private double precioExtremidad;
	private double precioOjo;
	private double precioCuerpo;

	public Aliens(int tamanio, String color) {
		if (tamanio < 5) {
			this.tamanio = 5;
		} else if (tamanio > 30) {
			this.tamanio = 30;
		} else {
			this.tamanio = tamanio;
		}
		this.color = color;

		this.precioCuerpo = 0.2 * this.tamanio;
		this.precioExtremidad = 0.1 * this.tamanio;
		this.precioOjo = 0.05 * this.tamanio;
	}

	public int getTamanio() {
		return tamanio;
	}

	public String getColor() {
		return color;
	}

	public int getNumeroOjos() {
		return numeroOjos;
	}

	public int getNumeroBrazos() {
		return numeroBrazos;
	}

	public int getNumeroPies() {
		return numeroPies;
	}

	public double getPrecioExtremidad() {
		return precioExtremidad;
	}

	public double getPrecioOjo() {
		return precioOjo;
	}

	public double getPrecioCuerpo() {
		return precioCuerpo;
	}

	public void imprimir() {
		String mensaje = "Tamanio: " + tamanio + "\n Color: " + color + "\n Nro ojos: " + numeroOjos + "\n Nro brazos: "
				+ numeroBrazos + "\n Nro pies: " + numeroPies + "\n Precio extremidad: " + precioExtremidad
				+ "\n Precio ojo: " + precioOjo + "\n Precio cuerpo: " + precioCuerpo;

		System.out.println(mensaje);
	}

	public void imprimir2() {
		System.out.println("tamanio: " + tamanio + ", color: " + color);
	}

	private int sumarExtremidades(int nuevasExtremidades) {
		return this.numeroBrazos + this.numeroPies + nuevasExtremidades;
	}

	public boolean agregarBrazos(int brazosNuevos) {
		 int extremidades = numeroBrazos+numeroPies;
		 if(sumarExtremidades(brazosNuevos)>=10) {
			 return false;
		 }else {
			 this.numeroBrazos+=brazosNuevos;
			 return true;
		 }}

	public boolean agregarPies(int piesNuevos) {
		int extremidades = numeroBrazos + numeroPies;
		if (sumarExtremidades(piesNuevos) >= 10) {
			return false;
		} else {
			this.numeroPies += piesNuevos;
			return true;
		}

	}
	
	private boolean validarNumeroOjos(int limiteOjos, int ojosNuevos) {
		if(numeroOjos+ojosNuevos<=limiteOjos) {
			this.numeroOjos+=ojosNuevos;
			return true;
		}
		return false;
		
	}
	
	public boolean agregarOjos(int ojosNuevos) {
		if(tamanio<=10) {
			return validarNumeroOjos(3,ojosNuevos);
		}
		
		else if(tamanio>10 && tamanio<=20) {
			return validarNumeroOjos(5,ojosNuevos);
		}
		else {
			return validarNumeroOjos(7,ojosNuevos);
		}
		
	}
}
