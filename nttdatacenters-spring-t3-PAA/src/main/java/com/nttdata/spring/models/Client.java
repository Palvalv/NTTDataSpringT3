package com.nttdata.spring.models;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

/**
 * Client
 */
@Entity
@Table(name = "C_Client")
public class Client implements Serializable{
	
	/**
	 * Parametros
	 */
	
	/** Serial Version UID */
	private static final long serialVersionUID = 1L;

	/** ID */
	private Integer id;
	
	/** Nombre */
	private String nombre;
	
	/** Apellido */
	private String apellidos;
	
	/** Fecha de nacimiento */
	private Date fechaDeNacimiento;
	
	/** DNI */
	private String dni;
	
	/**
	 * Getters & Setters
	 */
	
	/**
	 * @return id
	 */
	@Id
	@Column(name="C_CLIENT_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqClientID")
	@SequenceGenerator(name = "seqClientID", sequenceName = "SEQ_T_CLIENT")
	public Integer getId() {
		return id;
	}

	/**
	 * @param id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return nombre
	 */
	@Column(name = "C_CLIENT_NAME")
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return apellidos
	 */
	@Column(name = "C_CLIENT_APELLIDOS")
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return fechaDeNacimiento
	 */
	@Column(name = "C_CLIENT_FECHA_NACIMIENTO")
	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	/**
	 * @param fechaDeNacimiento to set
	 */
	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	/**
	 * @return dni
	 */
	@Column(name = "C_CLIENT_DNI")
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaDeNacimiento="
				+ fechaDeNacimiento + ", dni=" + dni + "]";
	}
	
	
	
	
}
