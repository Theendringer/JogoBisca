package br.unisales.jogoBisca;
import java.util.Scanner;
import br.unisales.jogoBisca.models.*;

public class Programa {
	
	public static void main(String [] args){ 
	   
	    Scanner sc = new Scanner(System.in);
			
		Baralho b = new Baralho();
		b.embaralhar();
		
		
		Jogador j1 = new Jogador();
		Jogador j2 = new Jogador();
		Jogador j3 = new Jogador();
		Jogador j4 = new Jogador();
			
		Jogo jogo = new Jogo();

	    //iniciar jogo e criar variveis de posição e rodada
		
		
		jogo.iniciaJogo(b, j1, j2, j3, j4);
		
		int pos;
		int rodada = 0;
	    
	}
	
}
