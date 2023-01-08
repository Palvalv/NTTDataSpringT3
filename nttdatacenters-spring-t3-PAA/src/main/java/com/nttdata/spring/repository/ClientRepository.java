package com.nttdata.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.spring.models.Client;

/**
 * JpaRepository
 */
@Repository
public interface ClientRepository extends JpaRepository<Client, Integer>{
	/**
	 * @param nombre
	 * @param apellidos
	 * @return
	 */
	public Client findClientDistinctByNombreAndApellidos(String nombre, String apellidos);
}
