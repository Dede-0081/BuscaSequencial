package Controle;

import Modelo.modelagem;

public class controlagem {
	
	private modelagem modelo;

    public controlagem(modelagem modelo) {
        this.modelo = modelo;
    }

    public int buscaSequencial(int elemento) {
        int[] numeros = modelo.getNumeros();
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == elemento) {
                return i; 
            }
        }
        return -1; 
    }
}
