# Autor: ❤🚀❤ Vitor de Jesus ❤🚀❤

CREATE DATABASE db_java;
USE `db_java`;

CREATE TABLE tbl_cliente (
idCliente int NOT NULL,
nome varchar (45) NOT NULL,
CPF int (11) NOT NULL,
endereco varchar (45) NOT NULL,
telefone int (11) NOT NULL,
PRIMARY KEY (CPF)
);



INSERT INTO tbl_cliente (idCliente, nome, CPF, endereco, telefone) values
('1', 'DANIEL', '754845865', 'PRAIA','11956854'),
('2', 'LAURA', '784512784', 'EUA', '11956854'),
('3', 'VALERIA','968574123', 'EUROPA', '11956854');

