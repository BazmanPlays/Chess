package pieces;

public abstract class Piece {
	//Color, Position
	private Color color;
	private Position pos;
	public static int count = 0;
	
	public Piece(Color color, Position pos) {
		this.color = color;
		this.pos = pos;
		count++;
	}
	
	public Color getColor() { return color; }
	public Position getPosition() { return pos; }
	
	public abstract void Move(Position go);
	
	protected abstract boolean Check();
	
	protected abstract boolean Attack();
	
}

