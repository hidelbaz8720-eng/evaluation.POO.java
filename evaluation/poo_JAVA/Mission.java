package evaluation.poo_JAVA;

public class Mission {

	private int nbJours ;
	Projet projet;
	Employe employe;
	public Mission(int nbJours, Projet projet, Employe employe) {
		super();
		this.nbJours = nbJours;
		this.projet = projet;
		this.employe = employe;
		
	}
	public double calculerMontant() {
		return employe.calculerCout(this.nbJours);
	}
	
	public void afficherRecapitulatif() {
		System.out.println( "Mission [nbJours=" + nbJours + ", projet=" + projet + 
				"employe :"+ employe.afficherDetails()+"le montant calcule"+calculerMontant());
	}
	
	
	

}
