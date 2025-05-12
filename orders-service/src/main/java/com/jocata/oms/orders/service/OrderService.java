package com.jocata.oms.orders.service;

import com.jocata.oms.datamodel.orders.form.OrderForm;

public interface OrderService {

    OrderForm createOrder(OrderForm orderForm);

    String cancelOrder(Integer orderId);

    OrderForm getOrderById(Integer orderId);
}
