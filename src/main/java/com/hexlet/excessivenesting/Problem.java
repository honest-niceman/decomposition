package com.hexlet.excessivenesting;

/*
1. Слишком сложно, адская вложенность, высокая когнитивная нагрузка
2. Внести изменения и ничего не сломать практически невозможно
 */
@SuppressWarnings("ALL")
public class Problem {
    public void processOrder(Order order) {
        if (order.isValid()) {
            if (order.isInStock()) {
                double totalPrice = order.calculateTotalPrice();
                if (order.updateCustomerBalance(totalPrice)) {
                    if (order.placeOrder()) {
                        order.sendConfirmationEmail();
                    } else {
                        order.handleOrderPlacementFailure();
                    }
                } else {
                    order.handleBalanceUpdateFailure();
                }
            } else {
                order.handleOutOfStockItems();
            }
        } else {
            order.handleInvalidOrder();
        }
    }
}
