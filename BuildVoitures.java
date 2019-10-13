package ex3;

public class BuildVoitures extends BuildVehicule{

	@Override
	public void creerNom(String nom) {
		vehicule.setNom(nom);
		
	}

	@Override
	public void creerNbroue() {
		vehicule.setNbRoues(2);
		
	}
	

}
