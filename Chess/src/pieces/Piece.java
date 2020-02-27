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
	public static Piece hasPosition(Position pos1) {
		Piece[] pieces = new Piece[Piece.count];
		for (Piece p : pieces) {
			if(p.equals(pos1))
				return p;
		}
		return null;
	}
	
	public Color getColor() { return color; }
	public Position getPosition() { return pos; }
	
	public abstract void move(Position go);
	
	protected abstract boolean check(Position go);
	
	protected abstract boolean attack(Position go);
	
}

