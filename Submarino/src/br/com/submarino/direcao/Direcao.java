package br.com.submarino.direcao;

public enum Direcao{
	NORTE(0)
	,LESTE(1)
	,SUL(2)
	,OESTE(3);
	
	private int value;
	
	Direcao(int value){
		this.value = value;
	}
	public int getValue(){
		return value;
	}
}
