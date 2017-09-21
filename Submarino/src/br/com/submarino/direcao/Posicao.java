package br.com.submarino.direcao;

public class Posicao {
	
	private int x;
	private int y;
	private int z;
	private Direcao direcao;

	public Posicao(){
		direcao= Direcao.NORTE;
		x=0;
		y =0;
		z=0;
	}
	
	public int getX() {
		return x;
	}
	protected void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	protected void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	protected void setZ(int z) {
		this.z = z;
	}
	public Direcao getDirecao() {
		
		return direcao;
	}
	
	protected void setDirecao(Direcao direcao) {
		this.direcao = direcao;
	}

	@Override
	public String toString() {
		return "Posicao [x=" + x + ", y=" + y + ", z=" + z +",direcao=" + direcao.name() +"]";
	}
		
	
}
