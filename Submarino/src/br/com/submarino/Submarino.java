package br.com.submarino;

import java.util.Scanner;

import br.com.submarino.direcao.Posicao;
import br.com.submarino.direcao.SistemaDeDirecao;

public class Submarino {

	private Posicao posicao;
	
	private SistemaDeDirecao sistemaDeDirecao;
	
	public Submarino(){
		init();
	}
	
	public void init(){
		posicao = new Posicao();
		sistemaDeDirecao = new SistemaDeDirecao(posicao);
	}
	
	private void dirigir(String stringComandos){
		sistemaDeDirecao.executarComandosBatch(stringComandos);
	}

	public void imprimirPosicao(){
		System.out.println(this.posicao);
	}
	
	public void pilotarSubmarino(){
	    Scanner s = new Scanner(System.in);
	    System.out.println("Bem vindo ao comando do submarino:");
		System.out.println("Digite as instruções de direção: ");
		String comandos = s.nextLine();
		
		this.dirigir(comandos);
		this.imprimirPosicao();
		
	}
}
