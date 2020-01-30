import java.util.List;

public class Service {

    private Persistance persistance = Persistance.getInstance();
    private GenerateAnimal generateAnimal = new GenerateAnimal();

    public User postTaskCompletion(int userId, int taskId){

       User user = persistance.getUserDetails(userId);
       List<Task> tasks = user.getTasksList();

       if(checkLevels(taskId,user.getCurrentLevel())){
           for(Task it: tasks){
               if(it.getTaskId() == taskId){
                   it.setTaskCompleted(true);
               }
           }

           updateUserDetails(user);
       }


       return user;

    }

    public User getUserDetails(int userId){
        return persistance.getUserDetails(userId);
    }

    private void updateUserDetails(User user){
        if(user.getTasksCompletedInCurrentLevel() == 3){
            user.setCurrentLevel(user.getCurrentLevel()+1);
            user.setTasksCompletedInCurrentLevel(0);
        }else{
            user.setTasksCompletedInCurrentLevel(user.getTasksCompletedInCurrentLevel()+1);
        }
        user.getAnimalsObtained().add(generateAnimal.getAnimal(user,user.isLoyalCustomer()));
    }

    private boolean checkLevels(int taskId, int currentLevel){
        return (taskId <= 3 && currentLevel == Constants.LEVELS.LEVEL_1)
                || (taskId > 3 && taskId <= 6 && currentLevel == Constants.LEVELS.LEVEL_2)
                ||  (taskId > 6&& currentLevel == Constants.LEVELS.LEVEL_3);
    }
}
