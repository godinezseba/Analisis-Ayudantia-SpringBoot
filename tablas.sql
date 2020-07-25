-- Escrito en PostgreSQL

CREATE USER proyectuser WITH
    LOGIN
    SUPERUSER
    INHERIT
    CREATEDB
    CREATEROLE
    REPLICATION; -- ejecutar solo

alter user proyectuser with password 'qwerty123'; -- ejecutar solo

CREATE DATABASE torneos; -- ejecutar solo

create table public.torneo(
    id_torneo serial not null,
    nombre varchar(100) not null,
    pais varchar(100) not null,
    primary key (id_torneo)
);

create table public.equipo(
    id_equipo serial not null,
    nombre varchar(100) not null,
    pais varchar(100),
    primary key (id_equipo)
);

create table public.participantes(
    id_torneo int not null references torneo(id_torneo) ON UPDATE CASCADE ON DELETE CASCADE,
    id_equipo int not null references equipo(id_equipo) ON UPDATE CASCADE,
    CONSTRAINT torneo_equipo_pkey PRIMARY KEY (id_torneo, id_equipo)
);

create table public.partido(
    id_partido serial not null,
    id_torneo int not null,
    id_equipoA int not null,
    id_equipoB int not null,
    scoreA int default 0,
    scoreB int default 0,
    primary key (id_partido),
    foreign key (id_torneo) references torneo(id_torneo),
    foreign key (id_equipoA) references equipo(id_equipo),
    foreign key (id_equipoB) references equipo(id_equipo)
);

create table public.jugador(
    id_jugador serial not null,
    id_equipo int not null,
    nombre varchar(100) not null,
    apellido varchar(100) not null,
    apodo varchar(100),
    pais varchar(100),
    nacimiento date,
    primary key (id_jugador),
    foreign key (id_equipo) references equipo(id_equipo)
);
