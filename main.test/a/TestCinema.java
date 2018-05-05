package a;

import java.time.Duration;
import java.time.LocalTime;

import org.junit.Test;

import main.java.dominio.Filme;
import main.java.dominio.Sala;
import main.java.dominio.Sessao;

public class TestCinema {

	@Test
	public void TesteComAMesmaHora() {
		Filme filme = new Filme("Vingadores : Guerra Infinita", Duration.ofMinutes(180));
		Sessao sessao = new Sessao(filme, LocalTime.of(14, 0));
		Sessao sessao2 = new Sessao(filme, LocalTime.of(14, 0));

		Sala sala = new Sala("Sala 01");

		try {
			 sala.adicionarSessao(sessao);
			 sala.adicionarSessao(sessao2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void TesteComHoraInicioNovaSessaoAnteriorInicioSessaoExistenteEHoraFimAntesHoraFimSessaoExistente() {
		Filme vingadores = new Filme("Vingadores : Guerra Infinita", Duration.ofMinutes(180));
		Sessao sessao = new Sessao(vingadores, LocalTime.of(14, 0));
		Sessao sessao2 = new Sessao(vingadores, LocalTime.of(12, 0));

		Sala sala = new Sala("Sala 01");

		try {
			 sala.adicionarSessao(sessao);
			 sala.adicionarSessao(sessao2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Test
	public void TesteComHoraInicioNovaSessaoPosteriorInicioSessaoExistenteEHoraFimPosteriorHoraFimSessaoExistente() {
		Filme vingadores = new Filme("Vingadores : Guerra Infinita", Duration.ofMinutes(180));
		Sessao sessao = new Sessao(vingadores, LocalTime.of(14, 0));
		Sessao sessao2 = new Sessao(vingadores, LocalTime.of(16, 0));

		Sala sala = new Sala("Sala 01");

		try {
			 sala.adicionarSessao(sessao);
			 sala.adicionarSessao(sessao2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void TesteComHoraInicioNovaSessaoAnteriorInicioSessaoExistenteEHoraFimPosteriorHoraFimSessaoExistente() {
		Filme filme = new Filme("Vingadores : Guerra Infinita", Duration.ofMinutes(180));
		Filme filme2 = new Filme("Titanic", Duration.ofMinutes(240));
		Sessao sessao = new Sessao(filme, LocalTime.of(14, 0));
		Sessao sessao2 = new Sessao(filme2, LocalTime.of(13, 30));

		try {
			Sala sala = new Sala("Sala 01");
			sala.adicionarSessao(sessao);
			 sala.adicionarSessao(sessao2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
