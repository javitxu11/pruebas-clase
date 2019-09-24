package pruebasClase1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;

public class VentanaProgreso extends JFrame {

	private boolean parar = false;
	long i;
	public VentanaProgreso() {
		setTitle("Ejemplo de barra de progreso");
		setSize(640, 480);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		JPanel pButton = new JPanel();

		JButton button = new JButton("Click me!");
		add(pButton, BorderLayout.SOUTH);
		pButton.add(button);

		JProgressBar progressBar = new JProgressBar(0,100);
		add(progressBar, BorderLayout.NORTH);

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Thread thread1 = new Thread(new Runnable() {
				
					@Override
					public void run() {
						for (i=0; i <= 100000000 && !parar; i++) {
							SwingUtilities.invokeLater(new Runnable() {
								
								@Override
								public void run() {
									
									progressBar.setValue((int)(i/100000000.0*100) ); 
								}
							});
							
						}
					}
				});
				thread1.start();
			}

		});
			addWindowListener(new WindowAdapter() {

				@Override
				public void windowClosing(WindowEvent e) {
					super.windowClosing(e);
					parar=true;
				}
				
			});
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VentanaProgreso v1 = new VentanaProgreso();
		v1.setVisible(true);

	}

}
