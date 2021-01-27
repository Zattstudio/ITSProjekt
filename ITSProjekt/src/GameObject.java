
public class GameObject {
	protected int posX;
	protected int posY;
	protected int zIndex;
	protected float scale = 1f;
	protected boolean flipped = false;
	protected boolean hidden;
	protected String name;
	public enum Direction {LEFT, RIGHT, UP, DOWN};
	
	public void setPos(int newX, int newY) {
		posX = newX;
		posY = newY;
	}
	
	public int getPosX() {
		int xPos = posX;
		return xPos;
	}
	
	public int getPosY() {
		int yPos = posY;
		return yPos;
	}
	public GameObject() {
		System.out.print(Direction.DOWN);
	}
}
