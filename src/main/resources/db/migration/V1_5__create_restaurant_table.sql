CREATE TABLE restaurant
(
    id      SERIAL PRIMARY KEY,
    name    VARCHAR(255) NOT NULL,
    street_id BIGINT,
    FOREIGN KEY (street_id) REFERENCES street (id)
);


