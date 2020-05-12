package model;

public class SceneObject extends GameObject {

	protected boolean visible;

	public SceneObject(int posX, int posY, boolean visible) {
		super(posX, posY);
		this.visible = visible;
	}

	@Override
	public void update() {
		System.out.println("update do Scene object");
	}

	@Override
	public void draw() {
		System.out.println("draw do Scene object");
	}

}
