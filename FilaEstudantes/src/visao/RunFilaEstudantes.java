package visao;

import javax.swing.JOptionPane;

import modelagem.Estudante;
import negocio.Fila;

/**
 * @author PC-JORGE Classe RunFilaEstudantes que tem o objetivo de interagir com
 *         o usuário por meio de telas vindas da classe JOptionPane.
 */
public class RunFilaEstudantes {

	public static void main(String[] args) {
		// criação de objetos
		Estudante estudante = new Estudante();
		Estudante estudanteDois = new Estudante();

		Fila fila = new Fila();
		// boas vindas ao usuário
		JOptionPane.showMessageDialog(null, "BEM VINDO À FILA DE ESTUDANTES");
		JOptionPane.showMessageDialog(null, "Clique em OK para prosseguir");
		// settando informações dos objetos
		estudante.setNome(JOptionPane.showInputDialog(null, "Insira o seu nome: "));
		estudante.setSenha(2510);

		estudanteDois.setNome(JOptionPane.showInputDialog(null, "Insira o seu nome: "));
		estudanteDois.setSenha(2511);
		// chamada do método adicionarNaFila() passando os objetos no parâmetro
		fila.adicionarNaFila(estudante);
		fila.adicionarNaFila(estudanteDois);

		JOptionPane.showMessageDialog(null, "Confira a fila no momento!");
		// chamada do método mostrar() para informar ao usuário a fila de estudantes
		fila.mostrar();
	}
}
