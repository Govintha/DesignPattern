package creational.singleton;

public class DBSingleNullCheck {

    private String name;
    private String password;
    private String url;
    private static DBSingleNullCheck instance=null;
    private  DBSingleNullCheck(){}
    public  static DBSingleNullCheck getInstance(){

         synchronized(DBSingleNullCheck.class){
             if(instance==null)
                 instance=new DBSingleNullCheck();
        }
        return  instance;
    }

}
