package com.devsuperior.valortotal.exercicio.services;

import com.devsuperior.valortotal.exercicio.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order){
        double discountedValue = order.getBasic() * (order.getDiscount() / 100);
        return order.getBasic() - discountedValue + shippingService.shipment(order);
    }

}
