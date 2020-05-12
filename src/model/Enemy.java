package model;

public class Enemy extends GameObject implements Moveable{
	protected int life;

	public Enemy(int posX, int posY, int life) {
		super(posX, posY);
		this.life = life;
	}
	
	@Override
	public void update() {
		System.out.println("update do Enemy");
		move(2,3);
	}
	@Override
	public void draw() {
		System.out.println("draw do Enemy");
	}

	@Override
	public void move(int direcao, int velocidade) {
		System.out.println("move Enemy: "+direcao+" "+velocidade);
		
	}
	
	
}
