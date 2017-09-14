
public interface SortableBotInterface {
	void turnRight();
	void turnAround();
	void slideLeft(int steps);
	void slideRight(int steps);
	void showAllBeeps();// drop and move till out of beeps
	int getNumBeeps();
	int[] getLocation();
	void moveToLocation(int[] loc);
}
