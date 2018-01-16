package cn.box51.bld.test;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by wq on 2018/1/11.
 */
public class RMIClient {

    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry registry = null;

        registry = LocateRegistry.getRegistry("127.0.0.1",8088);
        try {
            String[] list = registry.list();
            for(String s : list){
                System.out.println(s);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }

        RMITest test = (RMITest)registry.lookup("test");
        System.out.println(test.queryName("ywq"));
    }

}
