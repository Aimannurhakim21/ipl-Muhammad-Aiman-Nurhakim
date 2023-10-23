package srp;

import srp.Item;
import srp.OrderHistory;
import srp.OrderViewer;

public class Main {
    public static void main(String[] args) { 
 Item item = new Item(); 
 Order order = new Order(); 
 order.addItem(item); 
 OrderHistory history = new OrderHistory(); 
 history.getDailyHistory(); 
 OrderViewer viewer = new OrderViewer(); 
 viewer.printOrder(order); 
 }
}
