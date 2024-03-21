package negocio;

import javax.swing.JOptionPane;

import modelagem.Estudante;

/**
 * @author PC-JORGE Classe de negócio Fila que possui estrutura para armazenar
 *         objetos (estudantes) e possui também métodos para adicionar, mostrar
 *         e remover objetos do vetor.
 */
public class Fila {

	private int inicio;
	private int fim;
	private int tamanho;
	private int qtdElementos;
	private Estudante fila[];

	public Fila() {
		this.inicio = this.fim = -1;
		this.tamanho = 4;
		this.fila = new Estudante[tamanho];
		this.qtdElementos = 0;
	}

	public boolean estaVazia() {
		if (qtdElementos == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean estaCheia() {
		if (qtdElementos == tamanho - 1) {
			return true;
		} else {
			return false;
		}
	}

	public void adicionarNaFila(Estudante estudante) {
		if (!estaCheia()) {
			if (inicio == -1) {
				inicio = 0;
			}
			fim++;
			fila[fim] = estudante;
			qtdElementos++;
		}
	}

	public void remover() {
		if (!estaVazia()) {
			inicio++;
			qtdElementos--;
		}
	}

	public void mostrar() {
		String pessoas = "";
		for (int i = inicio; i <= fim; i++) {
			pessoas += fila[i] + "\n";
		}
		JOptionPane.showMessageDialog(null, pessoas.toString(), "FILA ATUAL", JOptionPane.WARNING_MESSAGE);
	}
}
