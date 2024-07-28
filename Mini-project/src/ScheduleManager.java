import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ScheduleManager {
    private static ScheduleManager instance;
    private List<Task> tasks;

    private ScheduleManager() {
        tasks = new ArrayList<>();
    }

    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    public void addTask(Task task) throws IllegalArgumentException {
        for (Task t : tasks) {
            if (task.getStartTime().isBefore(t.getEndTime()) && task.getEndTime().isAfter(t.getStartTime())) {
                throw new IllegalArgumentException("Error: Task conflicts with existing task: " + t.getDescription());
            }
        }
        tasks.add(task); // This line adds the task to the list
        tasks.sort(Comparator.comparing(Task::getStartTime)); // Sort tasks by start time
        System.out.println("Task added successfully. No conflicts.");
    }
    

    public void removeTask(String description) throws IllegalArgumentException {
        Task taskToRemove = null;
        for (Task task : tasks) {
            if (task.getDescription().equalsIgnoreCase(description)) {
                taskToRemove = task;
                break;
            }
        }
        if (taskToRemove != null) {
            tasks.remove(taskToRemove);
        } else {
            throw new IllegalArgumentException("Task not found.");
        }
    }

    public List<Task> viewTasks() {
        return Collections.unmodifiableList(tasks); // Returns an unmodifiable view of the tasks list
    }
    
}
