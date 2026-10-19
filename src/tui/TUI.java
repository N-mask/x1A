package tui;

import org.jline.utils.AttributedStringBuilder;
import org.jline.utils.AttributedStyle;

public interface TUI {

	// Print the default system texts
	default void printSystemPrompt(String text) {
		AttributedStyle system = AttributedStyle.DEFAULT.foreground(AttributedStyle.CYAN);
		System.out.println(new AttributedStringBuilder().append(text, system).toAnsi());
	}

	default void printSystemErr(String text) {
		AttributedStyle system = AttributedStyle.DEFAULT.foreground(AttributedStyle.RED);
		System.out.println(new AttributedStringBuilder().append(text, system).toAnsi());
	}

	default void printPlayer(String text) {
		AttributedStyle player = AttributedStyle.DEFAULT.background(AttributedStyle.WHITE)
				.foreground(AttributedStyle.BLACK);
		System.out.println("You: " + new AttributedStringBuilder().append(text, player).toAnsi());
	}

	default void printThought(String text) {
		AttributedStyle think = AttributedStyle.DEFAULT.italic().bold();
		System.out.println("You [Thinking] : " + new AttributedStringBuilder().append(text, think).toAnsi());
	}
}
