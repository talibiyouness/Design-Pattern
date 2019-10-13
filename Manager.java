package ex4;

public class Manager extends Employe{

	private double salaire;
	private Employe[] emp;


	public Manager(String nom,String prenom,String adresse,String servicePart,Employe[] emp,double salaire) {
		super(nom,prenom,adresse,servicePart);
		this.salaire=salaire;
		this.emp=emp;

	}

	public Employe emp() {
			int i=0;
		for(Employe emp: emp){
				emp[i] = emp.nom;	
				i++;
			}
		return emp;
	}

	public double salaire() {
		return salaire;
	}

	

	

}