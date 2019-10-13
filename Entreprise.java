package ex3;

public class Entreprise {

	  private BuildVehicule buildVehicule;

	  public void setBuildVehicule(BuildVehicule bv) {
	   
	   buildVehicule = bv; 
	
		}

	  public Vehicule getVehicule() { 
	  	return buildVehicule.getVehicule(); 
	  }

	  public void constructVoiture(String nom) {
	  	
		  buildVehicule.creerNouvelleVehicule();
		  buildVehicule.creeNbroue();
		  buildVehicule.creeNom(nom);
		  

	  }
}
