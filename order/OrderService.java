import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface OrderService extends Remote {
    void createOrder(String item, int quantity) throws RemoteException ;
    
    void getOrderList() throws RemoteException ;
}