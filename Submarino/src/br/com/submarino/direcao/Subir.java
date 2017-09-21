package br.com.submarino.direcao;

public class Subir implements IComando {

	@Override
	public void execute(Posicao posicao) {
		posicao.setZ(posicao.getZ()+1);
		
	}

}
