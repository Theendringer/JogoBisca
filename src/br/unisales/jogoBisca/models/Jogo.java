package br.unisales.jogoBisca.models;
import java.util.ArrayList;
import java.io.IOException;
import java.util.List;
import java.util.Iterator;

public class Jogo {
	
	Carta trunfo;
	private int pontosJ1; 
	private int pontosJ2;
	private int pontosJ3;
	private int pontosJ4;
	
	
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

public int pontosRodada(Jogador j1, Jogador j2, Jogador j3, Jogador j4) {
	int pontos = j1.cartaJogada().getPeso() + j2.cartaJogada().getPeso() + j3.cartaJogada().getPeso() + j4.cartaJogada().getPeso();
	return pontos;
}


public void verificaRodada(Jogador j1, Jogador j2, Jogador j3, Jogador j4) {
	
	if(j1.cartaJogada().getPeso() >= j2.cartaJogada().getPeso() && j2.cartaJogada().getPeso() >= j3.cartaJogada().getPeso() 
			&& j3.cartaJogada().getPeso() >= j4.cartaJogada().getPeso())  {
		
		pontosJ1 += pontosRodada(j1, j2, j3, j4);
		
	} else if(j2.cartaJogada().getPeso() >= j1.cartaJogada().getPeso() && j2.cartaJogada().getPeso() >= j3.cartaJogada().getPeso() &&
			j3.cartaJogada().getPeso() >= j4.cartaJogada().getPeso()){
		
		pontosJ2 += pontosRodada(j1, j2, j3, j4);
		
	}else if(j3.cartaJogada().getPeso() >= j1.cartaJogada().getPeso() && j3.cartaJogada().getPeso() >= j2.cartaJogada().getPeso() &&
			j3.cartaJogada().getPeso() >= j4.cartaJogada().getPeso()) {
		
		pontosJ3 += pontosRodada(j1, j2, j3, j4);
	} else {
		pontosJ4 += pontosRodada(j1, j2, j3, j4);
	}
	
}

}
