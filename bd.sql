DROP DATABASE IF EXISTS bd_quiz;
CREATE DATABASE bd_quiz;
USE bd_quiz;

CREATE TABLE questao (
    id_questao INTEGER PRIMARY KEY AUTO_INCREMENT,
    enunciado VARCHAR(300) NOT NULL,
    opA VARCHAR(150) NOT NULL,
    opB VARCHAR(150) NOT NULL,
    opC VARCHAR(150) NOT NULL,
    opD VARCHAR(150) NOT NULL,
    correta VARCHAR(150) NOT NULL
);

CREATE TABLE jogador (
    id_jogador INTEGER PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(200) NOT NULL,
    email VARCHAR(200) NOT NULL,
    pontuacao DECIMAL NOT NULL,
    horadia VARCHAR(20) NOT NULL
);

CREATE TABLE adm (
    id_adm INTEGER PRIMARY KEY AUTO_INCREMENT,
    nome_adm VARCHAR(200) NOT NULL,
    senha_adm VARCHAR(200) NOT NULL    
);

INSERT INTO adm (nome_adm, senha_adm) values ("adm", "1234");
SELECT * FROM questao;
DELETE FROM questao;