create database_treinarecife;
create table tb_alunos{
    id int auto_increment primary key,
    nome varchar(50) not null,
    email varchar(150) not null,
    data_nascimento datetime not null
};