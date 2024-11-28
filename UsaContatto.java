
public class UsaContatto {
	
	public static void main(String[] args) {
		
		
		Contatto c1 = new Contatto("Mario", "Rossi", "3382323");
		Contatto c2 = new Contatto("Luigi", "Bianchi", "3382344");
		Contatto c3 = new Contatto("Lucia", "Gialli", "3382300");
		
		/*System.out.println(c3.getNumero());
		
		c3.setNumero("333546789");
		
		System.out.println(c3);*/
		
		Rubrica r1 = new Rubrica();
		r1.addContatto(c1);
		r1.addContatto(c2);
		r1.addContatto(c3);
		
		//r1.rimuovi(c1.getNome(), c1.getCognome());
		
		r1.stampaRubrica();
		
		r1.modificaNumero("Mario", "Rossi", "166166166");
		
	//	System.out.println(r1.cerca("Mario", "Rosso"));
		
		r1.stampaRubrica();
		
		
		
		
		
	}

}
