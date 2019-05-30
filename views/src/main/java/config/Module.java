package config;

import order.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import repository.JpaOrderRepository;
import repository.OrderRepository;

@Configuration
public class Module {
    @Bean
    public OrderService getOrderReposity(){
        OrderRepository orderRepository = new JpaOrderRepository();
        return new OrderService(orderRepository);
    }
}
