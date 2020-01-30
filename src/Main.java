public class Main {

    public static void main(String[] args) {


        GameRunner gameRunner = new GameRunner();

        User user = gameRunner.getUserDetails(101);



        for(int i =1; i < 6; i++){
            gameRunner.postTaskCompletion(101,i);
        }

        System.out.println(user);


    }
}
