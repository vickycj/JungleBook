public class Task {

    private int taskId;
    private String taskDescription;
    private String taskLevel;
    private boolean isTaskCompleted = false;

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getTaskLevel() {
        return taskLevel;
    }

    public void setTaskLevel(String taskLevel) {
        this.taskLevel = taskLevel;
    }

    public boolean isTaskCompleted() {
        return isTaskCompleted;
    }

    public void setTaskCompleted(boolean taskCompleted) {
        isTaskCompleted = taskCompleted;
    }
}
