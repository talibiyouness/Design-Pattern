package ex2;

public class Main {

	public static void main(String[] args) {
		
		WindowsFactory  windowsFactory=new WindowsFactory();
		
		Bouton wb=windowsFactory.getBouton();
		Menu wm=windowsFactory.getMenu();
		
		MacFactory  macFactory=new MacFactory();
		
		Bouton mb=macFactory.getBouton();
		Menu mm=macFactory.getMenu();
		
		
	}

}
