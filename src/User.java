import java.util.ArrayList;
import java.util.List;

public class User {

    private String userName;
    private int userId;
    private List<Animal> animalsObtained = new ArrayList<>();
    private List<Task> tasksList = Rules.TASKS_LIST.gettasksList();
    private int currentLevel = Constants.LEVELS.LEVEL_1;
    private int tasksCompletedInCurrentLevel = 0;
    private boolean isLoyalCustomer = false;

    public User(String userName, int userId, boolean isLoyalCustomer) {
        this.userName = userName;
        this.userId = userId;
        this.isLoyalCustomer = isLoyalCustomer;
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

    public boolean isLoyalCustomer() {
        return isLoyalCustomer;
    }

    public void setLoyalCustomer(boolean loyalCustomer) {
        isLoyalCustomer = loyalCustomer;
    }
}
