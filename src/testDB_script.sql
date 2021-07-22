drop table customer;

create table customer (
	id int auto_increment primary key,
	lastName varchar(50),
	firstName varchar(50),
	balance int
);

insert into customer (lastName, firstName, balance) values ('Coltrane','John', 10000);
insert into customer (lastName, firstName, balance) values ('Jacksom','Michael', 9454);
insert into customer (lastName, firstName, balance) values ('Davis','Miles', 10);
insert into customer (lastName, firstName, balance) values ('Holliday','Billie', 780000);
