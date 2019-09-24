package pruebasClase1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class VentanaProgreso extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VentanaProgreso v1 = new VentanaProgreso();
		v1.setBounds(0, 0, 600, 400);
		v1.setVisible(true);
		JPanel panel1 = new JPanel();
		JProgressBar progressBar = new JProgressBar();
		v1.add(panel1);

		panel1.add(progressBar);
		
	}

}
