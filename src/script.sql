create database treinarecife;
create table tb_alunos{
    id int auto_increment primary key,
    nome varchar(50) not null,
    email varchar(150) not null,
    data_nascimento datetime not null
};
insert into tb_alunos
(id,nome,email,data_nascimento)
values
(1,"Alexandre de Souza JR", "alexandre@gmail.com",timestamp "1995-07-26");
delete from tb_alunos where id = 1;
drop table tb_alunos;