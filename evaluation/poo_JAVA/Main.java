package evaluation.poo_JAVA;

public class Main {
	public static void main(String[] args) {
		Ingenieur i1 = new Ingenieur("EMP01", "hamza", 500, 4);
		Ingenieur i2 = new Ingenieur("EMP02", "mohammed", 350, 2);
		Commercial c1 = new Commercial("EMP03", "hamza1", 300, 0.10);
		Commercial c2 = new Commercial("EMP04", "commercial2", 400, 0.15);
		
		Employe[] employe = {i1, i2, c1, c2};
		
		Projet p1 = new Projet("PRJ1", "Projet ERP");
		Projet p2 = new Projet("PRJ2", "Projet Web");
		
		i2.setSuperieur(i1);
		c1.setSuperieur(i1);
		c2.setSuperieur(c1);
		
		for (Employe em : employe) {
			em.afficherDetails();
			if (em.getSuperieur() == null) {
				System.out.println("-> Pas de supérieur");
			} else {
				System.out.println("-> Supérieur : " + em.getSuperieur().getNom());
			}
		}
		
		Mission m1 = new Mission(3, p1, i1);
		Mission m2 = new Mission(2, p2, i2);
		Mission m3 = new Mission(4, p1, c1);
		Mission m4 = new Mission(2, p2, c2);
		
		Mission[] mission = {m1, m2, m3, m4};
		
		double tout = 0.0;
		for (Mission mi : mission) {
			mi.afficherRecapitulatif();
			tout += mi.calculerMontant();
		}
		System.out.println("Montant total de toutes les missions : " + tout + " DH");
		
		int nbSupervisesDirects = 0;
		for (Employe em : employe) {
			if (em.getSuperieur() == i1) {
				nbSupervisesDirects++;
			}
		}
		System.out.println("\nLe nombre d'employés directement supervisés par " + i1.getNom() + " est : " + nbSupervisesDirects);
	}
}
