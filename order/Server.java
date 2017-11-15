import java.rmi.registry.Registry; 
import java.rmi.registry.LocateRegistry; 
import java.rmi.RemoteException; 
import java.rmi.server.UnicastRemoteObject; 

public class Server extends OrderServiceImpl{
   public Server() {} 
   public static void main(String args[]) { 
      try { 
         // Instantiating the implementation class 
         OrderServiceImpl obj = new OrderServiceImpl(); 
    
         // Exporting the object of implementation class  
         // (here we are exporting the remote object to the stub) 
         OrderService stub = (OrderService) UnicastRemoteObject.exportObject(obj,0);     
         // Binding the remote object (stub) in the registry         
         
         Registry registry = LocateRegistry.createRegistry(1222); 
         
                  
         registry.bind("Order", stub);
         registry.bind("List",stub);  
         System.err.println("Server ready"); 
      } catch (Exception e) { 
         System.err.println("Server exception: " + e.toString()); 
         e.printStackTrace(); 
      } 
   } 
} 