import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
import java.net.*;

public class HelloClient {
        public static void main(String args[]) {
                try {
                        IHello hello =(IHello) Naming.lookup("rmi://localhost:8888/hello");
                        System.out.println(hello.helloWorld());
                 } catch (NotBoundException e) {
                        e.printStackTrace();
                 } catch (MalformedURLException e) {
                        e.printStackTrace();
                 } catch (RemoteException e) {
                        e.printStackTrace();  
                 } 
        }
}

