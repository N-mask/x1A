package tui;

public interface TUI {
	String RESET = "\u001B[0m";

	default void printRGB(String text, int r, int g, int b) {
		System.out.println(text + "\u001B[38;2;" + r + ";" + g + ";" + b + "m" + RESET);
	}

	default void setBackground(int r, int g, int b) {
		System.out.println("\u001B[48;2;" + r + ";" + g + ";" + b + "m" + RESET);
	}

	default void resetBackground() {
		System.out.println(RESET);
	}
}
