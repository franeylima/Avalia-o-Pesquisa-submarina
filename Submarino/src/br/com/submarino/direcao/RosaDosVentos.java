package br.com.submarino.direcao;

public class RosaDosVentos {
	private Direcao [] direcoes = {Direcao.NORTE,Direcao.LESTE,Direcao.SUL, Direcao.OESTE};
		
	public Direcao virarDireita(Direcao direcaoAtual){
		
		int indiceDirecao = (int) ((direcaoAtual.getValue() == direcoes.length-1)?indiceDirecao=0: (indiceDirecao = direcaoAtual.getValue() + 1));
		return direcoes[indiceDirecao];
	}
	
	public Direcao virarEsqueda(Direcao direcaoAtual){
		int indiceDirecao = (int) ((direcaoAtual.getValue() == 0)?indiceDirecao=direcoes.length-1:(indiceDirecao = direcaoAtual.getValue() - 1));
		return direcoes[indiceDirecao];
	}

}
