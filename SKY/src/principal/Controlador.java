package principal;

import modelo.Mundo;
import vista.Vista;

public class Controlador {
	private Mundo mundo;
	private Vista vista;
	
	
	public Controlador() {
		mundo = new Mundo();
		vista = new Vista();
		
		String r = vista.pediralgo();
		
		if(r.equals(1)){
			mundo.getSeaPlane().echarCombustible(vista.pediralgo());
			vista.muestreAlgo("su tanque de combustible esta lleno de "+ r);
		}
		else if (r.equals(2)){
			
		}
		
		
		
		
		

	}
	
	public static void main(String[] args) {
		Controlador c = new Controlador();
	}

}
