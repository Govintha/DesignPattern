package creational.singleton;

public class DataBaseConnection {

     private String userName;
     private  String Password;
     private  String URL;
     private  static DataBaseConnection instance;

     private DataBaseConnection(){};

     public  static DataBaseConnection getInstance(){

          if(instance==null){
               instance=new DataBaseConnection();
          }
         return instance;
     }

}
