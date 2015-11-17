package sketch.views;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class SketchPanel extends JPanel {

	public SketchPanel(int width, int height) {
		this.setPreferredSize(new Dimension(width, height));
		this.setBackground(Color.WHITE);
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		
		this.setVisible(true);
	}
	
}
