package evaluation.poo_JAVA;


public class Main {
	public static void main(String[] args) {
		Ingenieur i1 =new Ingenieur("test","hamza",500,4);
		Ingenieur i2 =new Ingenieur("test2","mohammed",350,2);
		Commercial c1 = new Commercial("test3", "hamza1", 300);
		Commercial c2 = new Commercial("test4", "commercial2", 400);
		Employe []employe = {i1,i2,c1,c2};
		Projet p1 = null ;
		Projet p2 = null ;
		i2.setSuperieur(i1);
		c1.setSuperieur(i1);
		c2.setSuperieur(c1);
		for (Employe em :employe) {
			em.afficherDetails() ;
			if(em.getSuperieur().equals(null)) {
				System.out.println("pas de supérieur ");
			}
			System.out.println(em.getSuperieur());
		}
		Mission m1 = new Mission(12,p1,i1);
		Mission m2 = new Mission(14,p2,i1);
		Mission m3= new Mission(16,p2,c1);
		Mission m4 = new Mission(80,p1,c2);
		Mission [] mission = {
				m1,m2,m3,m4
		};
		int tout ;
		for(Mission mi :mission ) {
			mi.afficherRecapitulatif();
			tout +=mi.calculerMontant();
		}
		System.out.println("Montant total de toutes les missions : "+tout);
		int nbSupervisesDirects = 0;
        for (Employe em : employes) {
            if (em.getSuperieur() == i1) {
                nbSupervisesDirects++;
            }
			System.out.println("\nLe nombre d'employés directement supervisés par " + i1.getNom() + " est : " + nbSupervisesDirects);
	}

}
