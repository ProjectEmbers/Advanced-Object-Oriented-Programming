package simple_example;

import java.io.Serializable;

public class ChatMessage implements Serializable{
	private int id;
	private String name;
	private String message;

	public ChatMessage(int id, String name, String message) {
		super();
		this.id = id;
		this.name = name;
		this.message = message;
	}

	public ChatMessage() {
		id = 0;
		name = null;
		message = null;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getMessage() {
		return message;
	}

}
