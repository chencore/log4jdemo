package com.transfar.test;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

// ①定义接口
public interface RmiService extends Remote {
    String sayHello() throws RemoteException;
}




