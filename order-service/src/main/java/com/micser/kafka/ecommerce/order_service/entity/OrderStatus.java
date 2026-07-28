package com.micser.kafka.ecommerce.order_service.entity;

public enum OrderStatus {
    CREATED,
    STOCK_RESERVED,
    PAYMENT_COMPLETED,
    CONFIRMED,
    CANCELLED
}
