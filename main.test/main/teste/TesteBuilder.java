package main.teste;

import java.time.Duration;
import java.time.LocalTime;

import org.junit.Test;

import main.java.dominio.Filme;
import main.java.dominio.Sessao;
import main.java.dominio.builder.SessaoBuilder;
import main.java.dominio.builder.TempoBuilder;

public class TesteBuilder {

	@Test
	public void testarCriacaoBuilderSessao(){
		Sessao sessao = SessaoBuilder
				.paraOFilme(
						new Filme("Vingadores Guerra Infinita", 
								Duration.ofMinutes(180)
						)
				)
				.as(TempoBuilder.horas(10).eMinutos(30).build()).build();
	}

}
