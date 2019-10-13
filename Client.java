package ex3;

public class Client {

	public static void main(String[] args) {

		Entreprise entreprise = new Entreprise();
		BuildVoitures voiture  = new BuildVoitures();
		BuildMotos moto = new BuildMotos();

	    entreprise.setBuildVehicule(voiture);
	    entreprise.constructVoiture("Mercedes");

	    Vehicule mercedes = entreprise.getVehicule();
	    
	    entreprise.setBuildVehicule(moto);
	    entreprise.constructVoiture("TMAX");

	    Vehicule tmax = entreprise.getVehicule();
	    
	    System.out.println(mercedes.getNom());
	    System.out.println(tmax.getNom());
	}

}
