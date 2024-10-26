package ucu.edu.ua.flowercontinue;

import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ucu.edu.ua.flowercontinue.delivery.DHLDeliveryStrategy;
import ucu.edu.ua.flowercontinue.delivery.PostDeliveryStrategy;
import ucu.edu.ua.flowercontinue.flowers.Flower;
import ucu.edu.ua.flowercontinue.flowers.FlowerColor;
import ucu.edu.ua.flowercontinue.flowers.FlowerType;
import ucu.edu.ua.flowercontinue.flowers.Item;

public class DeliveryTest {
    private static final double FIRST_FLOWER_PRICE = 45;
    private static final double SECOND_FLOWER_PRICE = 50;
    private static final double FIRST_SEPAL_LENGTH = 0.8;
    private static final double SECOND_SEPAL_LENGTH = 0.9;

    @Test
    public void testPostDelivery() {
        PostDeliveryStrategy postDeliveryStrategy = new PostDeliveryStrategy();
        List<Item> items = new LinkedList<>();

        items.add(new Flower(FIRST_SEPAL_LENGTH,
            FlowerColor.RED, FIRST_FLOWER_PRICE, FlowerType.ROSE));
        String deliveryResultone = postDeliveryStrategy.deliver(items);

        Assertions.assertEquals("Delivering items via Post", deliveryResultone);
    }

    @Test
    public void testDHLDelivery() {
        DHLDeliveryStrategy dhlDeliveryStrategy = new DHLDeliveryStrategy();
        List<Item> itemsToDeliver = new LinkedList<>();

        itemsToDeliver.add(new Flower(FIRST_SEPAL_LENGTH,
            FlowerColor.RED, FIRST_FLOWER_PRICE, FlowerType.TULIP));
        itemsToDeliver.add(new Flower(SECOND_SEPAL_LENGTH,
            FlowerColor.GREEN, SECOND_FLOWER_PRICE, FlowerType.CHAMOMILE));
        String deliveryResulttwo = dhlDeliveryStrategy.deliver(itemsToDeliver);

        Assertions.assertEquals("Delivering items via DHL", deliveryResulttwo);
    }
}
