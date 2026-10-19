package evaluation.poo_JAVA;

public class Commercial extends Employe {
	private double tauxPrime ;

	public Commercial(String matricule, String nom, double tarifJournalier,double tauxPrime ) {
		super(matricule, nom, tarifJournalier);
		this.tauxPrime =tauxPrime ;
		// TODO Auto-generated constructor stub
	}

	@Override
	double calculerCout(int nbJours) {
		// TODO Auto-generated method stub
		 double montantBase=(tarifJournalier * nbJours);
		return (montantBase + montantBase * tauxPrime);
	}

}
