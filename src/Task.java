

/**
 *
 * @author Jenna
 */
public class Task {
    private static int taskId;
    private String nameOfTask;
    private String descriptionOfTask;
    
    public Task(String nameOfTask, String descriptionOfTask) {
        taskId++;
        setNameOfTask(nameOfTask);
        setDescriptionOfTask(descriptionOfTask);
    }

    public final int getTaskId() {
        return taskId;
    }

    public final void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public final String getNameOfTask() {
        return nameOfTask;
    }

    public final void setNameOfTask(String nameOfTask) {
        this.nameOfTask = nameOfTask;
    }

    public final String getDescriptionOfTask() {
        return descriptionOfTask;
    }

    public final void setDescriptionOfTask(String descriptionOfTask) {
        this.descriptionOfTask = descriptionOfTask;
    }
    
    
}
