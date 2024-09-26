package creational.singleton;

public class EargarSingletonDB {

    private String userName;
    private String password;
    private String url;

    private  static  EargarSingletonDB instance=new EargarSingletonDB();

    private  EargarSingletonDB(){}

    public static EargarSingletonDB getInstance(){
        return  instance;
    }
}
