import java.util.ArrayList;
import java.util.List;

public class User {

    private String userName;
    private int userId;
    private List<Animal> animalsObtained = new ArrayList<>();
    private List<Task> tasksList = Rules.TASKS_LIST.gettasksList();
    private int currentLevel = Constants.LEVELS.LEVEL_1;
    private int tasksCompletedInCurrentLevel = 0;

    public User(String userName, int userId) {
        this.userName = userName;
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<Animal> getAnimalsObtained() {
        return animalsObtained;
    }

    public void setAnimalsObtained(List<Animal> animalsObtained) {
        this.animalsObtained = animalsObtained;
    }

    public List<Task> getTasksList() {
        return tasksList;
    }

    public void setTasksList(List<Task> tasksList) {
        this.tasksList = tasksList;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    public int getTasksCompletedInCurrentLevel() {
        return tasksCompletedInCurrentLevel;
    }

    public void setTasksCompletedInCurrentLevel(int tasksCompletedInCurrentLevel) {
        this.tasksCompletedInCurrentLevel = tasksCompletedInCurrentLevel;
    }
}
