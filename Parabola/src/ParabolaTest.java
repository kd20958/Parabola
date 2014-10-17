import java.awt.*;

import javax.swing.JFrame;

public class ParabolaTest extends JFrame {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.add(new Parabola());
		frame.setVisible(true);
		frame.pack();

	}
}