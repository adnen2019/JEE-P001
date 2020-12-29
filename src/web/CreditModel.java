package web;

public class CreditModel {
	
	
	public CreditModel() {
		super();
	}

	public CreditModel(double montant, double duree, double taux) {
		super();
		this.montant = montant;
		this.duree = duree;
		this.taux = taux;
	}

	double montant ;
	double duree ;
	double taux ;
	double mensualite ;
	
public CreditModel(double montant, double duree, double taux, double mensualite) {
		super();
		this.montant = montant;
		this.duree = duree;
		this.taux = taux;
		this.mensualite = mensualite;
	}

public double getMontant() {
	return montant;
}

public void setMontant(double montant) {
	this.montant = montant;
}

public double getDuree() {
	return duree;
}

public void setDuree(double duree) {
	this.duree = duree;
}

public double getTaux() {
	return taux;
}

public void setTaux(double taux) {
	this.taux = taux;
}

public double getMensualite() {
	return mensualite;
}

public void setMensualite(double mensualite) {
	this.mensualite = mensualite;
}


}
