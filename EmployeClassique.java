package ex4;

public class EmployeClassique extends Employe{
			public int ht;
			public double tauxHoraire; 

	public EmployeClassique(String nom,String prenom,String adresse,String servicePart,int ht,double tauxHoraire) {
		super(nom,prenom,adresse,servicePart);
		this.ht=ht;
		this.tauxHoraire=tauxHoraire;

	}

	public int ht() {
		return ht;
	}

	public double tauxHoraire() {
		return tauxHoraire;
	}
}
