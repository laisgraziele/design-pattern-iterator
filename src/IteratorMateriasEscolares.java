import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMateriasEscolares {
	
	public static void main(String[] args) {
		
		ArrayList<String> ListaCanetas = new ArrayList<String>();
		ArrayList<String> ListaLapis = new ArrayList<String>();
		
		
		
		ListaCanetas.add("Caneta Azul Bic");
		ListaCanetas.add("Caneta Preta Compactor");
		ListaCanetas.add("Caneta Vermelha Bic");
		
		
		ListaLapis.add("Lapis de cor - Faber Castel");
		ListaLapis.add("Lapis Grafitte - Faber Castel");
		ListaLapis.add("Lapis Preto 4B - Faber Castel ");
		
		Iterator<String> it_canetas = ListaCanetas.iterator();
		Iterator<String> it_lapis = ListaLapis.iterator();
		
		
		System.out.println("---- Lista Canetas ----");
		while (it_canetas.hasNext()) {
			System.out.println(it_canetas.next());
		}
		
		System.out.println("---- Lista Lapis ----");
		while(it_lapis.hasNext()) {
			System.out.println(it_lapis.next());
		}
	}

}
