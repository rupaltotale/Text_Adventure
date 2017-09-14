import kareltherobot.Robot;
import kareltherobot.World;

public class SortableRobot extends Robot implements SortableBotInterface {

	// main method
	public static void main(String[] args) {
		World.setVisible(true);
		World.setSize(20, 20);
		World.setDelay(5);

		int[] loc = { 3, 3 };
		SortableRobot r = new SortableRobot(2, 3, 10);

		System.out.println("The robot has " + r.getNumBeeps() + " beepers.");

		r.moveToLocation(loc);
		r.showAllBeeps();

		int[] currentLoc = r.getLocation();
		System.out.println("R is on street " + currentLoc[0]
				+ " and on avenue " + currentLoc[1]);
	}

	public SortableRobot(int street, int avenue, int numberOfBeepers) {
		super(street, avenue, North, numberOfBeepers);
		// TODO Auto-generated constructor stub

	}

	// DONNNNNE
	@Override
	public void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();

	}

	// DONNNNNE
	@Override
	public void turnAround() {
		turnLeft();
		turnLeft();
	}

	// DONNNNNE
	@Override
	public void slideLeft(int steps) {
		turnLeft();
		move();
		turnRight();

	}

	// DONNNNNE
	@Override
	public void slideRight(int steps) {
		while(steps>0){
			turnRight();
			move();
			turnLeft();
			steps--;
		}
		
	}

	// DONNNNNE
	@Override
	public void showAllBeeps() {

		while (anyBeepersInBeeperBag()) {
			if (frontIsClear()) {
				move();
			}
			putBeeper();
		}

	}

	// DONNNNNE
	@Override
	public int getNumBeeps() {

		return beepers();
	}

	// DONNNNNE
	@Override
	public int[] getLocation() {

		int[] currentLoc = new int[2];
		currentLoc[0] = street();
		currentLoc[1] = avenue();
		return currentLoc;
	}

	// DONNNNNE
	public void turnNorth() {
		if (facingWest()) {
			turnRight();
		} else if (facingEast()) {
			turnLeft();
		} else if (facingSouth()) {
			turnAround();
		}
	}

	// DONNNNNE
	public void move(int steps) {
		while (steps > 0) {
			if (frontIsClear()) {
				move();
			}

			steps--;
		}
	}

	// DONNNNNE
	public void goToACorner() {
		turnNorth();
		turnLeft();
		while (frontIsClear()) {
			move();
		}
		turnLeft();
		while (frontIsClear()) {
			move();
		}
		turnNorth();
		// at this point the robot is in the left bottom corner facing north

	}

	// DONNNNNE
	@Override
	public void moveToLocation(int[] loc) {

		goToACorner();

		move(loc[0]);

		turnRight();

		move(loc[1]);

		turnLeft();
		// Robot is in the specified location facing north

	}

}