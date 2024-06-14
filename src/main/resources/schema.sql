CREATE TABLE CUSTOMERS (id INTEGER PRIMARY KEY auto_increment, name VARCHAR(50), surname VARCHAR(50), age INT, phone_number BIGINT);
CREATE TABLE ORDERS (id INTEGER PRIMARY KEY auto_increment, date date, FOREIGN KEY (CUSTOMER_ID) references CUSTOMERS(id), product_name varchar(100), amount INTEGER,
                     CUSTOMER_ID int);