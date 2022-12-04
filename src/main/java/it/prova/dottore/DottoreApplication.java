package it.prova.dottore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.prova.dottore.model.Dottore;
import it.prova.dottore.service.DottoreService;

@SpringBootApplication
public class DottoreApplication implements CommandLineRunner {
	@Autowired
	private DottoreService dottoreService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(DottoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		dottoreService.inserisciNuovo(new Dottore("gianluca","provola","GianlucaProvola1"));
		
		dottoreService.inserisciNuovo(new Dottore("Pippo","Baudo","PippoBaudo1"));
	}

}
