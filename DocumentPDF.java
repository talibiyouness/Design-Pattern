package ex5;

public class DocumentPDF implements Document {

		ComposantPDF cmp = new ComposantPDF();

	@Override
	public void afficheDocument() {
		
		System.out.println("Document PDF");

		cmp.afficheNom();
	
		cmp.afficheVersion();
		
	}


}
