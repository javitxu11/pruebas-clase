package pruebasClase1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class VentanaProgreso extends JFrame{
	
	
	public VentanaProgreso() {
	setTitle("Ejemplo de barra de progreso");
	setSize(640,480);
	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
	JPanel pButton= new JPanel();

	JButton button = new JButton("Click me!");
	add(pButton,BorderLayout.SOUTH);
	pButton.add(button);
	
	JProgressBar progressBar=new JProgressBar(0,10000);
	add(progressBar,BorderLayout.NORTH);
	
	button.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			for(long i=0;i<Long.MAX_VALUE;i++) {
				
				System.out.println(i);
			}
			
			
			
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
