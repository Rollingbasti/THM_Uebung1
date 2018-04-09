import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Instanzen des Adressenhandler & des Containers
		AdressenHandler adressenReader = new AdressenHandler();
		AdressenContainer adressenContainer = new AdressenContainer();
		//Scanner Klasse für Konsoleninput
		Scanner userInput = new Scanner(System.in);
		

		boolean next = false;
		
		//Benutzereingabe starten
		do {
			next = false;
			//Prüfung ob Adresse angelegt werden kann, wenn false dann abbruch
			if(!adressenContainer.addAdresse(adressenReader.readAdress(userInput))) {
				System.out.println("Adresse ist bereits angelegt!");
			}
			
			System.out.println("Noch ein Adresse ? (ja/nein)");
			
			//Wenn ja dann Do-Schleife nicht terminieren
			if(userInput.hasNextLine() && "ja".equals(userInput.nextLine())) {
				next = true;
			}
		}while(next);
		
		//Nach Abschluss alle angelegten Adressen anzeigen
		adressenReader.adressenAuflisten(adressenContainer);
	}

}
