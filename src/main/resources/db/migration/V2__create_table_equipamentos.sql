CREATE TABLE equipamentos
(
    id           BIGSERIAL    NOT NULL,
    tipo         VARCHAR(50)  NOT NULL,
    marca        VARCHAR(100) NOT NULL,
    modelo       VARCHAR(100) NOT NULL,
    numero_serie VARCHAR(100),
    cliente_id   BIGINT       NOT NULL,

    CONSTRAINT pk_equipamentos PRIMARY KEY (id),

    CONSTRAINT fk_equipamentos_cliente
        FOREIGN KEY (cliente_id)
            REFERENCES clientes (id)
);