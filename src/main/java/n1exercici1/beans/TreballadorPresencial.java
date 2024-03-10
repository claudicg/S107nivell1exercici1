package n1exercici1.beans;

public class TreballadorPresencial extends Treballador{
	
	private static int BENZINA = 200;

	public TreballadorPresencial(String nom, String cognom, int preuHora) {
		super(nom, cognom, preuHora);
		
	}

	@Override
	public int calcularSou(int horesTreballades) {
		
		int souFinal = (horesTreballades * super.preuHora) + BENZINA;
		
		return souFinal;
		
	}
	
}
