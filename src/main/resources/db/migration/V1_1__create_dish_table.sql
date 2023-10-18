CREATE TABLE dish (
                      id SERIAL PRIMARY KEY,
                      name VARCHAR(255) NOT NULL,
                      description VARCHAR(255),
                      price INT NOT NULL,
                      category VARCHAR(255),
                      img VARCHAR(255),
                      menu_id VARCHAR(255)
);
