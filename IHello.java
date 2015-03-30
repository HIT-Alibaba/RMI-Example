import java.util.Date;
import java.rmi.*;

public interface IHello extends Remote {
        public String helloWorld() throws RemoteException;
}
