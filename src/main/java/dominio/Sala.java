package main.java.dominio;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Sala {

	private String nome;

	private List<Sessao> sessoes;

	/**
	 * @param nome
	 * @param sessoes
	 */
	public Sala(String nome) {
		this(nome, new ArrayList<Sessao>());
	}

	/**
	 * @param nome
	 * @param sessoes
	 */
	private Sala(String nome, List<Sessao> sessoes) {
		this.nome = nome;
		this.sessoes = sessoes;
	}

	public String getNome() {
		return nome;
	}

	public final Boolean adicionarSessao(Sessao sInput) throws Exception {
		boolean add = Boolean.FALSE;
		if (getSessoes().isEmpty())
			getSessoes().add(sInput);
		else {
			LocalTime initInput = sInput.getHorario();
			LocalTime endInput = initInput.plus(sInput.getFilme().getDuracao());
			for (Sessao sessao : getSessoes()) {
				LocalTime init = sessao.getHorario();
				LocalTime end = init.plus(sessao.getFilme().getDuracao());
				if (initInput.isAfter(init) && initInput.isBefore(end)) {
					throw new Exception("Erro ao inserir Sessão 1");
				} else if (endInput.isAfter(init) && endInput.isBefore(end)) {
					throw new Exception("Erro ao inserir Sessão 2");
				} else if (initInput.isBefore(init) && endInput.isAfter(end)) {
					throw new Exception("Erro ao inserir Sessão 3");
				} else if (init.getHour() == initInput.getHour() && init.getMinute() == initInput.getMinute()) {
					throw new Exception("Erro ao inserir Sessão 4");
				}
			}
			add = getSessoes().add(sInput);
		}

		return add;
	}

	private List<Sessao> getSessoes() {
		return sessoes;
	}

}
