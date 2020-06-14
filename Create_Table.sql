
create table Pessoa (
	id int,
	nome varchar(50),
	idade int,
	primary key(id)
);

create table Viaja (
	id int,
	companhia varchar(50),
	idviaja int,
	primary key(id)
);

create table Local (
	idviaja int,
	local varchar(50),
	primary key(idviaja)
);
