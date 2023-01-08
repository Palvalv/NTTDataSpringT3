package com.nttdata.spring;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.spring.models.Client;
import com.nttdata.spring.service.ClienteServicioI;

/**
 * MainAPP
 */
@SpringBootApplication()
public class MainAPP implements CommandLineRunner{
	
	@Autowired
	ClienteServicioI service;
	
	/**
	 * Main.
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(MainAPP.class, args);
	}

	/** Run. */
	@Override
	public void run(String... args) throws Exception {
		
		service.addClient("Yassine", "Bounou", "1313P", Date.valueOf(LocalDate.of(2015, 1, 23)));
		service.addClient("Fernando", "Reges", "2525M", Date.valueOf(LocalDate.of(2022, 5, 17)));
		service.addClient("Jesus", "Navas", "1616L", Date.valueOf(LocalDate.of(2011, 4, 8)));
		service.addClient("Ivan", "Rakitic", "1010C", Date.valueOf(LocalDate.of(2018, 2, 28)));
		service.addClient("Erik", "Lamela", "1111E", Date.valueOf(LocalDate.of(2016, 9, 2)));
		service.addClient("Gonzalo", "Montiel", "2222H", Date.valueOf(LocalDate.of(2014, 3, 19)));
		
		Client c1 = service.findByNombreCompleto("Yassine", "Bounou");
		
		List<Client> allClients = service.findAll();
		
		System.out.println("Respuesta: " + c1);
		
		for(Client c: allClients) {
			System.out.println(c);
		}
	}
}
