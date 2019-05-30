package entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    String code;


    //mappers
    public static Order toOrder(OrderEntity orderEntity){
        return new Order(orderEntity.code);
    }

    public static OrderEntity toOrderEntity(Order order){
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.code = order.code;

        return orderEntity;
    }
}
