package repository;

import entity.Order;

import java.util.List;

public abstract class OrderRepository {
    public abstract void save(Order order);
    public abstract Order getOrder(int id);
    public abstract List<Order> getOrders();
}
