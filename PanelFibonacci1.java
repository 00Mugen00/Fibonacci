package prFibonacciGUI;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PanelFibonacci1 extends JPanel implements ViewFibonacci {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton solve;
	private JTextField campoDeTexto;
	private JLabel solucion;
	
	public PanelFibonacci1(){
		solve = new JButton("SOLVE");
		campoDeTexto = new JTextField(5);
		solucion = new JLabel(" ");
		
		setLayout(new BorderLayout());
		
		JPanel panelCentral = new JPanel();
		panelCentral.add(solve);
		panelCentral.add(campoDeTexto);
		add(panelCentral,BorderLayout.CENTER);
		
		JPanel panelSur = new JPanel();
		panelSur.add(new JLabel("Solution: "));
		panelSur.add(solucion);
		add(panelSur,BorderLayout.SOUTH);
	}
	
	public int obtenerNumero() {
		return Integer.parseInt(campoDeTexto.getText());
	}

	
	public void imprimirSolucion(int sol) {
		solucion.setText(Integer.toString(sol));
	}

	
	public void controlador(ActionListener ctr) {
		solve.addActionListener(ctr);
	}
	
	public void imprimirMensaje(String str){
		solucion.setText(str);
	}
}
