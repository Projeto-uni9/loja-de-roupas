CREATE DATABASE DBPRODUTOS;

USE DBPRODUTOS;

CREATE TABLE PRODUTO(
	codigo int primary key auto_increment,
    nome varchar(100),
    fornecedor varchar(50),
    setor varchar(50),
    cor varchar(50),
    tamanho varchar(30),
    quantidade int,
    descricao varchar(255),
    valor decimal(10,2)
);

SELECT * FROM produto;