CREATE TABLE user_restaurant (
                                 user_id BIGINT,
                                 restaurant_id BIGINT,
                                 PRIMARY KEY (user_id, restaurant_id),
                                 FOREIGN KEY (user_id) REFERENCES app_user(id),
                                 FOREIGN KEY (restaurant_id) REFERENCES restaurant(id)
);