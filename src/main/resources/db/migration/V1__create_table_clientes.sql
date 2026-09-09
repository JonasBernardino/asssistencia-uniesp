CREATE TABLE clientes
(
    id    BIGSERIAL     NOT NULL,
    nome  VARCHAR(150)  NOT NULL,
    cpf   VARCHAR(11)   NOT NULL,
    email VARCHAR(150)  NOT NULL,
    ativo BOOLEAN       NOT NULL DEFAULT TRUE,

    CONSTRAINT pk_clientes PRIMARY KEY (id),
    CONSTRAINT uk_clientes_cpf UNIQUE (cpf),
    CONSTRAINT uk_clientes_email UNIQUE (email)
);