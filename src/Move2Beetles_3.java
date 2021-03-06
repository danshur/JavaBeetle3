
public class Move2Beetles_3 {
	public static void main(String[] args) {
		//create beetles and set position if needed
		Beetle bailey = new Beetle("green");
		Beetle ed = new Beetle("red");
		ed.getPosition();
		ed.turn(180);
		
		//draw square beetles
		drawSquare(bailey);
		drawSquare(ed);
	}

	private static void drawSquare(Beetle name) {
		double move = 100;
		double turn = 90;
		for (int count = 1; count <= 4; count = count + 1) {
			name.move(move);
			name.getPosition();
			name.turn(turn);
		}
	}
}
