package test.models;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.jupiter.api.Test;

import br.unisales.jogoBisca.models.Baralho;
import br.unisales.jogoBisca.models.Carta;
import br.unisales.jogoBisca.models.Jogador;

class BaralhoTest {

	@Test
	void tamanhoDobaralho() {
		Baralho b = new Baralho();
		assertEquals(52, b.tamanhoMonte());
	}

	@Test
	void tamanhoDoMonteDepoisDeComprar() {
		Baralho b = new Baralho();
		b.comprarCarta();
		assertEquals(51, b.tamanhoMonte());
	}

	@Test
	void pegarUmaCartadoMonte() {
		Baralho b = new Baralho();
		Carta c = b.comprarCarta();
		assertEquals("class br.unisales.jogo21.models.Carta", c.getClass().toString());
	}

	@Test
	void pegarCartaEmUmbaralhoOrdenado() {
		Baralho b = new Baralho();
		Carta c = b.obterCartaNaPosicao(9);
		assertEquals("C", c.getNype());
		assertEquals("10", c.getFace());
		assertEquals(10, c.getPeso());
	}

	@Test
	void comprarPrimeiraNoOrdenado() {
		Baralho b = new Baralho();
		Carta c = b.comprarCarta();
		assertEquals("C", c.getNype());
		assertEquals("As", c.getFace());
		assertEquals(1, c.getPeso());
	}

	@Test
	void comprarPrimeiraNoEmbaralhado() {
		Baralho b = new Baralho();
		b.embaralhar();
		Carta c = b.comprarCarta();
		assertNotEquals("C", c.getNype());
		assertNotEquals("As", c.getFace());
		assertNotEquals(1, c.getPeso());
	}

	@Test
	void comprarCartaSemRepeticaoSemEmbaralhar() {
		Baralho b = new Baralho();
		Carta c = b.comprarCarta();

		assertEquals("C", c.getNype());
		assertEquals("As", c.getFace());
		assertEquals(1, c.getPeso());

		c = b.comprarCarta();

		assertEquals("C", c.getNype());
		assertEquals("2", c.getFace());
		assertEquals(2, c.getPeso());
	}

	@Test
	void comprarCartaSemRepeticaoEmbaralhado() {
		Baralho b = new Baralho();
		b.embaralhar();
		Carta c1 = b.comprarCarta();
		Carta c2 = b.comprarCarta();
		assertNotEquals(c1, c2);
	}

	@Test
	void chegarFimBaralho() {
		Baralho b = new Baralho();
		b.embaralhar();
		for (int i = 0; i < 52; i++) {
			b.comprarCarta();
		}

		assertEquals(null, b.comprarCarta());
	}
	@Test
	void sabeComprarAprimeiraCartaOrdenada() {
		Baralho b = new Baralho();
		Jogador j1 = new Jogador();
		j1.comprarCarta(b);

		assertEquals(11, j1.contarPontos());
	}
	@Test
	void sabeComprarTresCartasOrdenadas() {
		Baralho b = new Baralho();
		Jogador j1 = new Jogador();
		j1.comprarCarta(b);
		j1.comprarCarta(b);
		j1.comprarCarta(b);
		
		assertEquals(11, j1.contarPontos());
	}
	
	
	@Test
	void sabeComprarDezCartasOrdendas() {
		Baralho b = new Baralho();
		Jogador j1 = new Jogador();
		j1.comprarCarta(b);
		j1.comprarCarta(b);
		j1.comprarCarta(b);
		j1.comprarCarta(b);
		j1.comprarCarta(b);
		j1.comprarCarta(b);
		j1.comprarCarta(b);
		j1.comprarCarta(b);
		j1.comprarCarta(b);
		j1.comprarCarta(b);
		
		assertEquals(30, j1.contarPontos());
	}
	
	@Test
	void sabeComprarCartaAleatoria() {
		Baralho b = new Baralho();
		b.embaralhar();
		Jogador j1 = new Jogador();
		
		j1.comprarCarta(b);
		
		assertNotEquals(11, j1.contarPontos());	
	}
	
	@Test
	void sabeComprarTodasCartas() {
		Baralho b = new Baralho();
		Jogador j1 = new Jogador();
		
		for(int i =0; i <= 39; i++) {
			j1.comprarCarta(b);
		}
		
		assertEquals(120, j1.contarPontos());
	}
	@Test
	void doisJogadoresComprandoCartaOrdenadasDiferentes() {
		Baralho b = new Baralho();
		Jogador j1 = new Jogador();
		Jogador j2 = new Jogador();
		
		j1.comprarCarta(b);
		j2.comprarCarta(b);
		
		assertEquals(11, j1.contarPontos());
		assertEquals(0, j2.contarPontos());
		
	}
}