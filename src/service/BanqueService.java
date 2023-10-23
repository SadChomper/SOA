package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class BanqueService {
	List<Compte> comptes = new ArrayList<Comptes>();
	public double conversion(double montant) {
		return montant * 3.36;}
	public Compte getCompte(int code) {
		return new compte(code, 0, new Date());
	}
	public List<Compte> getComptes() {
		Compte c1 = new Compte(0, 0, new Date());
		Compte c2 = new Compte(1, 0, new Date());
		comptes.add(c1);
		comptes.add(c2);
		return comptes;
	}
}