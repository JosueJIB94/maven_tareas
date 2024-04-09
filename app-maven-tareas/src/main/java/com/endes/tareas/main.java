package com.endes.tareas;

import java.util.ArrayList;

public class main {
	public static void main(String[] args) {
			TaskManager manager = new TaskManager(new ArrayList());
			manager.addTask("Complete the report");
			manager.addTask("Call Mike");
			manager.completeTask("Call Mike");
			manager.printTasks();
		}
	}
