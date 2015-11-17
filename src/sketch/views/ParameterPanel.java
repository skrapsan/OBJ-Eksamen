package sketch.views;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ParameterPanel extends JPanel {

	public ParameterPanel(int width, int height) {
		this.setPreferredSize(new Dimension(width, height));
		this.setBorder(BorderFactory.createTitledBorder("Parameters"));
		this.setVisible(true);
	}
	
}
