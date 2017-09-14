import javax.swing.JOptionPane;

import kareltherobot.World;


public class SortRobotDriver {

	public static void main(String[] args) {
		new SortRobotDriver().start();
	}

	private void start() {
		World.setVisible(true);
		//1. ask for the number of robots and  the max number of beepers.
		int numberOfBots = Integer.parseInt(JOptionPane.showInputDialog("How many robots should be created? "));
		int maxBeepers = Integer.parseInt(JOptionPane.showInputDialog("What is the maximum beepers a robot can have?"));
		
		
		
		//2. Create an array with the inputed number of robots, each having a random number of beepers form 0 to max
		SortableRobot[] sortableRobots = new SortableRobot[numberOfBots];
		for(int i = 0; i<numberOfBots; i++){
			int beepers = (int )(Math. random()*maxBeepers);
			int avenue = i+1;
			sortableRobots[i] = new SortableRobot(1,avenue,beepers);
		}
		
		//SortableRobot[] bots;// = makeBots(numBots, maxBeeps);
		//3. Find robot with min # of beeps. Have that bot show all beeps
		//4. Repeat looking for max # of beeps.
		
		
		//Now sort 
		//A.  BubbleSort
		//B.  SelectionSort
		//C.  InsertionSort
		//D.  QuickSort
		//E.  MergeSort
		
		
		
		
		
		
	}

}
