package creational.singleton;

public class MultithreadDataBaseConnection {

    private  String name;
    private  String password;
    private  String  url;
    private  static MultithreadDataBaseConnection INSTANCE;

    private MultithreadDataBaseConnection(String name,String password,String url){
         name=name;
         password=password;
         url=url;
    }

    public static  MultithreadDataBaseConnection getIntance(String name,String password,String url){

          if(INSTANCE==null){

               synchronized (MultithreadDataBaseConnection.class){
                    if(INSTANCE==null){
                         INSTANCE=new MultithreadDataBaseConnection(name,password,url);
                    }
               }
          }

          return INSTANCE;
    }

}
