package com.mista.task.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="Order")
@Table(name = "order_items")
public class OrderData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="order_id")
    private Integer orderId;

    @Column (name="product_id")
    private Integer productId;

    @Column (name="quantity")
    private Integer quantity;
}
