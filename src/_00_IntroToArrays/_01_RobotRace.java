package _00_IntroToArrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		
		//2. create an array of 5 robots.
		Robot[] rob = new Robot[5];
		//3. use a for loop to initialize the robots.
		for (int i = 0; i < rob.length; i++) {
			rob[i] = new Robot();
			//4. make each robot start at the bottom of the screen, side by side, facing up
			rob[i].setX(200*i + 50);
			rob[i].setY(550);
		}
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
		Random randy = new Random(50);
    	for (int i = 0; i < rob.length; i++) {
    		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
    		while(rob[i].getY() > 0) {
    			rob[i].setY(rob[i].getY() + randy.nextInt());
    		}
    		//7. declare that robot the winner and throw it a party!
    		if (rob[i].getY() <= 0) {
    			System.out.println("Robot " + rob[i] + " Won!");
    		}
		}
		

		
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	}
}
