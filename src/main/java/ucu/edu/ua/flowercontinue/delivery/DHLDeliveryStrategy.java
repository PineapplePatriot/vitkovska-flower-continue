package ucu.edu.ua.flowercontinue.delivery;

import java.util.List;
import ucu.edu.ua.flowercontinue.flowers.Item;

public class DHLDeliveryStrategy implements Delivery {
    @Override
    public String deliver(List<Item> items) {
        return "Delivering items via DHL";
    }
}