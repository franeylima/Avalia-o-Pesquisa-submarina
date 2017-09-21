package br.com.submarino.direcao;

public class Mover implements IComando{

	@Override
	public void execute(Posicao posicao) {
		
		if (posicao.getDirecao()==Direcao.NORTE){
			posicao.setY(posicao.getY()+1);
			return;
		}
		
		if (posicao.getDirecao()==Direcao.LESTE){
			posicao.setX(posicao.getX()+1);
			return;
		}
		
		if (posicao.getDirecao()==Direcao.SUL){
			posicao.setY(posicao.getY()-1);
			return;
		}
		
		if (posicao.getDirecao()==Direcao.OESTE){
			posicao.setY(posicao.getY()-1);
		}
			
	}

}
