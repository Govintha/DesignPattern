package creational.singleton;

public class Clint {

    public static void main(String[] args) {

        DataBaseConnection objectOne=DataBaseConnection.getInstance();
        DataBaseConnection objecTwo=DataBaseConnection.getInstance();

        System.out.println(objectOne.hashCode()+" "+objecTwo.hashCode());
    }
}
