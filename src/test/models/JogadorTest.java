package test.models;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.jupiter.api.Test;

import br.unisales.jogoBisca.models.Baralho;
import br.unisales.jogoBisca.models.Carta;
import br.unisales.jogoBisca.models.Jogador;

class JogadorTest {

	@Test
	void jogarPrimeiraSegundaCarta() {
		Baralho b = new Baralho();
		Jogador j1 = new Jogador();
		
		j1.comprarCarta(b);
		j1.comprarCarta(b);
		j1.comprarCarta(b);
		
		
		j1.jogarCartaPosicao(0);
		j1.jogarCartaPosicao(1);
		
		
		assertEquals(0, j1.contarPontos());
		
	}
	
	@Test
	void jogarSegundaTerceiraCarta() {
		Baralho b = new Baralho();
		Jogador j1 = new Jogador();
		
		j1.comprarCarta(b);
		j1.comprarCarta(b);
		j1.comprarCarta(b);
		
		
		j1.jogarCartaPosicao(1);
		j1.jogarCartaPosicao(1);
		
		
		assertEquals(11, j1.contarPontos());
		
	}
	
	void quatroJogadoresComprandoCartasDiferentesEmbaralhado() {
		Baralho b = new Baralho();
		Jogador j1 = new Jogador();
		Jogador j2 = new Jogador();
		Jogador j3 = new Jogador();
		Jogador j4 = new Jogador();
		b.embaralhar();
		
		j1.comprarCarta(b);
		j2.comprarCarta(b);
		j3.comprarCarta(b);
		j4.comprarCarta(b);
		
		assertNotEquals(j1.contarPontos(), j2.contarPontos());
		assertNotEquals(j1.contarPontos(), j3.contarPontos());
		assertNotEquals(j1.contarPontos(), j4.contarPontos());
		
		assertNotEquals(j2.contarPontos(), j3.contarPontos());
		assertNotEquals(j2.contarPontos(), j4.contarPontos());
		
		
		assertNotEquals(j3.contarPontos(), j4.contarPontos());
		
	}
	
}
