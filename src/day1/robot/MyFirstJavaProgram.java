package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {

		// START HERE

		Robot bob = new Robot();
		for (int i = 0; i < 4; i++) {
			bob.setSpeed(6);
			bob.penDown();
			bob.move(80);

			bob.turn(-140);
			bob.move(100);
			bob.turn(-140);
			bob.move(100);
			bob.turn(-140);
			bob.move(100);

		}
	}
}
