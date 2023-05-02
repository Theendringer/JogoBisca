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
		
		
		for(int i=0; i<=6;i++) {
			System.out.println("Jogador 1, qual carta deseja jogar?");
			pos = sc.nextInt();
			j1.jogarCartaPosicao(pos);
			j1.cartaJogada();
			
			
			System.out.println("Jogador 2, qual carta deseja jogar?");
			pos = sc.nextInt();
			j2.selecionarCartaPosicao(pos);
			j2.cartaSelecionada();
			if(j2.cartaSelecionada().getPeso() == 11 && j1.cartaJogada().getPeso() == 10) {
				System.out.println("Ás não pode sair antes do 7");
				System.out.println("Escolha outra carta");
				pos = sc.nextInt();
			} else {
				j2.jogarCartaPosicao(pos);
				j2.cartaJogada();
			}
			
			
			
			System.out.println("Jogador 3, qual carta deseja jogar?");
			pos = sc.nextInt();
			j3.selecionarCartaPosicao(pos);
			j3.cartaSelecionada();
			if(j3.cartaSelecionada().getPeso() == 11 && j2.cartaJogada().getPeso() == 10) {
				System.out.println("Ás não pode sair antes do 7");
				System.out.println("Escolha outra carta");
				pos = sc.nextInt();
			} else {
				j3.jogarCartaPosicao(pos);
				j3.cartaJogada();
			}
			
			
			
			System.out.println("Jogador 4, qual carta deseja jogar?");
			pos = sc.nextInt();
			j4.selecionarCartaPosicao(pos);
			j4.cartaSelecionada();
			if(j4.cartaSelecionada().getPeso() == 11 && j3.cartaJogada().getPeso() == 10) {
				System.out.println("Ás não pode sair antes do 7");
				System.out.println("Escolha outra carta");
				pos = sc.nextInt();
			} else {
				j4.jogarCartaPosicao(pos);
				j4.cartaJogada();
			}

			
			rodada = i;
			System.out.println(rodada);
			jogo.comprarCartas(b, j1, j2, j3, j4);
			jogo.pontosRodada(j1, j2, j3, j4);
			jogo.verificaRodada(j1, j2, j3, j4);
			jogo.mostrarCartas(j1, j2, j3, j4);
			//jogo.pontosRodada(j1, j2, j3, j4);
			jogo.verificaRodada(j1, j2, j3, j4);
			b.tamanhoMonte();
			
		}
		
		
		rodada = rodada + 1;
		
		switch(rodada) {
		case 7:
			System.out.println("Jogador 1, qual carta deseja jogar?");
			pos = sc.nextInt();
			j1.jogarCartaPosicao(pos);
			
			System.out.println("Jogador 2, qual carta deseja jogar?");
			pos = sc.nextInt();
			j2.selecionarCartaPosicao(pos);
			j2.cartaSelecionada();
			if(j2.cartaSelecionada().getPeso() == 11 && j1.cartaJogada().getPeso() == 10) {
				System.out.println("Ás não pode sair antes do 7");
				System.out.println("Escolha outra carta");
				pos = sc.nextInt();
			} else {
				j2.jogarCartaPosicao(pos);
				j2.cartaJogada();
			}
			
			System.out.println("Jogador 3, qual carta deseja jogar?");
			pos = sc.nextInt();
			j3.selecionarCartaPosicao(pos);
			j3.cartaSelecionada();
			if(j3.cartaSelecionada().getPeso() == 11 && j2.cartaJogada().getPeso() == 10) {
				System.out.println("Ás não pode sair antes do 7");
				System.out.println("Escolha outra carta");
				pos = sc.nextInt();
			} else {
				j3.jogarCartaPosicao(pos);
				j3.cartaJogada();
			}
			
			

			System.out.println("Jogador 4, qual carta deseja jogar?");
			pos = sc.nextInt();
			j4.selecionarCartaPosicao(pos);
			j4.cartaSelecionada();
			if(j4.cartaSelecionada().getPeso() == 11 && j3.cartaJogada().getPeso() == 10) {
				System.out.println("Ás não pode sair antes do 7");
				System.out.println("Escolha outra carta");
				pos = sc.nextInt();
			} else {
				j4.jogarCartaPosicao(pos);
				j4.cartaJogada();
			}

            jogo.pontosRodada(j1, j2, j3, j4);
			jogo.verificaRodada(j1, j2, j3, j4);
			rodada += 1;
			jogo.mostrarCartas(j1, j2, j3, j4);
			
			
			
		case 8:
			System.out.println("Jogador 1, qual carta deseja jogar?");
			pos = sc.nextInt();
			j1.jogarCartaPosicao(pos);
			
			
			System.out.println("Jogador 2, qual carta deseja jogar?");
			pos = sc.nextInt();
			j2.selecionarCartaPosicao(pos);
			j2.cartaSelecionada();
			if(j2.cartaSelecionada().getPeso() == 11 && j1.cartaJogada().getPeso() == 10) {
				System.out.println("Ás não pode sair antes do 7");
				System.out.println("Escolha outra carta");
				pos = sc.nextInt();
			} else {
				j2.jogarCartaPosicao(pos);
				j2.cartaJogada();
			}
			
			
			System.out.println("Jogador 3, qual carta deseja jogar?");
			pos = sc.nextInt();
			j3.selecionarCartaPosicao(pos);
			j3.cartaSelecionada();
			if(j3.cartaSelecionada().getPeso() == 11 && j2.cartaJogada().getPeso() == 10) {
				System.out.println("Ás não pode sair antes do 7");
				System.out.println("Escolha outra carta");
				pos = sc.nextInt();
			} else {
				j3.jogarCartaPosicao(pos);
				j3.cartaJogada();
			}
			

			System.out.println("Jogador 4, qual carta deseja jogar?");
			pos = sc.nextInt();
			j4.selecionarCartaPosicao(pos);
			j4.cartaSelecionada();
			if(j4.cartaSelecionada().getPeso() == 11 && j3.cartaJogada().getPeso() == 10) {
				System.out.println("Ás não pode sair antes do 7");
				System.out.println("Escolha outra carta");
				pos = sc.nextInt();
			} else {
				j4.jogarCartaPosicao(pos);
				j4.cartaJogada();
			}
			

			jogo.pontosRodada(j1, j2, j3, j4);
			jogo.verificaRodada(j1, j2, j3, j4);
			rodada += 1;	
			jogo.mostrarCartas(j1, j2, j3, j4);
			
			
			
		case 9:
			System.out.println("Jogador 1, qual carta deseja jogar?");
			pos = sc.nextInt();
			j1.jogarCartaPosicao(pos);
			
			System.out.println("Jogador 2, qual carta deseja jogar?");
			pos = sc.nextInt();
			j2.selecionarCartaPosicao(pos);
			j2.cartaSelecionada();
			if(j2.cartaSelecionada().getPeso() == 11 && j1.cartaJogada().getPeso() == 10) {
				System.out.println("Ás não pode sair antes do 7");
				System.out.println("Escolha outra carta");
				pos = sc.nextInt();
			} else {
				j2.jogarCartaPosicao(pos);
				j2.cartaJogada();
			}
			
			
			System.out.println("Jogador 3, qual carta deseja jogar?");
			pos = sc.nextInt();
			j3.selecionarCartaPosicao(pos);
			j3.cartaSelecionada();
			if(j3.cartaSelecionada().getPeso() == 11 && j2.cartaJogada().getPeso() == 10) {
				System.out.println("Ás não pode sair antes do 7");
				System.out.println("Escolha outra carta");
				pos = sc.nextInt();
			} else {
				j3.jogarCartaPosicao(pos);
				j3.cartaJogada();
			}
			
			
			System.out.println("Jogador 4, qual carta deseja jogar?");
			pos = sc.nextInt();
			j4.selecionarCartaPosicao(pos);
			j4.cartaSelecionada();
			if(j4.cartaSelecionada().getPeso() == 11 && j3.cartaJogada().getPeso() == 10) {
				System.out.println("Ás não pode sair antes do 7");
				System.out.println("Escolha outra carta");
				pos = sc.nextInt();
			} else {
				j4.jogarCartaPosicao(pos);
				j4.cartaJogada();
			}
			
			jogo.pontosRodada(j1, j2, j3, j4);
			jogo.verificaRodada(j1, j2, j3, j4);
			jogo.mostrarCartas(j1, j2, j3, j4);

}
	    
	}
	
}
