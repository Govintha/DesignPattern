package creational.singleton;

public class Clint {

    public static void main(String[] args) {

        DataBaseConnection objectOne=DataBaseConnection.getInstance();
        DataBaseConnection objecTwo=DataBaseConnection.getInstance();
        System.out.println(objectOne.hashCode()+" "+objecTwo.hashCode());

        int withoutMutithread=MutithreadEvironment.withoutMutithread(10000);
        int withMutithread=MutithreadEvironment.withMutithread(10000);

        System.out.println("withMutithread :"+withMutithread);

        System.out.println("withoutMutithread :"+withoutMutithread);

        int withoutMutithreadSinlgeNull=MutithreadEvironment.withoutMutithreadSingleNull(10000);
        int withMutithreadSinlgeNull=MutithreadEvironment.withMutithreadSingleNull(10000);

        System.out.println("withoutMutithreadSinlgeNull :"+withoutMutithreadSinlgeNull);

        System.out.println("withMutithreadSinlgeNull :"+withMutithreadSinlgeNull);

        int withoutMutithreadDoubleNull=MutithreadEvironment.withoutMutithreadDoubleNull(10000);
        int withMutithreadDoubleNull=MutithreadEvironment.withMutithreadDoubleNull(10000);

        System.out.println("withoutMutithreadDoubleNull :"+withoutMutithreadDoubleNull);

        System.out.println("withMutithreadDoubleNull :"+withMutithreadDoubleNull);



    }
}
