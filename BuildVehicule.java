package ex3;

public abstract class BuildVehicule {

		public Vehicule vehicule;
		
		public Vehicule CreeVehicule() {
			return vehicule;
		}
		
		 public Vehicule getVehicule() { 
		 	return vehicule; 
		 }

		  public void creerNouvelleVehicule() { 
		  	vehicule = new Vehicule(); 
		  }

		  public abstract void creerNom(String nom);
		  public abstract void creerNbroue();
		
		

}
