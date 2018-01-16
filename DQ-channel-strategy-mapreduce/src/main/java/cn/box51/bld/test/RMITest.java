package cn.box51.bld.test;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by wq on 2018/1/11.
 */
public interface RMITest extends Remote{

        String queryName(String no) throws RemoteException;

}
