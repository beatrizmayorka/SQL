create database Lazer

create table Pessoa (
	id_pessoa int,
	nome varchar(50),
	idade int,
	primary key(id_pessoa)
);

create table Viaja (
	id_viaja int,
	companhia varchar(50),
	id_pessoa int,
	id_local int,
	primary key(id_viaja)
);

create table Local (
	id_local int,
	local varchar(50),
	primary key(id_local)
);
