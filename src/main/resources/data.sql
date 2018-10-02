insert into category(category_name,created_at,updated_at) values ('elsokat', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into category(category_name,created_at,updated_at) values ('masodikkat', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into category(category_name,created_at,updated_at) values ('harmadikkat', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());

insert into product(product_name,description,price,is_spicy,is_vegetarian, created_at, updated_at) values ('product1','leírás',3000,true,false, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into product(product_name,description,price,is_spicy,is_vegetarian, created_at, updated_at) values ('product2','leírás',3000,true,false, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into product(product_name,description,price,is_spicy,is_vegetarian, created_at, updated_at) values ('product3','leírás',3000,true,false, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());


insert into employee(employee_name,username,password, created_at, updated_at) values ('name1', 'proba2', 'pass', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());

insert into purchase(order_name,address,phone_number,is_delivered, created_at, updated_at) values ('prder1','proba1','030312342',false, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());

