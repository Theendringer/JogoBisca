package test.models;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.jupiter.api.Test;

import br.unisales.jogoBisca.models.Baralho;
import br.unisales.jogoBisca.models.Carta;
import br.unisales.jogoBisca.models.Jogador;
import br.unisales.jogoBisca.models.Jogo;


public class JogoTest {
	
	@Test
	void testeJogo2() {
Baralho b = new Baralho();
		
		Jogador j1 = new Jogador();
		Jogador j2 = new Jogador();
		Jogador j3 = new Jogador();
		Jogador j4 = new Jogador();
		
		Jogo jogo = new Jogo();
		
		b.embaralhar();
		
		
		jogo.iniciaJogo(b, j1, j2, j3, j4);
		
		j1.contarPontos();
		
		
		assertNotEquals(11, j1.contarPontos());	
	}
	
}
