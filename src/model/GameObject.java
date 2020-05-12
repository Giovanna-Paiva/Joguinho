package model;

public abstract class GameObject {
	protected int posX;
	protected int posY;

	public GameObject(int posX, int posY) {
		super();
		this.posX = posX;
		this.posY = posY;
	}

	public abstract void update();

	public abstract void draw();

	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	@Override
	public String toString() {
		return "GameObject [posX=" + posX + ", posY=" + posY + "]";
	}


}
