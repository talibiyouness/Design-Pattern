package ex2;

public class WindowsFactory implements ICompositeFactory   {


	public WindowsMenu getMenu() { 

		return new WindowsMenu();
		
	}
	public WindowsBouton getBouton() {
		
		return new WindowsBouton();
	}
}
