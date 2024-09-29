CREATE DATABASE CoffeeShop;

\c CoffeeShop;

CREATE TABLE IF NOT EXISTS drinks (
                        id SERIAL PRIMARY KEY,
                        name_en VARCHAR(100),
                        name_other VARCHAR(100),
                        price DECIMAL(5, 2)
);

CREATE TABLE IF NOT EXISTS desserts (
                          id SERIAL PRIMARY KEY,
                          name_en VARCHAR(100),
                          name_other VARCHAR(100),
                          price DECIMAL(5, 2)
);

CREATE TABLE IF NOT EXISTS staff (
                       id SERIAL PRIMARY KEY,
                       full_name VARCHAR(100),
                       phone VARCHAR(15),
                       email VARCHAR(100),
                       position VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS customers (
                           id SERIAL PRIMARY KEY,
                           full_name VARCHAR(100),
                           birth_date DATE,
                           phone VARCHAR(15),
                           email VARCHAR(100),
                           discount DECIMAL(3, 2)
);

CREATE TABLE IF NOT EXISTS schedule (
                          id SERIAL PRIMARY KEY,
                          staff_id INT REFERENCES staff(id),
                          work_date DATE,
                          shift VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS orders (
                        id SERIAL PRIMARY KEY,
                        customer_id INT REFERENCES customers(id),
                        order_date DATE,
                        total DECIMAL(7, 2)
);
