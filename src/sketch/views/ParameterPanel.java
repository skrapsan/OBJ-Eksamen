package sketch.views;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

import sketch.controllers.ParameterPanelController;

@SuppressWarnings("serial")
public class ParameterPanel extends JPanel {
	
	ParameterPanelController controller = new ParameterPanelController();
	
	JButton btnDraw;

	public ParameterPanel(int width, int height) {
		this.setPreferredSize(new Dimension(width, height));
		this.setBorder(BorderFactory.createTitledBorder("Parameters"));
		
		btnDraw = new JButton("Draw");
		btnDraw.addActionListener(controller);
		this.add(btnDraw);
		
		this.setVisible(true);
	}
	
}
