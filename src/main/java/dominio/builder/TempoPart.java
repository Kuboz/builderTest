package main.java.dominio.builder;

public class TempoPart {

	private TempoBuilder tempoBuilder;

	/**
	 * @param tempoBuilder
	 */
	public TempoPart(TempoBuilder tempoBuilder) {
		super();
		this.tempoBuilder = tempoBuilder;
	}

	public TempoBuilder getTempoBuilder() {
		return tempoBuilder;
	}

	public void setTempoBuilder(TempoBuilder tempoBuilder) {
		this.tempoBuilder = tempoBuilder;
	}

}
