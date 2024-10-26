package ucu.edu.ua.flowercontinue.delivery;

import java.util.List;
import ucu.edu.ua.flowercontinue.flowers.Item;

public class PostDeliveryStrategy implements Delivery {
    @Override
    public String deliver(List<Item> items) {
        return "Delivering items via Post";
    }
}
