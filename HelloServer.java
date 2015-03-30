import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
import java.net.*;

public class HelloServer {
        public static void main(String args[]) {
                try {
                        IHello hello = new HelloImpl();
                        LocateRegistry.createRegistry(8888);
                        Naming.bind("rmi://localhost:8888/hello", hello);
                } catch (RemoteException e) {
                        System.out.println("创建远程对象发生异常！");
                        e.printStackTrace();
                } catch (AlreadyBoundException e) {
                        System.out.println("发生重复绑定对象异常！");
                        e.printStackTrace();
                } catch (MalformedURLException e) {
                        System.out.println("发生 URL 畸形异常！");
                        e.printStackTrace();
                }
        }
} 