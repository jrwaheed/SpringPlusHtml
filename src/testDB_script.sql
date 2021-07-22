drop table customer;

create table customer (
	id int auto_increment primary key,
	last_name varchar(255),
	first_name varchar(255),
	balance int
);

insert into customer (last_name, first_name, balance) values ('Coltrane','John', 10000);
insert into customer (last_name, first_name, balance) values ('Jacksom','Michael', 9454);
insert into customer (last_name, first_name, balance) values ('Davis','Miles', 10);
insert into customer (last_name, first_name, balance) values ('Holliday','Billie', 780000);
