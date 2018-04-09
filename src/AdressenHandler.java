import java.util.Scanner;

public class AdressenHandler {
	
	
	//Konsolenabfrage Adressen anlage
	public Adresse readAdress(Scanner userInput) {
		Adresse neueAdresse = new Adresse();
		
		System.out.println("Bitte geben Sie einen Vorname ein");
		if(userInput.hasNextLine()) {
			neueAdresse.setVorname(userInput.nextLine());
		}
		System.out.println("Bitte geben Sie einen Nachnamen ein");
		if(userInput.hasNextLine()) {
			neueAdresse.setNachname(userInput.nextLine());
		}
		System.out.println("Bitte geben Sie ihren Straßennamen ein");
		if(userInput.hasNextLine()) {
			neueAdresse.setStraße(userInput.nextLine());
		}
		System.out.println("Bitte geben Sie ihre Hausnummer ein");
		if(userInput.hasNextLine()) {
			neueAdresse.setHausnummer(userInput.nextLine());
		}
		System.out.println("Bitte geben Sie ihre Postleitzahl ein");
		if(userInput.hasNextLine()) {
			neueAdresse.setPostleitzahl(userInput.nextLine());
		}
		System.out.println("Bitte geben Sie ihren Wohnort ein");
		if(userInput.hasNextLine()) {
			neueAdresse.setOrt(userInput.nextLine());
		}
		System.out.println("Bitte geben Sie ihr Land ein");
		if(userInput.hasNextLine()) {
			neueAdresse.setLand(userInput.nextLine());
		}
		
		return neueAdresse;
	}
	
	//Auflistung starten
	public void adressenAuflisten(AdressenContainer adressenContainer) {
		adressenContainer.adressenAuflisten();
	}
}
