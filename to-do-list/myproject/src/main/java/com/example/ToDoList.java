package com.example;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<Task> tasks;

    public ToDoList() {
        this.tasks = new ArrayList<>();
    }

    // Method to add a task to the list
    public void addTask(Task task) {
        tasks.add(task);
    }

    // Method to mark a task as completed
    public void markTaskAsCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).setCompleted(true);
        } else {
            System.out.println("Invalid index. Task not found.");
        }
    }

    // Method to update a task at a specific index
    public void updateTask(int index, Task updatedTask) {
        if (index >= 0 && index < tasks.size()) {
            tasks.set(index, updatedTask);
        } else {
            System.out.println("Invalid index. Task not found.");
        }
    }

    // Method to delete a task at a specific index
    public void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        } else {
            System.out.println("Invalid index. Task not found.");
        }
    }

    // Method to get all tasks
    public List<Task> getTasks() {
        return tasks;
    }
}
