package cn.box51.bld.test;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by wq on 2018/1/11.
 */
public class RMITestImpl extends UnicastRemoteObject implements RMITest {


    private static final long serialVersionUID = 2772823730143724514L;

    protected RMITestImpl() throws RemoteException {
        super();
    }

    public String queryName(String no) throws RemoteException {
        System.out.println("hello " + no);
        return String.valueOf(System.currentTimeMillis());
    }
}
