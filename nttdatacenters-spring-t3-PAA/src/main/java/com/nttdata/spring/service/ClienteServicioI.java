package com.nttdata.spring.service;

import java.sql.Date;
import java.util.List;
import com.nttdata.spring.models.Client;

/**
 * ClientServiceI
 */
public interface ClienteServicioI {
	/**
	 * @param nombre
	 * @param apellidos
	 * @return
	 */
	public Client findByNombreCompleto(String nombre, String apellidos);
	
	/**
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param fechaNacimiento
	 */
	public void addClient(String nombre, String apellidos, String dni, Date fechaNacimiento);
	
	public List<Client> findAll();
}
