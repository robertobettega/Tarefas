CREATE TABLE usuario
(
    id       VARCHAR(255) NOT NULL,
    nome     VARCHAR(255),
    password VARCHAR(255),
    email    VARCHAR(255),
    CONSTRAINT pk_usuario PRIMARY KEY (id)
);