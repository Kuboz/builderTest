package main.java.dominio.builder;

public class HoraPart {

	private int horas;

	/**
	 * @param horas
	 */
	public HoraPart(int horas) {
		super();
		this.horas = horas;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public TempoBuilderEnd eMinutos(int i) {
		// TODO Auto-generated method stub
		return new TempoBuilderEnd(i);
	}

}
