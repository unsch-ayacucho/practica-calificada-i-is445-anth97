create database cargabd1;
use cargabd1;

create table docente(
id_docente int primary key not null auto_increment,
id_horas_semestre int not null,
id_semestre int not null,
nombres_docente varchar(50));

create table semestre(
id_semestre int primary key not null auto_increment,
nombre_semestre varchar(50));

create table horas_docente(
id_horas_semestre int primary key not null auto_increment,
numero_horas int);

alter table docente
add foreign key (id_horas_semestre) references horas_docente(id_horas_semestre);

alter table docente
add foreign key (id_semestre) references semestre(id_semestre);

insert into semestre values (1,"2019-I");
insert into semestre values (2,"2019-II");
insert into semestre values (3,"2020-I");
insert into semestre values (4,"2020-II");
insert into horas_docente values (1,28);
insert into horas_docente values (2,32);
insert into horas_docente values (3,36);
insert into horas_docente values (4,40);
insert into docente values (1,1,1, "Fredy Barrientos");
insert into docente values (2,2,2, "Karel Peralta");
insert into docente values (3,3,3, "Manuel Lagos");
insert into docente values (4,4,4, "Elinar Carillo");





