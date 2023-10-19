CREATE TABLE menu (
                      id SERIAL PRIMARY KEY,
                      restaurant_id BIGINT,
                      FOREIGN KEY (restaurant_id) REFERENCES restaurant(id)
);