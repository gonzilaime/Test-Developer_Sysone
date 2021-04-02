package com.sysone.automotores.gonzalo.apirest.models.dto;

public class AutomovilPostDTO {

	private String modelo;
	private String techoCorredizo;
	private String aireAcondicionado;
	private String frenosAbs;
	private String airbag;
	private String llantasAlineacion;

	public AutomovilPostDTO() {

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

}
