import java.util.ArrayList;
import java.util.List;


public class OrderServiceImpl implements OrderService  {
    private  List<Order> orders = new ArrayList<>();

	public void createOrder(String item, int quantity)  {
        System.out.println("Adding new \n" +item+ "\n with quantity\n" +quantity);
        orders.add(new Order(item, quantity));
	}
	public void getOrderList()  {
		System.out.println("Listing available orders");
		for(Order order : orders) {
			System.out.println(order.getItem());
			System.out.println(order.getQuantity());
			
        }
	}

    
}