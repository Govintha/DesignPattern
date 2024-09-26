package creational.singleton;

public class Clint {

    public static void main(String[] args) {

        DataBaseConnection objectOne=DataBaseConnection.getInstance();
        DataBaseConnection objecTwo=DataBaseConnection.getInstance();
        System.out.println(objectOne.hashCode()+" "+objecTwo.hashCode());

        int withoutMutithread=MutithreadEvironment.withoutMutithread(1000);
        int withMutithread=MutithreadEvironment.withMutithread(1000);

        System.out.println("withMutithread :"+withMutithread);

        System.out.println("withoutMutithread :"+withoutMutithread);

    }
}
