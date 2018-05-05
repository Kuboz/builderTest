package main.java.dominio.builder;

import main.java.dominio.Filme;

public class FilmePart {

	private Filme filme;

	/**
	 * @param filme
	 */
	public FilmePart(Filme filme) {
		super();
		this.filme = filme;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public TempoPart as(TempoBuilder tempo) {
		// TODO Auto-generated method stub
		return new TempoPart(tempo);
	}

}
