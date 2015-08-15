
public class Move2Beetles_3 {
	public static void main(String[] args) {
		//create beetles and set position if needed
		Beetle bailey = new Beetle("green");
		Beetle ed = new Beetle("red");
		ed.getPosition();
		ed.turn(180);
		
		//draw beetles
		drawOctagon(bailey);
		drawOctagon(ed);
	}

	private static void drawOctagon(Beetle name) {
		double move = 100;
		double turn = 45;
		for (int count = 1; count <= 8; count = count + 1) {
			name.move(move);
			name.getPosition();
			name.turn(turn);
		}
	}
}