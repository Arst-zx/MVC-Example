CREATE DATABASE test;

CREATE TABLE user (
id int NOT NULL AUTO_INCREMENT ,
name varchar(255) NULL ,
PRIMARY KEY (`id`)
);

INSERT INTO test.user(name) VALUES ("world!");