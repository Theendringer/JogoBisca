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
	
}
