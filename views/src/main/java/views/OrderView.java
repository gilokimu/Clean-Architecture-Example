package views;

import entity.Order;
import order.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path="/order")
public class OrderView {

    private OrderService orderService;

    public OrderView(OrderService orderService) {
        this.orderService = orderService;
    }


    @GetMapping(path="/all")
    public @ResponseBody
    List<Order> getAllOrders() {
        return orderService.getOrders();
    }


}
