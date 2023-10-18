package com.delivery.restaurantapi.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "dish")
@Data
public class Dish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private int price;

    @Column(name = "category")
    private String category;

    @Column(name = "img")
    private String img;

    @Column(name = "menu_id")
    private String menuId;
}
