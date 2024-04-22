package com.example;

public class Main {
    public static void main(String[] args) {
        // Create a ToDoList instance
        ToDoList toDoList = new ToDoList();

        // Create some tasks
        Task task1 = new Task("Task 1", "Description of Task 1");
        Task task2 = new Task("Task 2", "Description of Task 2");

        // Add tasks to the ToDoList
        toDoList.addTask(task1);
        toDoList.addTask(task2);

        // Display the tasks
        System.out.println("Tasks:");
        for (Task task : toDoList.getTasks()) {
            System.out.println(task.getTitle() + " - " + task.getDescription());
        }

        // Mark the first task as completed
        toDoList.markTaskAsCompleted(0);

        // Update the second task
        Task updatedTask = new Task("Updated Task 2", "Updated description of Task 2");
        toDoList.updateTask(1, updatedTask);

        // Display the updated tasks
        System.out.println("\nUpdated Tasks:");
        for (Task task : toDoList.getTasks()) {
            System.out.println(
                    task.getTitle() + " - " + task.getDescription() + " (Completed: " + task.isCompleted() + ")");
        }

        // Delete the first task
        toDoList.deleteTask(0);

        // Display the tasks after deletion
        System.out.println("\nTasks after deletion:");
        for (Task task : toDoList.getTasks()) {
            System.out.println(
                    task.getTitle() + " - " + task.getDescription() + " (Completed: " + task.isCompleted() + ")");
        }
    }
}
