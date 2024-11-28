import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class UsaContatto {
	
	public static void main(String[] args) {
		
		
	/*	Contatto c1 = new Contatto("Mario", "Rossi", "3382323");
		Contatto c2 = new Contatto("Luigi", "Bianchi", "3382344");
		Contatto c3 = new Contatto("Lucia", "Gialli", "3382300");
		
		/*System.out.println(c3.getNumero());
		
		c3.setNumero("333546789");
		
		System.out.println(c3);
		
		Rubrica r1 = new Rubrica();
		r1.addContatto(c1);
		r1.addContatto(c2);
		r1.addContatto(c3);
		
		//r1.rimuovi(c1.getNome(), c1.getCognome());
		
		r1.stampaRubrica();
		
		r1.modificaNumero("Mario", "Rossi", "166166166");
		
	//	System.out.println(r1.cerca("Mario", "Rosso"));*/

		Rubrica r1 = new Rubrica();
		
		
		
	
		
		
	try {
			// notare le classi degli stream di byte
			ObjectInputStream in =
			new ObjectInputStream ( new BufferedInputStream (
			new FileInputStream ("rubrica.dat" )));
			r1 = ( Rubrica) in . readObject ();
			in . close ();
			} catch ( ClassNotFoundException e) {
			// se il file non contiene un oggetto ....
			System . out . println (" PROBLEMA ( manca oggetto nel file )");
			System . out . println (e );
			} catch ( IOException e) {
			System . out . println (" ERRORE di I/O");
			System . out . println (e );
			}
			
	    r1.stampaRubrica();
	    r1.addContatto(new Contatto("www", "222", "23456"));
		
		try {
			// notare le classi degli stream di byte
			ObjectOutputStream out =
			new ObjectOutputStream ( new BufferedOutputStream (
			new FileOutputStream ("rubrica.dat" )));
			out.writeObject(r1);
			out.close();
			} catch ( IOException e) {
			System . out . println ("ERRORE di I/O");
			System . out . println (e );
			}
		
		//r1.stampaRubrica();
		
		
	}

}
