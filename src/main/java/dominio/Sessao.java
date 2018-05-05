package main.java.dominio;

import java.time.LocalTime;

public class Sessao {

	private Filme filme;

	private LocalTime horario;

	/**
	 * @param filme
	 * @param horario
	 */
	public Sessao(Filme filme, LocalTime horario) {
		super();
		this.filme = filme;
		this.horario = horario;
	}

	/**
	 * 
	 */
	public Sessao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public LocalTime getHorario() {
		return horario;
	}

	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}

}
