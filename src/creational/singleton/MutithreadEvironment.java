package creational.singleton;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MutithreadEvironment {

    public static int withMutithread(int size) {

        Set<DataBaseConnection> listOfConnections=new HashSet<>();

        ExecutorService executorService = Executors.newCachedThreadPool();

        for(int i=1;i<=size;i++){
             executorService.submit(()->listOfConnections.add(DataBaseConnection.getInstance()));
        }

        executorService.shutdown();

      return listOfConnections.size();

    }

    public static int withoutMutithread(int size){

        Set<DataBaseConnection> liestOfdataBaseConnections = new HashSet<>();

        for(int i=1;i<=size;i++){
             liestOfdataBaseConnections.add(DataBaseConnection.getInstance());
        }

        return liestOfdataBaseConnections.size();
    }

    public static int withMutithreadSingleNull(int size) {

        Set<DBSingleNullCheck> listOfConnections=new HashSet<>();

        ExecutorService executorService = Executors.newCachedThreadPool();

        for(int i=1;i<=size;i++){
            executorService.submit(()->listOfConnections.add(DBSingleNullCheck.getInstance()));
        }

        executorService.shutdown();

        return listOfConnections.size();

    }

    public static int withoutMutithreadSingleNull(int size){

        Set<DBSingleNullCheck> liestOfdataBaseConnections = new HashSet<>();

        for(int i=1;i<=size;i++){
            liestOfdataBaseConnections.add(DBSingleNullCheck.getInstance());
        }

        return liestOfdataBaseConnections.size();
    }

    public static int withMutithreadDoubleNull(int size) {

        Set<MultithreadDataBaseConnection> listOfConnections=new HashSet<>();

        ExecutorService executorService = Executors.newCachedThreadPool();

        for(int i=1;i<=size;i++){
            executorService.submit(()->listOfConnections.add(MultithreadDataBaseConnection.getIntance("Govinth","12345","https://localhost8080/mysql")));
        }

        executorService.shutdown();

        return listOfConnections.size();

    }

    public static int withoutMutithreadDoubleNull(int size){

        Set<MultithreadDataBaseConnection> liestOfdataBaseConnections = new HashSet<>();

        for(int i=1;i<=size;i++){
            liestOfdataBaseConnections.add(MultithreadDataBaseConnection.getIntance("Govinth","12345","https://localhost8080/mysql"));
        }

        return liestOfdataBaseConnections.size();
    }


}
