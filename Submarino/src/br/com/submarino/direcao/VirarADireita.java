package br.com.submarino.direcao;

public class VirarADireita implements IComando {
	
	RosaDosVentos rosaDosVentos = new RosaDosVentos();
	
	@Override
	public void execute(Posicao posicao) {
		posicao.setDirecao(rosaDosVentos.virarDireita(posicao.getDirecao())); 
	}

}
