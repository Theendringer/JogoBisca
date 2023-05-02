package br.unisales.jogoBisca.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Jogador {
	List<Carta> cartas;
	//List<Carta> cartaJogada;
	Carta jogada;
	Carta selecionada;

	public Jogador() {
		super();
		cartas = new ArrayList<>();
	}

	public void comprarCarta(Baralho b) {
		Carta c = b.comprarCarta();
		cartas.add(c);
		
		//System.out.println(c.toString());
	}

	public int contarPontos() {
		int acc = 0;
		for (Carta carta : cartas) {
			acc += carta.getPeso(); // acc = acc + carta.getPeso();
		}
		
		//System.out.println(acc);//teste 
		return acc;
	}
		
	
}
