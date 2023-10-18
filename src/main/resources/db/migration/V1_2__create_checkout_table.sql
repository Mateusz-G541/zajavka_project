CREATE TABLE checkout (
                          id SERIAL PRIMARY KEY,
                          user_email VARCHAR(255) NOT NULL,
                          checkout_date VARCHAR(255) NOT NULL,
                          status VARCHAR(255),
                          count INT NOT NULL,
                          dish_id BIGINT,
                          FOREIGN KEY (dish_id) REFERENCES dish(id)
);
