

public class Persistance {

   private static Persistance persistance;

   private User user01 = new User("user01",Constants.USERS.user01);
   private User user02 = new User("user02",Constants.USERS.user02);

   private Persistance(){

   }

   public static Persistance getInstance(){
       if(persistance == null){
           persistance = new Persistance();
       }
       return persistance;
   }

}
