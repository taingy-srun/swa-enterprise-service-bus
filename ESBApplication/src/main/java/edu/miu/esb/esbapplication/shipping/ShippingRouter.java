package edu.miu.esb.esbapplication.shipping;

import edu.miu.esb.esbapplication.Order;
import edu.miu.esb.esbapplication.exception.NoSuchOrderTypeException;

import java.util.ArrayList;
import java.util.List;

public class ShippingRouter {
    public List<String> route(Order order) throws NoSuchOrderTypeException {
        List<String> shippings = new ArrayList<>();
        if ("international".equals(order.getOrderType())) {
            shippings.add("internationalshipping");
        } else if ("domestic".equals(order.getOrderType())) {
            if (order.getAmount() > 175)
                shippings.add("nextdayshipping");
            else
                shippings.add("normalshipping");
        } else {
            throw new NoSuchOrderTypeException("NoSuchOrderTypeException thrown...");
        }
        return shippings;
    }
}