package pruebasVentanas;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;



public class Ventana1 extends JFrame{
	private static final long serialVersionUID = 1L;
	public Ventana1() {
		
		setTitle("prueba de Jlist");
		setSize(640,400);
		
		DefaultListModel <String>listModel= new DefaultListModel<String>();
		listModel.addElement("nombre1");
		listModel.addElement("nombre2");
		listModel.addElement("nombre3");
		
		JList<String>jList= new JList<String>(listModel);
		JScrollPane scrollPane= new JScrollPane(jList);
		
		JPanel panel = new JPanel();
		JButton boton= new JButton("Añadir");
		panel.add(boton);
		
		JButton boton2= new JButton("Eliminar");
		panel.add(boton2);
		JTextField texto = new JTextField(20);
		panel.add(texto);
		//String[] columNames= {"column1","column2"};
		//String[][] data= {
		//		{"Nombre1","dato1"},
		//		{"Nombre2","dato2"}
		//};
		//DefaultTableModel tableModel= new DefaultTableModel(data,columNames);
		
		//JTable jTable = new JTable(tableModel);
		
		//JScrollPane tablePanel = new JScrollPane(jTable);
		//panel.add(tablePanel,BorderLayout.SOUTH);
		
		
		boton.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				String text = texto.getText();
				if(!text.isEmpty()){
					listModel.addElement(text);
				}
			}
		});
			 
		boton2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(jList.getSelectedIndex()!=-1) {
					listModel.remove(jList.getSelectedIndex());	
				}
				
			}
		});
		add(panel,BorderLayout.CENTER);
		add(scrollPane, BorderLayout.WEST);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				new Ventana1();
				
			}
		});
	}

}
