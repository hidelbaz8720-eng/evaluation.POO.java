package evaluation.poo_JAVA;

public abstract class Employe {
	protected String matricule;
	protected String nom;
	protected double tarifJournalier;
	private Employe superieur;
	
	public Employe getSuperieur() {
		return superieur;
	}
	
	public void setSuperieur(Employe superieur) {
		if (superieur != null && superieur.getMatricule().equals(this.matricule)) {
			System.out.println("Erreur : Un employé ne peut pas être son propre supérieur.");
			return;
		}
		this.superieur = superieur;
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
	
	public String getNom() {
		return nom;
	}
	
	public abstract double calculerCout(int nbJours);
	
	public void afficherDetails() {
		System.out.print("Employe matricule=" + matricule + ", nom=" + nom + ", tarifJournalier=" + tarifJournalier + " ");
	}
}
