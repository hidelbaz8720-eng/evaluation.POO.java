package evaluation.poo_JAVA;

public class Ingenieur extends Employe {
	private int niveauExpertise ;

	public Ingenieur(String matricule, String nom, double tarifJournalier,int niveauExpertise) {
		super(matricule, nom, tarifJournalier);
		this.niveauExpertise=niveauExpertise;
		// TODO Auto-generated constructor stub
	}

	@Override
	double calculerCout(int nbJours) {
		if(niveauExpertise < 3) {
			return (tarifJournalier * nbJours);
		}
		if(niveauExpertise >= 3) {
			return (tarifJournalier * nbJours) + (100 *nbJours);
		}
		// TODO Auto-generated method stub
		return 0;
	}

}
