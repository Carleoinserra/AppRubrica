import java.util.ArrayList;
public class Rubrica {
	
	ArrayList<Contatto> rubrica;
	
	public Rubrica() {
		
		rubrica = new ArrayList<>();
	}
	
	public void addContatto(Contatto c1) {
		
		rubrica.add(c1);
	}
	
	public void rimuovi(String nome, String cognome) {
		
		for (int i = 0; i < rubrica.size(); i++) {
			
			if (rubrica.get(i).getCognome().equalsIgnoreCase(cognome) && rubrica.get(i).getNome().equalsIgnoreCase(nome)) {
				
				rubrica.remove(i);
			}
		}
	}
	
	public void stampaRubrica() {
		
		for (Contatto cont: rubrica) {
			
			System.out.println(cont);
		}
	}
	
	public Contatto cerca(String nome, String cognome) {
		
		Contatto c1 = new Contatto("", "", "");
		
for (int i = 0; i < rubrica.size(); i++) {
			
			if (rubrica.get(i).getCognome().equalsIgnoreCase(cognome) && rubrica.get(i).getNome().equalsIgnoreCase(nome)) {
				
				c1 = rubrica.get(i);
			}
		}
        return c1;
	}
	
	public void modificaNumero(String nome, String cognome, String NuovoNumero) {
		
for (int i = 0; i < rubrica.size(); i++) {
			
			if (rubrica.get(i).getCognome().equalsIgnoreCase(cognome) && rubrica.get(i).getNome().equalsIgnoreCase(nome)) {
				
				rubrica.get(i).setNumero(NuovoNumero);
			}
		}
		
	}

}
