package evaluation.poo_JAVA;

public abstract class Employe {
	protected String matricule ;
	protected String nom ;
	protected double tarifJournalier ;
	Employe Superieur;
	
	public Employe getSuperieur() {
		return Superieur;
	}
	public void setSuperieur(Employe superieur) {
		Superieur = superieur;
	}
	public Employe(String matricule, String nom, double tarifJournalier) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.tarifJournalier = tarifJournalier;
	}
	public String getMatricule() {
		return matricule;
	}
	abstract double calculerCout(int nbJours) ;
	
	public String afficherDetails() {
		return "Employe [matricule=" + matricule + ", nom=" + nom + ", tarifJournalier=" + tarifJournalier + "]";
	}
	

}
