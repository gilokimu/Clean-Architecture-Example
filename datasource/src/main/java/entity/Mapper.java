package entity;

import java.util.ArrayList;
import java.util.List;

public class Mapper {

    public static List<Order> toOrderList(Iterable<OrderEntity> orderEntities) {
        List<Order> orders = new ArrayList<>();
        for (OrderEntity orderEntity : orderEntities){
            orders.add(OrderEntity.toOrder(orderEntity));
        }

        return orders;
    }
}
