package order;

import entity.Order;
import exceptions.ValidationException;
import repository.OrderRepository;

import java.time.LocalDateTime;
import java.util.List;

public class OrderService {
    OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void createOrder(Order order){
        if (order.getCode().isEmpty()) {
            throw new ValidationException("Order code is empty");
        }

        order.setCreatedAt(LocalDateTime.now());
        orderRepository.save(order);
    }

    public Order getOrder(int id){
        return orderRepository.getOrder(id);
    }

    public List<Order> getOrders(){
        return orderRepository.getOrders();
    }
}
