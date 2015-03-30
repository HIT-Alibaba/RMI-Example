import java.util.Date;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements IHello {
        public HelloImpl() throws RemoteException {
        }

        public String helloWorld() throws RemoteException {
                return "Hello World";
        }
}
