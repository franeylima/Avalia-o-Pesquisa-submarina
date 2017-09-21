package br.com.submarino.direcao;

import java.util.HashMap;
import java.util.Map;

public class SistemaDeDirecao {
	private Posicao posicao;
	private Map<Character,IComando> comandos;
	
	public SistemaDeDirecao(Posicao posicao){
		this.posicao = posicao;
		init();
	}
	
	public void init(){
		comandos = new HashMap<>();
		comandos.put('M', new Mover());
		comandos.put('L', new VirarAEsquerda());
		comandos.put('R', new VirarADireita());
		comandos.put('U', new Subir());
		comandos.put('D', new Descer());
	}
	
	private void executarComando(char comando){
		comandos.get(comando).execute(posicao);
	}
	
	public void executarComandosBatch(String stringComandos){
		stringComandos = stringComandos.toUpperCase();
		for (int i= 0;i<stringComandos.length(); i++){
			executarComando(stringComandos.toCharArray()[i]);
		}
	}
}
