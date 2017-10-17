import javax.swing.*;
import java.awt.*;

public class AppletTemplate extends JApplet {

	public void init() {
		setSize(500, 500);
		setBackground(Color.white);
	}

	public void paint(Graphics pen) {
		pen.fillRect(50,50,50,50);
	}
}
