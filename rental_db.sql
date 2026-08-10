create database rental_db;

DROP TABLE IF EXISTS movimentacao CASCADE;
DROP TABLE IF EXISTS equipamento CASCADE;
DROP TABLE IF EXISTS usuario CASCADE;

CREATE TABLE usuario (
    id_usuario SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(150) UNIQUE NOT NULL,
    senha VARCHAR(255) NOT NULL
);

CREATE TABLE equipamento (
    id_equipamento SERIAL PRIMARY KEY,
    nome VARCHAR(150) NOT NULL,
    marca VARCHAR(100) NOT NULL,
    modelo VARCHAR(100) NOT NULL,
    categoria VARCHAR(100) NOT NULL,
    qtd_total INT NOT NULL CHECK (qtd_total >= 0),
    qtd_estoque_minimo INT NOT NULL DEFAULT 0 CHECK (qtd_estoque_minimo >= 0),
    atributos_especificos JSONB
);

CREATE TABLE movimentacao (
    id_movimentacao SERIAL PRIMARY KEY,
    id_equipamento INT NOT NULL,
    id_usuario INT NOT NULL,
    tipo_movimentacao VARCHAR(50) NOT NULL,
    quantidade INT NOT NULL CHECK (quantidade > 0),
    observacao_status TEXT,

    FOREIGN KEY (id_equipamento) REFERENCES equipamento(id_equipamento),
    FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario)
 
);

INSERT INTO usuario (nome, email, senha) VALUES
('Carlos Eduardo Silva', 'carlos.silva@rental.com', 'hash_senha_carlos_123'),
('Mariana Oliveira', 'mariana.oliveira@rental.com', 'hash_senha_mariana_456'),
('Roberto Souza', 'roberto.souza@rental.com', 'hash_senha_roberto_789');

INSERT INTO equipamento (nome, marca, modelo, categoria, qtd_total, qtd_estoque_minimo, atributos_especificos) VALUES
('Projetor Laser 4K', 'Epson', 'Pro EX11000', 'Audiovisual', 10, 2, '{"lumens": 4500, "potencia": "350W"}'::jsonb),
('Caixa de Som Amplificada', 'JBL', 'EON715', 'Áudio', 15, 3, '{"potencia": "1300W", "bluetooth": true}'::jsonb),
('Refletor LED PAR 64', 'Chauvet', 'SlimPAR Pro H', 'Iluminação', 25, 5, '{"potencia": "120W"}'::jsonb);

INSERT INTO movimentacao (id_equipamento, id_usuario, tipo_movimentacao, quantidade, observacao_status) VALUES
(1, 1, 'ENTRADA_COMPRA', 10, 'Aquisição inicial de estoque para locação'),
(1, 2, 'SAIDA_LOCACAO', 3, 'Locação para evento corporativo'),
(2, 3, 'SAIDA_MANUTENCAO', 2, 'Enviado para assistência técnica');