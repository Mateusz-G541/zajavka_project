CREATE TABLE menu_dish (
                           menu_id BIGINT,
                           dish_id BIGINT,
                           PRIMARY KEY (menu_id, dish_id),
                           FOREIGN KEY (menu_id) REFERENCES menu(id),
                           FOREIGN KEY (dish_id) REFERENCES dish(id)
);

