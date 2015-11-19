package sketch.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import sketch.views.MainWindow;

/**
 * Controller class for MainWindow frame.
 */
public class MainWindowController implements ActionListener {
	
	private MainWindow frame;
	
	public MainWindowController(MainWindow frame) {
		this.frame = frame;
	}

	/**
	 * Handles MenuItem clicks.
	 */
	@Override
	public void actionPerformed(ActionEvent event) {
		switch(event.getActionCommand()) {
		
			/* 
			 * MenuItem: NEW
			 * Present the user with an input dialog.
			 * Validate and save entered name.
			 */
			case "New...":
				String sketchName = null;
				boolean validName = false;
						
				do {
					// Prompt user for new sketch name.
					sketchName = JOptionPane.showInputDialog(	frame, 
																"Valid chars: a-z, 0-9. Max 16 long.",
																"Enter name of new sketch",
																JOptionPane.PLAIN_MESSAGE);
					
					// Check if name is valid.
					validName = isValidName(sketchName);
					
					// If name is not valid, check if anything was entered.
					if(validName == false && sketchName == null) {
						// If not, user closed the window. Terminate the loop.
						break;
					} else if (validName == false && sketchName != null) {
						// User entered something, inform him of invalid name.
						JOptionPane.showMessageDialog(	frame,
														"Please enter a valid name!",
														"Invalid name",
														JOptionPane.WARNING_MESSAGE);
					}
					
				} while(validName == false && sketchName != null);
				
				break; // -- end of NEW --
				
			/*
			 * MenuItem: OPEN
			 * Present user with list of saved sketches.
			 */
			case "Open...": 
				String[] savedSketches = { "Lel", "lol", "rofl", "lmao", "sauce" };
				String selectedSketch = null;
																
				selectedSketch = (String) JOptionPane.showInputDialog(	frame, 
																		"Select sketch to open:",
																		"Open sketch...",
																		JOptionPane.PLAIN_MESSAGE,
																		null,
																		savedSketches,
																		savedSketches[0]);
					
				System.out.println(selectedSketch);
				break; // -- end of OPEN --
			
			/*
			 * MenuItem: SAVE
			 */	
			case "Save": 
				System.out.println("Menu item pressed: Save");
				break; // -- end of SAVE --
			
			/*
			 * MenuItem: DISCARD
			 */	
			case "Discard": 
				System.out.println("Menu item pressed: Discard");
				break; // -- end of DISCARD --
			
			/*
			 * MenuItem: ABOUT
			 */	
			case "About": 
				System.out.println("Menu item pressed: About");
				break; // -- end of ABOUT --
				
			/*
			 * MenuItem: EXIT
			 */	
			case "Exit": 
				System.out.println("Menu item pressed: Exit");
				break; // -- end of EXIT --
				
			default:
				System.out.println("Default reached in switch-statement in MainWindowController!! :(");
				break;
		}
		
	}
	
	/**
	 * Checks if a string is a valid sketch name.
	 * 
	 * Validation rules:
	 * - Alphabetical characters from 'A' to 'Z' (lower- or upper case) is OK.
	 * - Numbers 0 to 9 is OK.
	 * - No spaces allowed.
	 * - Max 16 characters long.
	 * - Name can't be null or empty.
	 * 
	 * @param name String Name of the new sketch.
	 * @return boolean returns true if the name is valid, false otherwise.
	 */
	private boolean isValidName(String name) {
		if(name == null || name == "" || name.length() > 16) {
			return false;
		}
		
		return Pattern.matches("[a-zA-Z0-9]+", name);		
	}
	
}
