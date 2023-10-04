package com.hexlet.excessivenesting;

@SuppressWarnings("ALL")
public class Solution {

    public void processOrder(Order order) {
        if (!order.isValid()) {
            order.handleInvalidOrder();
            return;
        }
        if (!order.isInStock()) {
            order.handleOutOfStockItems();
            return;
        }
        handleValidOrderInStock(order);
    }

    private static void handleValidOrderInStock(Order order) {
        double totalPrice = order.calculateTotalPrice();
        if (!order.updateCustomerBalance(totalPrice)) {
            order.handleBalanceUpdateFailure();
            return;
        }
        if (!order.placeOrder()) {
            order.handleOrderPlacementFailure();
            return;
        }
        order.sendConfirmationEmail();
    }
}
