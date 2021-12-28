package com.transfar.test;

import com.sun.jndi.rmi.registry.ReferenceWrapper;

import javax.naming.Reference;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

// ③服务绑定并启动监听
public class RmiServer {

    public static void main(String[] args) throws Exception {
        System.setProperty("com.sun.jndi.rmi.object.trustURLCodebase","true");
        Registry registry = LocateRegistry.createRegistry(1099);
        System.out.println("RMI启动，监听：1099 端口");
        Reference reference = new Reference("com.transfar.test.BugFinder", "com.transfar.test.BugFinder", null);
        ReferenceWrapper referenceWrapper = new ReferenceWrapper(reference);
        registry.bind("hello", referenceWrapper);
        Thread.currentThread().join();
    }
}

