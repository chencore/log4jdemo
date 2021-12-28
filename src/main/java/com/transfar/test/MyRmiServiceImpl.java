package com.transfar.test;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

// ②接口实现
public class MyRmiServiceImpl extends UnicastRemoteObject implements RmiService {
    protected MyRmiServiceImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Hello World!";
    }
}