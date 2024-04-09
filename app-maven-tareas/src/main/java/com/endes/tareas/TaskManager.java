package com.endes.tareas;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

		private List<Task> tasks = new ArrayList<>();
		
		public List<Task> getTasks() {
			return tasks;
		}


		public void setTasks(List<Task> tasks) {
			this.tasks = tasks;
		}


		public TaskManager(List<Task> tasks) {
			super();
			this.tasks = tasks;
		}


		public void addTask(String title) {
		
			Task newTask = new Task(title);
			tasks.add(newTask);
			System.out.println("\"" + title + "\" task has been added.");
		
		}
	
		
		public void completeTask(String title) {
			for (Task task : tasks) {
				if (task.title.equals(title)) {
				task.isCompleted = true;
				System.out.println("\"" + title + "\" task is now completed.");
				return;
			}
		}
			System.out.println("Task not found: " + title);
	}
			
		
		public void printTasks() {
				System.out.println("Tasks list:");
				for (Task task : tasks) {
				System.out.println("- " + task.title + " [Status: " + (task.isCompleted
				? "Completed" : "Pending") + "]");
				}
			}
		}

