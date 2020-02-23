package game;

import pieces.*;

public class Game {
	public static void main(String[] args) {
		Position pos = new Position(5, 2);
		Position pos1 = new Position(6, 3);
		System.out.println(pos.isDiagonal(pos1));
	}
}
