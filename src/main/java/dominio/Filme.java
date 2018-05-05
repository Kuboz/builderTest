package main.java.dominio;

import java.time.Duration;

public class Filme {

	private String nome;

	private Duration duracao;

	/**
	 * @param nome
	 * @param duracao
	 */
	public Filme(String nome, Duration duracao) {
		super();
		this.nome = nome;
		this.duracao = duracao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Duration getDuracao() {
		return duracao;
	}

	public void setDuracao(Duration duracao) {
		this.duracao = duracao;
	}

}
