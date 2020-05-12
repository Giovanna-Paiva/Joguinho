package model;

public class Hero extends GameObject implements Moveable{
	protected int life;
	protected int power;
	protected int weapon;
	
	public Hero(int posX, int posY, int life, int power, int weapon) {
		super(posX, posY);
		this.life = life;
		this.power = power;
		this.weapon = weapon;
	};
	
	@Override
	public void update() {
		System.out.println("update do Hero");
		move(1,2);
	}
	@Override
	public void draw() {
		System.out.println("draw do Hero");
	}

	@Override
	public void move(int direcao, int velocidade) {
		System.out.println("move Hero: "+direcao+" "+velocidade);
		
	}

}
