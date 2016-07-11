package prFibonacciGUI;

import java.awt.event.ActionListener;

public interface ViewFibonacci {
	String SOLVE = "SOLVE";
	int obtenerNumero();
	void imprimirSolucion(int sol);
	void controlador(ActionListener ctr);
	void imprimirMensaje(String str);
}
