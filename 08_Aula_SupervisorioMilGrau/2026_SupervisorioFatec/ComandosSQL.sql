-- Criando banco para o supervisório 
CREATE DATABASE supervisorio_fatec;

-- Selecionando o banco para utilizar
USE supervisorio_fatec;

-- Tabela Esta Atual
CREATE TABLE processo(
	id INT AUTO_INCREMENT,
    nivel DECIMAL(5,2) NOT NULL,
    temperatura DECIMAL(5,2) NOT NULL,
    bomba INT NOT NULL,
    PRIMARY KEY(id)
);

-- Valores Iniciais
INSERT INTO processo(nivel,temperatura,bomba)
VALUES(45.00,28.00,0);

-- Histórico dos sensores
CREATE TABLE leituras(
	id INT AUTO_INCREMENT,
    nivel DECIMAL(5,2) NOT NULL,
    temperatura DECIMAL(5,2) NOT NULL,
    bomba INT NOT NULL,
    data_hora DATETIME DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY(id)
);

-- Histórico de alarmes
CREATE TABLE alarmes(
	id INT AUTO_INCREMENT,
    mensagem VARCHAR(150) NOT NULL,
    data_hora DATETIME DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY(id)
);







