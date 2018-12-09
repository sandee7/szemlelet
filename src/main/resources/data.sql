insert into category(category_name,created_at,updated_at) values ('elsokat', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into category(category_name,created_at,updated_at) values ('masodikkat', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into category(category_name,created_at,updated_at) values ('harmadikkat', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());

insert into product(category_id,product_name,description,price,is_spicy,is_vegetarian, created_at, updated_at) values (1,'product1','description1',1000,true,false, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into product(category_id,product_name,description,price,is_spicy,is_vegetarian, created_at, updated_at) values (1,'product2','description2',2000,false,false, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into product(category_id,product_name,description,price,is_spicy,is_vegetarian, created_at, updated_at) values (2,'product3','description3',3000,true,false, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into product(category_id,product_name,description,price,is_spicy,is_vegetarian, created_at, updated_at) values (1,'product4','description4',4000,false,true, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into product(category_id,product_name,description,price,is_spicy,is_vegetarian, created_at, updated_at) values (1,'product5','description5',5000,true,true, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into product(category_id,product_name,description,price,is_spicy,is_vegetarian, created_at, updated_at) values (1,'product6','description6',6000,true,false, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into product(category_id,product_name,description,price,is_spicy,is_vegetarian, created_at, updated_at) values (1,'product7','description7',7000,true,true, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());

insert into employee(username,password, enabled, role) values ('owner', '$2a$04$YDiv9c./ytEGZQopFfExoOgGlJL6/o0er0K.hiGb5TGKHUL8Ebn..', true, 'ROLE_OWNER');
insert into employee(username,password, enabled, role) values ('employee1', '$2a$04$YDiv9c./ytEGZQopFfExoOgGlJL6/o0er0K.hiGb5TGKHUL8Ebn..', true, 'ROLE_EMPLOYEE');
insert into employee(username,password, enabled, role) values ('employee2', '$2a$04$YDiv9c./ytEGZQopFfExoOgGlJL6/o0er0K.hiGb5TGKHUL8Ebn..', true, 'ROLE_EMPLOYEE');
insert into employee(username,password, enabled, role) values ('employee3', '$2a$04$YDiv9c./ytEGZQopFfExoOgGlJL6/o0er0K.hiGb5TGKHUL8Ebn..', true, 'ROLE_EMPLOYEE');
insert into employee(username,password, enabled, role) values ('employee4', '$2a$04$YDiv9c./ytEGZQopFfExoOgGlJL6/o0er0K.hiGb5TGKHUL8Ebn..', true, 'ROLE_EMPLOYEE');
insert into employee(username,password, enabled, role) values ('employee5', '$2a$04$YDiv9c./ytEGZQopFfExoOgGlJL6/o0er0K.hiGb5TGKHUL8Ebn..', true, 'ROLE_EMPLOYEE');

insert into purchase(product_id,order_name,address,phone_number,is_delivered, created_at, updated_at) values (1,'prder1','proba1','030312342',false, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into purchase(product_id,order_name,address,phone_number,is_delivered, created_at, updated_at) values (2,'prder2','proba2','230312342',false, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into purchase(product_id,order_name,address,phone_number,is_delivered, created_at, updated_at) values (3,'prder3','proba3','330312342',true, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());