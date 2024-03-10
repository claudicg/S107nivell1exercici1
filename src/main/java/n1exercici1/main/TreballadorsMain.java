package n1exercici1.main;

import n1exercici1.beans.TreballadorOnline;
import n1exercici1.beans.TreballadorPresencial;

public class TreballadorsMain {

	
	public static void main(String[] args) {
		
		TreballadorPresencial treballador1Presencial = new TreballadorPresencial("Joan", "López", 20);
		TreballadorOnline treballador1Online = new TreballadorOnline("Olga", "Pons", 18);
		
		System.out.println(treballador1Presencial.calcularSou(160));
		System.out.println(treballador1Online.calcularSou(160));
	}
}
