package sketch.views;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import sketch.controllers.MainWindowController;

/**
 * This class represents the main JFrame for the sketch application.
 */
@SuppressWarnings("serial")
public class MainWindow extends JFrame {
	/* ActionListener for menu items */
	MainWindowController controller = new MainWindowController(this);
	
	public MainWindow(String title, int frameWidth, int frameHeight) {
		// Configure frame
		this.setTitle(title);
		this.setSize(frameWidth, frameHeight);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null); // Centers the frame.
		this.setLayout(new BorderLayout(5, 0));
		
		// Create and add menu bar
		initMenuBar();
		
		// Add ParameterPanel & SketchPanel
		this.add(new ParameterPanel(200, frameHeight), BorderLayout.WEST);
		this.add(new SketchPanel(690, frameHeight - 20), BorderLayout.EAST);

		this.setVisible(true);
	}
		
	/**
	 * Creates and adds a JMenuBar to this frame.
	 */
	private void initMenuBar() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Menu");
		JMenuItem menuItem;
		
		menuItem = new JMenuItem("New...");
		menuItem.addActionListener(controller);
		menu.add(menuItem);
		
		menuItem = new JMenuItem("Open...");
		menuItem.addActionListener(controller);
		menu.add(menuItem);
		
		menu.addSeparator();
		
		menuItem = new JMenuItem("Save");
		menuItem.addActionListener(controller);
		menu.add(menuItem);
		
		menuItem = new JMenuItem("Discard");
		menuItem.addActionListener(controller);
		menu.add(menuItem);
		
		menu.addSeparator();

		menuItem = new JMenuItem("About");
		menuItem.addActionListener(controller);
		menu.add(menuItem);
		
		menu.addSeparator();
		
		menuItem = new JMenuItem("Exit");
		menuItem.addActionListener(controller);
		menu.add(menuItem);
		
		menuBar.add(menu);
		
		this.setJMenuBar(menuBar);
	}
	
}
