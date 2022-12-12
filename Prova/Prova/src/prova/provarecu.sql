create database if not exists provarecuperacao;

use provarecuperacao;

create table if not exists eventos(
	nome varchar(100),
    datae varchar(100),
    cidade varchar(100),
    endereco varchar(100),
    preco double,
    quant_ingressos int,
    id int auto_increment primary key
);

select * from eventos;