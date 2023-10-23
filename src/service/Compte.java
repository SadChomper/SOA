package service;

import java.util.*;

public class Compte {
	public Compte(int code, double solde, Date date) {
		super();
		this.code = code;
		this.solde = solde;
		this.date = date;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getSolde() {
		return solde;
	}
	public void setSolde(int solde) {
		this.solde = solde;
	}
	public String getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
