package sketch.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ParameterPanelController implements ActionListener {

	public ParameterPanelController() {
		
	}
	
	/**
	 * Handles actions from ParameterPanel components.
	 */
	@Override
	public void actionPerformed(ActionEvent event) {
		switch(event.getActionCommand()) {
			case "Draw":
				System.out.println("Button clicked: Draw");
				break;
				
			default:
				System.out.println("Default reached in switch-statement in ParameterPanelController!! :(");
				break;
		}
		
	}

}
