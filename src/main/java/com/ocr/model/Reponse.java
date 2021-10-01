package com.ocr.model;

import com.ocr.entities.Invoice;

public class Reponse {

	private String nombre;
	private Invoice registros_procesados;
	private int registros_fallidos;
	private String registros_status;

	public Invoice getRegistros_procesados() {
		return registros_procesados;
	}

	public void setRegistros_procesados(Invoice registros_procesados) {
		this.registros_procesados = registros_procesados;
	}

	public String getRegistros_status() {
		return registros_status;
	}

	public void setRegistros_status(String registros_status) {
		this.registros_status = registros_status;
	}

	public int getRegistros_fallidos() {
		return registros_fallidos;
	}

	public void setRegistros_fallidos(int registros_fallidos) {
		this.registros_fallidos = registros_fallidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
