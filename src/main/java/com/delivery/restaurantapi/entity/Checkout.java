package com.delivery.restaurantapi.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "checkout")
@Data
public class Checkout {

    public Checkout() {}

    public Checkout(String userEmail, String checkoutDate, int count, Long dishId) {
        this.userEmail = userEmail;
        this.checkoutDate = checkoutDate;
        this.count = count;
        this.dishId = dishId;
    }

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

    @Column(name = "dish_id")
    private Long dishId;
}

