# Case study
### UML Data Modeling Course (Object Oriented Analysis & Design)

[![NPM]( https://img.shields.io/badge/LICENCE-APACHE_LICENSE_2.0-blue)](https://github.com/okavango81/case-study-uml/blob/master/LICENSE) 

# About the project
REST API proposed as a use case for practical application of the content taught in the course.
The application simulates a retail chain with some fragments of entities related to the business.
In this example, the information is inserted into the H2 in-memory database via SQL script.
This is a basic model and therefore does not include insertions, updates or deletions through REST endpoints.

## Technologies used
- Astah
- Intellij IDEA
- Java 21
- Spring Boot
- JPA / Hibernate
- Maven
- Lombok
- H2 Database

## Implantation
- Plataform : Google Cloud
- Databse : H2 Database

## Conceptual model
![Modelo Conceitual](https://github.com/okavango81/assets/blob/main/edShop.jpg?raw=true)


## Script SQL
```SQL
--Category
INSERT INTO CATEGORY (ID,NAME) VALUES (1, 'Iformática');
INSERT INTO CATEGORY (ID,NAME) VALUES (2, 'Celulares e Comunicação');

--Product
INSERT INTO PRODUCT (ID,NAME,PRICE) VALUES (1, 'Smartphone Xiaomi Redmi 12 4G 256GB - 8GB Ram (Versao Global) (Midnight Black)', 919.00);
INSERT INTO PRODUCT (ID,NAME,PRICE) VALUES (2, 'Smartphone Xiaomi Redmi Note 13 Pro 5G 8GB+256GB Snapdragon 7s Gen 2, Câmera 200MP OIS, Carregamento Turbo 67W, 120Hz, AMOLED, NFC… (Black)', 1889.00);
INSERT INTO PRODUCT (ID,NAME,PRICE) VALUES (3, 'Notebook Dell Inspiron I15-I120K-A20P 15.6" Full HD 12ª Geração Intel Core i5 8GB 256GB SSD Windows 11 Preto', 2799.00);

--Product/Category
INSERT INTO PRODUCT_CATEGORY(PRODUCT_ID, CATEGORY_ID) VALUES (3,1);
INSERT INTO PRODUCT_CATEGORY(PRODUCT_ID, CATEGORY_ID) VALUES (1,2);
INSERT INTO PRODUCT_CATEGORY(PRODUCT_ID, CATEGORY_ID) VALUES (2,2);

--State
INSERT INTO STATE(ID,NAME)VALUES(1,'São Paulo');
INSERT INTO STATE(ID,NAME)VALUES(2,'Minas Gerais');

--City
INSERT INTO CITY(ID,STATE_ID,NAME)VALUES(1,1,'São Paulo');
INSERT INTO CITY(ID,STATE_ID,NAME)VALUES(2,1,'Holambra');
INSERT INTO CITY(ID,STATE_ID,NAME)VALUES(3,2,'Uberlândia');

--Client
INSERT INTO CLIENT(CLIENT_TYPE,ID,DOCUMENT,EMAIL,NAME) VALUES(1,1,'106.092.160-07','eguilhermeleite@gmail.com','Edvaldo Leite');
INSERT INTO CLIENT(CLIENT_TYPE,ID,DOCUMENT,EMAIL,NAME) VALUES(2,2,'41.225.939/0001-31','dguilhermesilvaleite@gmail.com','Davih Leite');

--Address
INSERT INTO ADDRESS(CITY_ID,CLIENT_ID,ID,COMPLEMENT,NEIGHBORHOOD,NUMBER,PUBLIC_PLACE,ZIP_CODE) VALUES(1,1,1,'172A','Jardim Alvorada(Zona Oeste)', '59','Rua Manuel Dias de Oliveira', '05528010');
INSERT INTO ADDRESS(CITY_ID,CLIENT_ID,ID,COMPLEMENT,NEIGHBORHOOD,NUMBER,PUBLIC_PLACE,ZIP_CODE) VALUES(2,2,2,'','Morada das Flores', '199','Rua Solidagos', '13825000');

--Phone
insert into CLIENT_PHONES(CLIENT_ID,PHONES) values(1,'11961257615');
insert into CLIENT_PHONES(CLIENT_ID,PHONES) values(2,'11977114962');

--Order
INSERT INTO ORDER_CLIENT(CLIENT_ID, DELIVERY_ADDRESS_ID, ID,INSTANT) VALUES(1,1,1,'2023-03-14T12:34:56.123');
INSERT INTO ORDER_CLIENT(CLIENT_ID, DELIVERY_ADDRESS_ID, ID,INSTANT) VALUES(2,2,2,'2024-03-12T10:25:47.210');

--Payment
INSERT INTO PAYMENT(STATUS,ORDER_ID)VALUES(2,1);
INSERT INTO PAYMENT(STATUS,ORDER_ID)VALUES(2,2);

--Payment by card
INSERT INTO PAYMENT_BY_CARD(NUMBER_OF_INSTALLMENTS,ORDER_ID)VALUES(1,1);
INSERT INTO PAYMENT_BY_CARD(NUMBER_OF_INSTALLMENTS,ORDER_ID)VALUES(6,2);

--Order item
INSERT INTO ORDER_ITEM(DISCOUNT,PRICE,QUANTITY,ORDER_ID,PRODUCT_ID)VALUES(0,1889,1,1,2);
INSERT INTO ORDER_ITEM(DISCOUNT,PRICE,QUANTITY,ORDER_ID,PRODUCT_ID)VALUES(0,919.00,1,1,1);
INSERT INTO ORDER_ITEM(DISCOUNT,PRICE,QUANTITY,ORDER_ID,PRODUCT_ID)VALUES(0,2799,1,1,3);

INSERT INTO ORDER_ITEM(DISCOUNT,PRICE,QUANTITY,ORDER_ID,PRODUCT_ID)VALUES(0,2799,1,2,3);

```

## Available endpoints

### Category
- find all :  http://34.95.231.9:8080/api/v1/categories
- find by id : http://34.95.231.9:8080/api/v1/categories/1

### Product
- find all : http://34.95.231.9:8080/api/v1/products
- find by id  : http://34.95.231.9:8080/api/v1/products/1

### City
- find all : http://34.95.231.9:8080/api/v1/cities
- find by id : http://34.95.231.9:8080/api/v1/cities/1

### Cliente
- find all : http://34.95.231.9:8080/api/v1/clients
- find by id  : http://34.95.231.9:8080/api/v1/clients/1

### Order
- find all : http://34.95.231.9:8080/api/v1/orders
- find by id : http://34.95.231.9:8080/api/v1/orders/1


# Author
### Edvaldo Guilherme Leite
www.linkedin.com/in/edvaldo-guilherme-leite-10ab492b5


## Certificate of completion
![Certificado](https://github.com/okavango81/assets/blob/main/certificado.jpg?raw=true)


