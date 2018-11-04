insert into category(category_name,created_at,updated_at) values ('elsokat', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into category(category_name,created_at,updated_at) values ('masodikkat', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into category(category_name,created_at,updated_at) values ('harmadikkat', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());

insert into product(category_id,product_name,description,price,is_spicy,is_vegetarian, created_at, updated_at) values (1,'product1','leírás',3000,true,false, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into product(category_id,product_name,description,price,is_spicy,is_vegetarian, created_at, updated_at) values (1,'product2','leírás',3000,true,false, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into product(category_id,product_name,description,price,is_spicy,is_vegetarian, created_at, updated_at) values (2,'product3','leírás',3000,true,false, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());


insert into employee(username,password, enabled, role) values ('owner', '$2a$04$YDiv9c./ytEGZQopFfExoOgGlJL6/o0er0K.hiGb5TGKHUL8Ebn..', true, 'ROLE_OWNER');
insert into employee(username,password, enabled, role) values ('employee', '$2a$04$YDiv9c./ytEGZQopFfExoOgGlJL6/o0er0K.hiGb5TGKHUL8Ebn..', true, 'ROLE_EMPLOYEE');

insert into purchase(product_id,order_name,address,phone_number,is_delivered, created_at, updated_at) values (1,'prder1','proba1','030312342',false, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into purchase(product_id,order_name,address,phone_number,is_delivered, created_at, updated_at) values (2,'prder2','proba2','230312342',false, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into purchase(product_id,order_name,address,phone_number,is_delivered, created_at, updated_at) values (3,'prder3','proba3','330312342',true, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());