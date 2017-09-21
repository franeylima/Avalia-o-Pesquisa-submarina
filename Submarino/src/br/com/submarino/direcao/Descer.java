package br.com.submarino.direcao;

public class Descer implements IComando {

	@Override
	public void execute(Posicao posicao) {
		posicao.setZ(posicao.getZ()-1);
		
	}

}
