package prFibonacciGUI;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FibonacciDemo {
	public static void main(String[] args){
		Fibonacci fib = new Fibonacci();
		ViewFibonacci viewFibonacci = new PanelFibonacci1();
		ActionListener ctrFibonacci = new CtrFibonacci(viewFibonacci,fib);
		viewFibonacci.controlador(ctrFibonacci);
		JFrame ventana = new JFrame("Fibonacci Solver");  	
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setSize(290,110);
		ventana.setContentPane((JPanel) viewFibonacci);		 
		//ventana.pack();	
		ventana.setVisible(true);       
	}
}
