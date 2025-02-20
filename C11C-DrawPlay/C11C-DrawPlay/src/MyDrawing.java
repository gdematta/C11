import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
// Gabe DeMatte and Spencer Groth - C11

public class MyDrawing extends JPanel {
	private Cat cat;
	public MyDrawing() 
	{
		// adds critters to the drawing
		cat = new Cat();
	}
	// paintComponent is called automatically when the frame needs
	// to display (e.g., when the program starts)
	public void paintComponent(Graphics g) {
		cat.draw(g, 50, 50);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		// creates a JPanel (MyDrawing), we'll draw on this
		frame.setContentPane(new MyDrawing());
		// program will end when the window is closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// sets the size (otherwise only title bar displays)
		frame.setSize(400, 400);
		
		// frame will not display until you set visible true
		frame.setVisible(true);
	}

}
