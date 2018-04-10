import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		//1. Create a robot
		Robot josh= new Robot();

		//2. Set the speed to 100
		josh.setSpeed(100);
		
		int colorChoice=JOptionPane.showOptionDialog(null, "hello", "Please pick a color for your robot", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Blue","Red", "Green"}, 0);
		
		//3. Set the pen color of the robot according to the value of the colorChoise variable
		if (colorChoice==0) {
	josh.setPenColor(Color.BLUE);
		}
	if (colorChoice==1){
		josh.setPenColor(Color.RED);
	}
	if (colorChoice==2) {
		josh.setPenColor(Color.GREEN);
	}
	
	
	
	
	
	
	//4. Ask the user how many polygons they want to be drawn.
	String polygon=	JOptionPane.showInputDialog("How many polygons would you like your robot to drawn?");
		int polygons= Integer.parseInt(polygon);
	
	//5. Use the robot to draw the number of polygons the user requested.
		
		
		josh.penDown();
		josh.move(15);
		
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}




}
