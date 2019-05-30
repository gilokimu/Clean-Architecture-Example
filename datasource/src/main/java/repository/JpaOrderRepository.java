package repository;

import entity.Mapper;
import entity.Order;
import entity.OrderEntity;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

public class JpaOrderRepository extends OrderRepository{

    @Autowired
    DBOrderRepository dbOrderRepository;

    public Order getOrder(int id){
        OrderEntity orderEntity = new Wrapper<OrderEntity>().unwrap(dbOrderRepository.findById(id));
        return OrderEntity.toOrder(orderEntity);
    }

    @Override
    public List<Order> getOrders() {
        return Mapper.toOrderList(dbOrderRepository.findAll());
    }

    @Transactional
    public void save(Order order) {
        dbOrderRepository.save(OrderEntity.toOrderEntity(order));
    }

}
