import java.io.Serializable;

public class Order implements Serializable {
    private int quantity;
    private String item;

    public Order(String item, int quantity){
        this.item = item;
        this.quantity = quantity;

    }
    /**
     * @return the item
     */
    public String getItem() {
        return item;
    }
    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }
    /**
     * @param item the item to set
     */
    public void setItem(String item) {
        this.item = item;
    }
    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
