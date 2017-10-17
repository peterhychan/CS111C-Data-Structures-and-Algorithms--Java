import java.awt.*;

import javax.swing.*;
import java.awt.event.*;

public class GUITemplate extends JPanel {
	
	final int sideLength = 30;
	double shrinkFactor = 0.5;

	public GUITemplate() {
		super();
		setBackground(Color.white);
		setPreferredSize(new Dimension(500,500));
	}
	
	public void paintComponent(Graphics pen) {
		super.paintComponent(pen);
		
		int width = 250;
		int height = 250;
		int cordX = 100;
		int cordY = 100;
		helper(pen , cordX, cordY, width, height);
	}
		
	private  void helper(Graphics page, int cordX, int cordY, int width, int height){
		page.setColor(Color.gray);

		page.fillRect(cordX, cordY, width, height);

		page.setColor(Color.black);
		page.drawRect(cordX, cordY, width, height);
		setForeground(Color.black);

		if (width > sideLength){
			width = (int)(width*shrinkFactor); 
			height = (int)(height*(shrinkFactor));
			helper(page, cordX+width+width-(width/2), cordY+height+height-(height/2), width, height);
			helper(page,cordX-(width/2), cordY + height+height-(height/2), width, height);
			helper(page, cordX-(width/2) , cordY-(height/2), width, height);                         
			helper(page, cordX+width+width-(width/2), cordY-(height/2), width, height);              

		}
	}
	
	public static void main(String[] args) {
		GUITemplate panel = new GUITemplate();
	
		JFrame frame = new JFrame("GUI Program");
		frame.getContentPane().add(panel);
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
