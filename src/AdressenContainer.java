import java.util.Map;
import java.util.HashMap;

public class AdressenContainer {
	Map<Adresse, Integer> adressenListe;
	
	public AdressenContainer() {
		adressenListe = new HashMap<>();
	}
	
	//Neue Adresse anlegen
	public boolean addAdresse(Adresse neueAdresse) {
		//Wenn Adresse schon vorhanden false
		if(adressenListe.containsKey(neueAdresse)) {
			return false;
		//Wenn nicht anlegen und true
		}else {
			adressenListe.put(neueAdresse,adressenListe.size()+1);
			return !adressenListe.isEmpty();
		}
	}
	
	//Durch HashMap iterieren und alle vorhandenen Einträge anzeigen
	public void adressenAuflisten() {
		for(Map.Entry<Adresse, Integer> adresse : adressenListe.entrySet()) {
			System.out.println("Name: " + adresse.getKey().getVorname() + " " + adresse.getKey().getNachname());
			System.out.println("Straße: " + adresse.getKey().getStraße() + " " + adresse.getKey().getHausnummer());
			System.out.println("Wohnort: " + adresse.getKey().getPostleitzahl() + " " + adresse.getKey().getOrt());
			System.out.println("Land: " + adresse.getKey().getLand());
			System.out.println();
		}
	}

}
