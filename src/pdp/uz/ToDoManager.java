package pdp.uz;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class ToDoManager {
    private final ConcurrentHashMap<Integer, String> tasks = new ConcurrentHashMap<>();

    public void addTask(int taskId, String task) {
        tasks.put(taskId, task);
    }

    public void removeTask(int taskId) {tasks.remove(taskId); }

    public void updateTask(int taskId, String newTask) {
        tasks.replace(taskId, newTask);
    }

    public Map<Integer, String> getTasks() {
        return tasks;
    }
}