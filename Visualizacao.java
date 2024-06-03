package Visao;

public class Visualizacao {
	public void mostrarResultado(int indice) {
        if (indice != -1) {
            System.out.println("Elemento encontrado no índice: " + indice);
        } else {
            System.out.println("Elemento não encontrado.");
        }
	}
}
