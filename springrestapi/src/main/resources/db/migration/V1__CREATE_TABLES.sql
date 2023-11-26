create table hibernate_sequence
(
    next_val BIGINT
);
INSERT INTO hibernate_sequence VALUES (1);
INSERT INTO hibernate_sequence VALUES (1);

CREATE TABLE users
(
    id       SERIAL PRIMARY KEY ,
    password varchar(64) NOT NULL,
    username varchar(64) NOT NULL UNIQUE
);

CREATE TABLE todos
(
    id       SERIAL PRIMARY KEY ,
    title     VARCHAR(64) NOT NULL,
    completed BOOLEAN     NOT NULL
);