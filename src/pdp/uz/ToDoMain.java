package pdp.uz;

import java.util.Scanner;

public class ToDoMain {
    public static void main(String[] args) {
        ToDoManager manager = new ToDoManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.print("""
                       To-Do :
                     1. Add Task
                     2. Remove Task
                     3. Update Task
                     4. View Tasks
                     5. Exit
                    Choose :""");

            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.print("Enter task ID: ");
                    int addTaskId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter task description: ");
                    String taskDescription = scanner.nextLine();
                    manager.addTask(addTaskId, taskDescription);
                    System.out.println("Task added: " + taskDescription);
                    break;

                case 2:
                    System.out.print("Enter task ID to remove: ");
                    int removeTaskId = scanner.nextInt();
                    manager.removeTask(removeTaskId);
                    System.out.println("Task removed: " + removeTaskId);
                    break;

                case 3:
                    System.out.print("Enter task ID to update: ");
                    int updateTaskId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new task description: ");
                    String newTaskDescription = scanner.nextLine();
                    manager.updateTask(updateTaskId, newTaskDescription);
                    System.out.println("Task updated to: " + newTaskDescription);
                    break;

                case 4:
                    System.out.println("Current Tasks: " + manager.getTasks());
                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Wrong option. Try again.❌❌❌");
            }


        }

        scanner.close();
    }
}