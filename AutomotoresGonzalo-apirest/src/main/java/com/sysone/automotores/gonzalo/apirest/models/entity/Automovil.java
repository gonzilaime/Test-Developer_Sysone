package com.sysone.automotores.gonzalo.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Gonzalo Laime
 *
 */
@Entity
@Table(name = "automovil")
public class Automovil implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_automovil")
	private Long id;

	@Column(name = "modelo", nullable = false, length = 8)
	private String modelo;

	@Column(name = "tc", nullable = false)
	private boolean techoCorredizo;

	@Column(name = "aa", nullable = false)
	private boolean aireAcondicionado;

	@Column(name = "abs", nullable = false)
	private boolean frenosAbs;

	@Column(name = "ab", nullable = false)
	private boolean airbag;

	@Column(name = "ll", nullable = false)
	private boolean llantasAlineacion;

	@Column(name = "importe", nullable = false, length = 8)
	private double importe;

	public Automovil() {

	}

	public Automovil(Long id, String modelo, boolean techoCorredizo, boolean aireAcondicionado, boolean frenosAbs,
			boolean airbag, boolean llantasAlineacion) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.techoCorredizo = techoCorredizo;
		this.aireAcondicionado = aireAcondicionado;
		this.frenosAbs = frenosAbs;
		this.airbag = airbag;
		this.llantasAlineacion = llantasAlineacion;
	}

	public Automovil(String modelo, boolean techoCorredizo, boolean aireAcondicionado, boolean frenosAbs,
			boolean airbag, boolean llantasAlineacion) {
		super();
		this.modelo = modelo;
		this.techoCorredizo = techoCorredizo;
		this.aireAcondicionado = aireAcondicionado;
		this.frenosAbs = frenosAbs;
		this.airbag = airbag;
		this.llantasAlineacion = llantasAlineacion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isTechoCorredizo() {
		return techoCorredizo;
	}

	public void setTechoCorredizo(boolean techoCorredizo) {
		this.techoCorredizo = techoCorredizo;
	}

	public boolean isAireAcondicionado() {
		return aireAcondicionado;
	}

	public void setAireAcondicionado(boolean aireAcondicionado) {
		this.aireAcondicionado = aireAcondicionado;
	}

	public boolean isFrenosAbs() {
		return frenosAbs;
	}

	public void setFrenosAbs(boolean frenosAbs) {
		this.frenosAbs = frenosAbs;
	}

	public boolean isAirbag() {
		return airbag;
	}

	public void setAirbag(boolean airbag) {
		this.airbag = airbag;
	}

	public boolean isLlantasAlineacion() {
		return llantasAlineacion;
	}

	public void setLlantasAlineacion(boolean llantasAlineacion) {
		this.llantasAlineacion = llantasAlineacion;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public double calcularTotal(Automovil automovil) {
		double total = 0;
		if (automovil.isTechoCorredizo()) {
			total = total + 12000;
		}
		if (automovil.isAireAcondicionado()) {
			total = total + 20000;
		}
		if (automovil.isFrenosAbs()) {
			total = total + 14000;
		}
		if (automovil.isAirbag()) {
			total = total + 7000;
		}
		if (automovil.isLlantasAlineacion()) {
			total = total + 12000;
		}

		if (automovil.getModelo().equals("sedan")) {
			total = total + 230000;
		} else if (automovil.getModelo().equals("familiar")) {
			total = total + 245000;
		} else if (automovil.getModelo().equals("coupe")) {
			total = total + 270000;
		}
		return total;
	}

}
