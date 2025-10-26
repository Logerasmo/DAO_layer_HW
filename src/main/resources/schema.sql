CREATE if not exists TABLE CUSTOMERS (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    surname VARCHAR(50) NOT NULL,
    age INTEGER,
    phone_number VARCHAR(20)
);
CREATE if not exists TABLE ORDERS (
    id SERIAL PRIMARY KEY,
    date DATE NOT NULL DEFAULT CURRENT_DATE,
    customer_id INTEGER NOT NULL,
    product_name VARCHAR(100) NOT NULL,
    amount DECIMAL(10,2) NOT NULL,

    CONSTRAINT fk_orders_customers
        FOREIGN KEY (customer_id)
        REFERENCES CUSTOMERS(id)
        ON DELETE CASCADE
);