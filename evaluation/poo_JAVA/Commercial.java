package evaluation.poo_JAVA;

public class Commercial extends Employe {
	private double tauxPrime ;

	public Commercial(String matricule, String nom, double tarifJournalier) {
		super(matricule, nom, tarifJournalier);
		// TODO Auto-generated constructor stub
	}

	@Override
	double calculerCout(int nbJours) {
		// TODO Auto-generated method stub
		 double montantBase=(tarifJournalier * nbJours);
		return (montantBase + montantBase * tauxPrime);
	}

}
