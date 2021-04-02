package com.sysone.automotores.gonzalo.apirest.models.dto;

/**
 * 
 * @author Gonzalo Laime
 *
 */

public class AutomovilDTO {

	private String modelo;
	private String techoCorredizo;
	private String aireAcondicionado;
	private String frenosAbs;
	private String airbag;
	private String llantasAlineacion;
	private double valor;

	public AutomovilDTO() {

	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTechoCorredizo() {
		return techoCorredizo;
	}

	public void setTechoCorredizo(String techoCorredizo) {
		this.techoCorredizo = techoCorredizo;
	}

	public String getAireAcondicionado() {
		return aireAcondicionado;
	}

	public void setAireAcondicionado(String aireAcondicionado) {
		this.aireAcondicionado = aireAcondicionado;
	}

	public String getFrenosAbs() {
		return frenosAbs;
	}

	public void setFrenosAbs(String frenosAbs) {
		this.frenosAbs = frenosAbs;
	}

	public String getAirbag() {
		return airbag;
	}

	public void setAirbag(String airbag) {
		this.airbag = airbag;
	}

	public String getLlantasAlineacion() {
		return llantasAlineacion;
	}

	public void setLlantasAlineacion(String llantasAlineacion) {
		this.llantasAlineacion = llantasAlineacion;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
