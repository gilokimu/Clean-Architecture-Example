package repository;


import entity.OrderEntity;
import org.springframework.data.repository.CrudRepository;

public interface DBOrderRepository extends CrudRepository<OrderEntity, Integer> {

}
