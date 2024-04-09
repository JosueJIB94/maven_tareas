package com.endes.tareas;

public class Task {
	
	protected String title;
	protected boolean isCompleted;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isCompleted() {
		return isCompleted;
	}

	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

	public Task(String title) {
		super();
		this.title = title;
		this.isCompleted = isCompleted;
	}
	
}



