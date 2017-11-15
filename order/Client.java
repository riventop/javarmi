import java.rmi.registry.LocateRegistry; 
import java.rmi.registry.Registry;  

public class Client {  
   private Client() {}  
   public static void main(String[] args) {  
      try {  
         // Getting the registry 
         Registry registry = LocateRegistry.getRegistry(1222); 
    
         // Looking up the registry for the remote object 
         OrderService stub = (OrderService) registry.lookup("Order"); 
         OrderService list = (OrderService) registry.lookup("List"); 
         
    
         // Calling the remote method using the obtained object 
         stub.createOrder("Oranges",1); 
         stub.createOrder("Mangoes",2);
         list.getOrderList();
         
         // System.out.println("Remote method invoked"); 
      } catch (Exception e) {
         System.err.println("Client exception: " + e.toString()); 
         e.printStackTrace(); 
      } 
   } 
}