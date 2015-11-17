package sketch.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Controller class for MainWindow frame.
 */
public class MainWindowController implements ActionListener {

	public MainWindowController() {
		
	}

	/**
	 * Handles MenuItem clicks.
	 */
	@Override
	public void actionPerformed(ActionEvent event) {
		switch(event.getActionCommand()) {
			case "New...": 
				System.out.println("Menu item pressed: New...");
				break;
				
			case "Open...": 
				System.out.println("Menu item pressed: Open...");
				break;
				
			case "Save": 
				System.out.println("Menu item pressed: Save");
				break;
				
			case "Discard": 
				System.out.println("Menu item pressed: Discard");
				break;
				
			case "About": 
				System.out.println("Menu item pressed: About");
				break;
				
			case "Exit": 
				System.out.println("Menu item pressed: Exit");
				break;
				
			default:
				System.out.println("Default reached in switch-statement in MainWindowController!! :(");
				break;
		}
		
	}
	
}
