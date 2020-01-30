import java.util.List;

public class User {

    private String userName;
    private String userId;
    private List<Animal> animalsObtained;
    private List<Task> tasksList;
    private int currentLevel = Constants.LEVELS.LEVEL_1;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
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
}
