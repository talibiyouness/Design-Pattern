package ex4;

import java.util.ArrayList;
import java.util.List;

public 	abstract class EmployeComposite extends Employe{
	
	public EmployeComposite(String nom,String prenom,String adresse,String servicePart) {
		super(nom,prenom,adresse,servicePart);
	
	}


	protected List<Employe> emp= new ArrayList<Employe>();

	public void add(Employe emp) {
		emp.add(emp);
	}
	
}