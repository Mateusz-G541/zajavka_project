package com.delivery.restaurantapi.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "checkout")
@Data
public class Checkout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "checkout_date")
    private String checkoutDate;

    @Column(name = "status")
    private String status;

    @Column(name = "count")
    private int count;

    @ManyToOne
    @JoinColumn(name = "dish_id")
    private Dish dish;
}
