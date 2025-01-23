CREATE TABLE tarefa
(
    id          INTEGER GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    titulo      VARCHAR(255)                             NOT NULL,
    descricao   VARCHAR(255)                             NOT NULL,
    responsavel VARCHAR(255),
    situacao    SMALLINT,
    prioridade  VARCHAR(255),
    deadline    TIMESTAMP WITHOUT TIME ZONE,
    CONSTRAINT pk_tarefa PRIMARY KEY (id)
);