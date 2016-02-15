CREATE DATABASE patientdatabase;

CREATE TABLE users(
id BIGINT(10) NOT NULL AUTO_INCREMENT,
user VARCHAR(20),
pswd VARCHAR(50),
PRIMARY KEY (id)
);

insert into users values(1,"shaheen","shaheen");
insert into users values(2,"s@s.com","s");