package com.mista.task.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="Products")
@Table(name = "products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id")
    private Integer Id;

    @Column(name="name",
            nullable = false)
    private String name;

    @Column (name="price_per_unit")
    private Integer pricePerUnit;

}
