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
	
}
