package test.models;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CartasTest {

	@Test
	void PesoDaCartaCorreto() {
		Baralho baralho = new Baralho();
		Carta carta = baralho.obterCarta("C", "10");
		assertEquals(carta.getPeso(), 10);
	}
	

}
