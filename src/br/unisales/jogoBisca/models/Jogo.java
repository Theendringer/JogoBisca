package br.unisales.jogoBisca.models;
import java.util.ArrayList;
import java.io.IOException;
import java.util.List;
import java.util.Iterator;

public class Jogo {
	List<Carta> rodada;
	public Jogo() {
		super();
		rodada = new ArrayList<>();
	}
	
	public void getTrunfo() {
		System.out.println(trunfo);
	}
	
public void comprarCartas(Baralho b, Jogador j1, Jogador j2, Jogador j3, Jogador j4) {
		
		j1.comprarCarta(b);
		j2.comprarCarta(b);
		j3.comprarCarta(b);
		j4.comprarCarta(b);
		
	}

public void mostrarCartas(Jogador j1, Jogador j2, Jogador j3, Jogador j4) {
	System.out.println("Cartas J1 = " + j1.mostrarCartas() + "  " + "Cartas J2 = " + j2.mostrarCartas() + "\n" + "Cartas J3 = "
			+ j3.mostrarCartas() + "  " + "Cartas J4 = " + j4.mostrarCartas());	
}
	
public void iniciaJogo(Baralho b, Jogador j1, Jogador j2, Jogador j3, Jogador j4) {
	
	j1.comprarCarta(b);
	j1.comprarCarta(b);
	j1.comprarCarta(b);
	
	j2.comprarCarta(b);
	j2.comprarCarta(b);
	j2.comprarCarta(b);
	
	j3.comprarCarta(b);
	j3.comprarCarta(b);
	j3.comprarCarta(b);
	
	j4.comprarCarta(b);
	j4.comprarCarta(b);
	j4.comprarCarta(b);
	

	this.trunfo = b.sortearTrunfo();
	getTrunfo();
	
	mostrarCartas(j1, j2, j3, j4);

}

}
