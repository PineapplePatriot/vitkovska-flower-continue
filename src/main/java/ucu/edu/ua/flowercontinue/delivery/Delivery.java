package ucu.edu.ua.flowercontinue.delivery;

import java.util.List;
import ucu.edu.ua.flowercontinue.flowers.Item;

public interface Delivery {
    String deliver(List<Item> items);
}