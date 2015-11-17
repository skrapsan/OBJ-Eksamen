package sketch;

import sketch.views.MainWindow;

public class Main {
	
	private static final String APP_TITLE = "Sketch 9000 by F. Derpson, M. Hurr, D. L. Mao, A. Rofl";
	private static final int FRAME_WIDTH = 900;
	private static final int FRAME_HEIGHT = 600;

	public static void main(String[] args) {
		new MainWindow(APP_TITLE, FRAME_WIDTH, FRAME_HEIGHT);
	}

}
