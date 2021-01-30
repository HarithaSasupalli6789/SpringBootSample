drop table if exists addressh;
drop table if exists employeeh;
create table employeeh(
id int not null primary key,
name varchar(20)
);
create table addressh(
addressid int,
address varchar(20),
FOREIGN KEY(addressid) REFERENCES employeeh(id)
);