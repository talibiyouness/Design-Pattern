package ex4;

public abstract class  Employe {
	protected String nom;
	protected String prenom;
		protected String adresse;
			protected String servicePart;


	public Employe(String nom,String prenom,String adresse,String servicePart) {
		this.nom=nom;
		this.prenom=prenom;
		this.adresse=adresse;
		this.servicePart=servicePart;
	}

	public String getNom()
	{
		return this.nom;
	}

	public String getPrenom()
	{
		return this.prenom;
	}

	public String getAdresse()
	{
		return this.adresse;
	}

	public String getServicePart()
	{
		return this.servicePart;
	}
	
	

}
