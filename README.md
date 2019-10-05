# Hola

1. [Contexto](#context)
2. [Ejecución](#comand)
3. [Consideraciones](#consider)
4. [Detalles API](#api)
5. [Contacto](#contact)

<a name="context"></a>
## 1. Contexto:

![Imgur](https://i.imgur.com/xccLgx9.png)

<a name="comand"></a>
## 2. Ejecución:
- Compilar: `mvn install`
- Ejecutar: `mvn spring-boot:run`

<a name="consider"></a>
## 3. Consideraciones:
- Se esta ejecutando en el puerto `8000`

<a name="api"></a>
## 4. Detalles API:

### Requisitos previos:
- Es necesario tener instalado [Maven](https://maven.apache.org/)
- Crear la Base de Datos con sus respectivas tablas, para el caso de esta Demo las tablas estan en el archivo `tablas.sql`.

### Estructura:
Dentro de [src/main/java/com/ayudantia/demo](https://github.com/godinezseba/Analisis-Ayudantia-SpringBoot/tree/master/src/main/java/com/ayudantia/demo) se encuentra separado en carpetas los distintos componentes de este proyecto. No es necesario, porque Spring-Boot detecta todo con los denominados _decoradores_, por ejemplo si la clase que estamos definiendo queremos que sea un __Controlador__ se utiliza el _decorador_ `@Controller` arriba de la definición de la clase. En este proyecto se utilizan los siguiente:

- Entidades: `@Entity` Se utilizan para definir en forma de clases las distintas tablas que tiene la Base de Datos. Notar que los atributos de estas clases definen las distintas columnas de las tablas y que estas tambíen tienen _decoradores_, los cuales definen elementos importantes como la columna a la que hace referencia `@Column(name="example")` o el tipo de dato al que hace referencia en la Base de Datos, por ejemplo si en la tabla definimos una variable tipo `text` se utiliza el decorador `@Type(type="text")`.\
\
Dependiendo de las variables definidas en [application.properties](https://github.com/godinezseba/Analisis-Ayudantia-SpringBoot/blob/master/src/main/resources/application.properties) las tablas son generadas de forma automatica en la BD o es necesario que uno las implemente.

- Repositorios: `@Repository` Son interfaces utilizadas por Hibernate para definir las distintas consultas que se quiere hacer a la BD.

- Servicios: `@Service`

- Controladores: `@RestController`

<a name="contact"></a>
## 5. Contacto:
Por favor cualquier cosa que no se entienda o cualquier **falta de ortografía** haganmelo saber por correo.

Sebastian Godínez, sebastian.godinez@sansano.usm.cl
