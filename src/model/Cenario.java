package model;

public class Cenario extends GameObject{

	public Cenario(int posX, int posY) {
		super(posX, posY);
	}

	@Override
	public void update() {
		System.out.println("update do cenario");
	}
	@Override
	public void draw() {
		System.out.println("draw do cenario");
	}

	
}
