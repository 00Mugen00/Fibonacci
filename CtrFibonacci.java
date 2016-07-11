package prFibonacciGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CtrFibonacci implements ActionListener {
	private ViewFibonacci view;
	private Fibonacci fib;
	public CtrFibonacci(ViewFibonacci v,Fibonacci f){
		view=v;
		fib=f;
	}
	public void actionPerformed(ActionEvent evento) {
		String comando = evento.getActionCommand();
		int num=view.obtenerNumero(); 
		try{
			if(comando.equals("SOLVE")){
				view.imprimirSolucion(fib.fibonacci(num));
			}
		}catch(IllegalArgumentException e){
			view.imprimirMensaje(e.getMessage());
		}
	}
}
