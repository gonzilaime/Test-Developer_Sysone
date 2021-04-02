package com.sysone.automotores.gonzalo.apirest.models.dto;

/**
 * 
 * @author Gonzalo Laime
 *
 */
public class ErrorResponse {

	private String codigo;

	private String descripcion;

	public ErrorResponse() {
	}

	public ErrorResponse(String descripcion) {
		this.descripcion = descripcion;
	}

	public ErrorResponse(String codigo, String descripcion) {
		this.codigo = codigo;
		this.descripcion = descripcion;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public ErrorResponse codigo(String codigo) {
		this.codigo = codigo;
		return this;
	}

	public ErrorResponse descripcion(String descripcion) {
		this.descripcion = descripcion;
		return this;
	}

}
