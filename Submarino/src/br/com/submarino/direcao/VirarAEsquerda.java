package br.com.submarino.direcao;

public class VirarAEsquerda implements IComando {

	RosaDosVentos rosaDosVentos = new RosaDosVentos();
	
	@Override
	public void execute(Posicao posicao) {
		posicao.setDirecao(rosaDosVentos.virarEsqueda(posicao.getDirecao())); 
	}

}
