--  ::::::::   DDL - DATA DEFINITION LANGUAGE ::::

-- Criando o banco de dados
CREATE DATABASE supervisorio;

-- Selecionando o banco de dados
USE supervisorio;

-- Criando uma tabela S2
CREATE TABLE tabelaTeste(
	id INT AUTO_INCREMENT,
	nome VARCHAR(45),
    sobrenome VARCHAR(45),
    funcao VARCHAR(45),
    salario DOUBLE,
    PRIMARY KEY(id)
);


-- ::::::::   DML - DATA MANIPULATION LANGUAGE ::::

-- Inserindo valores aleatórios
INSERT INTO tabelaTeste(nome,sobrenome,funcao,salario) 
VALUES('Camilo','Pereira','CEO',13000),
      ('Tadeu','Pereira','Ferramenteiro',2000),
      ('Breno','Almeida','Fiscal',3500),
      ('Robert','Pablo','Chapeiro',5000),
      ('Jair','Odair','Supervisor',67000);
      
-- Selecionando os registros
SELECT * FROM tabelaTeste;





