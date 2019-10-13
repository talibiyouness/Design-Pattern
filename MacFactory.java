package ex2;

public class MacFactory implements ICompositeFactory   {


	public MacMenu getMenu() { 
		
		return new MacMenu();
	}
	public MacBouton getBouton() {
		
		return new MacBouton();
	}
}
