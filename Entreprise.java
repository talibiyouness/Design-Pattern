package ex5;

public class Entreprise {

	public void afficheDocument(Document document)
	{
		document.afficheDocument();
		
	}
	
	public static void main(String[] args) {
		
		Entreprise e = new Entreprise();
		DocumentPDF pdf = new DocumentPDF();
		DocumentText text = new DocumentText();
		DocumentHTML html = new DocumentHTML();
		
		e.afficheDocument(pdf);
		e.afficheDocument(text);
		e.afficheDocument(html);
	}
}
