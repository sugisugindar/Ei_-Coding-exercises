import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ScheduleManager manager = ScheduleManager.getInstance();
        TaskFactory taskFactory = new TaskFactory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View Tasks");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter description: ");
                        String description = scanner.nextLine();
                        System.out.print("Enter start time (HH:mm): ");
                        String startTime = scanner.nextLine();
                        System.out.print("Enter end time (HH:mm): ");
                        String endTime = scanner.nextLine();
                        System.out.print("Enter priority (High/Medium/Low): ");
                        String priority = scanner.nextLine();
                        Task task = taskFactory.createTask(description, startTime, endTime, priority);
                        manager.addTask(task);
                        System.out.println("Task added successfully.");
                        break;
                    case 2:
                        System.out.print("Enter task description to remove: ");
                        String descToRemove = scanner.nextLine();
                        manager.removeTask(descToRemove);
                        System.out.println("Task removed successfully.");
                        break;
                    case 3:
                        List<Task> tasks = manager.viewTasks();
                        if (tasks.isEmpty()) {
                            System.out.println("No tasks scheduled for the day.");
                        } else {
                            tasks.forEach(System.out::println); // Correctly iterates through and prints all tasks
                        }
                        break;
                    
                    case 4:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
