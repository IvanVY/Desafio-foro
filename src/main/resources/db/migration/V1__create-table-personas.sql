create table usuarios(
    id BIGSERIAL PRIMARY KEY,
    nombre varchar(100) not null,
    email varchar(100) not null,
    tipo varchar(30) NOT NULL,
    contrasena varchar(100) not null
);