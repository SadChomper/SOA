package web;

import entities.Compte;
import entities.EtatCompte;
import entities.TypeCompte;
import repositories.CompteRepository;
import java.util.Date;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "repositories") // Active la configuration des dépôts JPA
@EntityScan(basePackages = "entities") // Active la recherche des entités JPA
public class Tp6SoaApplication {
	public static void main(String[] args) {
		SpringApplication.run(Tp6SoaApplication.class, args);
	}
	@Bean
	public CommandLineRunner start(CompteRepository compterep){
		return args -> {
			Compte compte1 = new Compte(null, 123, new Date(), TypeCompte.EPARGNE, EtatCompte.ACTIVE);
			Compte compte2 = new Compte(null, 145, new Date(), TypeCompte.EPARGNE, EtatCompte.ACTIVE);
			Compte compte3 = new Compte(null, 255, new Date(), TypeCompte.COURANT, EtatCompte.SUSPENDU);
			compterep.save(compte1);
			compterep.save(compte2);
			compterep.save(compte3);
			compterep.findAll().forEach(compte ->{
				System.out.println(compte.getSolde());
			});
		};
	}
}
