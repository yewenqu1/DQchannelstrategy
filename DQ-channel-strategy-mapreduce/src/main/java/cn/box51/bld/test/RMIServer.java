package cn.box51.bld.test;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by wq on 2018/1/11.
 */
public class RMIServer {

    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        Registry registry = LocateRegistry.createRegistry(8088);

        RMITest test = new RMITestImpl();

        registry.bind("test",test);

        System.out.println("服务启动");

    }
}
