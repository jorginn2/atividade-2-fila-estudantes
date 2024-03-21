package modelagem;

/**
 * @author PC-JORGE Classe de modelagem que representa a abstração de um
 *         estudante.
 */
public class Estudante {

	private String nome;
	private int senha;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Nome do estudante: " + this.nome + "\nSenha da fila: " + this.senha;
	}
}
