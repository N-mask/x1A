package base;

public class x1A implements tui.TUI {

	public x1A() {
		// Load into version x1A
		printRGB("Hello in Yellow !", 255, 255, 0);
	}

	public static void main(String[] args) {
		x1A x1AObject = new x1A();
		x1AObject.setBackground(255, 255, 255);
		x1AObject.printRGB("DEMO", 0, 0, 0);
		x1AObject.resetBackground();
	}

}
