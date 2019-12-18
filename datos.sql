-- Ejecutar cada parte por separado
-- PARTE 1 --
-- Torneos:
insert into public.torneo (nombre, pais) values('Gran Slam', 'Montreal');
insert into public.torneo (nombre, pais) values('Fortnite World Cup', 'Los Angeles');
-- Equipos
insert into public.equipo (nombre, pais) values('SK Telecom T1', 'Corea del Sur');
insert into public.equipo (nombre, pais) values('Tricolor de Paine FC', 'Chile');
insert into public.equipo (nombre, pais) values('Team Solo Mid', 'Estados Unidos');
insert into public.equipo (nombre, pais) values('Astralis', 'Dinamarca');
insert into public.equipo (nombre, pais) values('Barcelona', 'España');
insert into public.equipo (nombre, pais) values('Chicago Bulls', 'Estados Unidos');
-- User
insert into public.usuario(user_name, password) values('seba', 'holamundo');
-- PARTE 2 --
-- participantes
insert into public.participantes(id_torneo, id_equipo) values (1, 1);
insert into public.participantes(id_torneo, id_equipo) values (1, 2);
insert into public.participantes(id_torneo, id_equipo) values (1, 3);
insert into public.participantes(id_torneo, id_equipo) values (1, 4);
insert into public.participantes(id_torneo, id_equipo) values (1, 5);
insert into public.participantes(id_torneo, id_equipo) values (1, 6);

insert into public.participantes(id_torneo, id_equipo) values (2, 1);
insert into public.participantes(id_torneo, id_equipo) values (2, 2);
insert into public.participantes(id_torneo, id_equipo) values (2, 3);
insert into public.participantes(id_torneo, id_equipo) values (2, 4);
insert into public.participantes(id_torneo, id_equipo) values (2, 5);
insert into public.participantes(id_torneo, id_equipo) values (2, 6);
-- Partidos
insert into public.partido(id_torneo, id_equipoA, id_equipoB, scoreA, scoreB) values (1, 1, 3, 16, 8);
insert into public.partido(id_torneo, id_equipoA, id_equipoB, scoreA, scoreB) values (1, 2, 5, 16, 1);
insert into public.partido(id_torneo, id_equipoA, id_equipoB, scoreA, scoreB) values (1, 6, 4, 10, 16);

insert into public.partido(id_torneo, id_equipoA, id_equipoB, scoreA, scoreB) values (2, 2, 3, 16, 8);
insert into public.partido(id_torneo, id_equipoA, id_equipoB, scoreA, scoreB) values (2, 5, 1, 16, 14);
insert into public.partido(id_torneo, id_equipoA, id_equipoB, scoreA, scoreB) values (2, 1, 2, 0, 16);
-- Jugadores
insert into public.jugador(id_equipo, nombre, apellido, apodo, pais, nacimiento) values (1, 'nombre1', 'apellido1', 'apodo1', 'Chile', '1998-1-1');
insert into public.jugador(id_equipo, nombre, apellido, apodo, pais, nacimiento) values (2, 'nombre2', 'apellido2', 'apodo2', 'Chile', '1998-2-2');
insert into public.jugador(id_equipo, nombre, apellido, apodo, pais, nacimiento) values (3, 'nombre3', 'apellido3', 'apodo3', 'Chile', '1998-3-3');
insert into public.jugador(id_equipo, nombre, apellido, apodo, pais, nacimiento) values (4, 'nombre4', 'apellido4', 'apodo4', 'Chile', '1998-4-4');
insert into public.jugador(id_equipo, nombre, apellido, apodo, pais, nacimiento) values (5, 'nombre5', 'apellido5', 'apodo5', 'Chile', '1998-5-5');
insert into public.jugador(id_equipo, nombre, apellido, apodo, pais, nacimiento) values (6, 'nombre6', 'apellido6', 'apodo6', 'Chile', '1998-6-6');
