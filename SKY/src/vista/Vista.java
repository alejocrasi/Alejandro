package vista;

import javax.swing.JOptionPane;

public class Vista {
	
	public String pediralgo() {
		String algo;
		return algo = JOptionPane.showInputDialog("ingrese algo de combustible");
	}
	public void muestreAlgo(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}

}
