<h1 align="center"> Forohub-RonnyB</h1>

<h2 align="center">:computer: Aplicación </h2>

<p>Esta aplicación es una API REST utilizando Spring creada con la intención de tratar los datos para relacionar un tópico con una respuesta de un foro, o los usuarios con las respuestas de un tópico. Cuenta con varias funciones como: crear un nuevo tópico, mostrar todos los tópicos creados, mostrar un tópico específico, actualizar un tópico, y eliminar un tópico.
Cada topico es almacenado en una base de datos local la cual guarda información de id, título, mensaje, fecha de creación, status (estado del tópico), autor y curso.

La API está configurada para responder con el resultado de cada solicitud, siempre y cuando el token proporcionado sea válido. Se debe utilizar la URL "http://localhost:8080/login" y un Json que contenga el nombre de usuario y contraseña para la generación del token para poder generar un jwt token, que le permita al usuario hacer las solicitudes que permite la API.

</p>


## :hammer:Funcionalidades de la API

- `Buscar topico por id`: Permite consultar la información de un topico por id en una base de datos local.
- `Listar topicos registrados`: Permite consultar la lista de topicos registrados de la base de datos local.
- `Actualizar topicos registrados por id`: Permite actualizar por id los topicos registrados en la base de datos local.
- `Borrar topicos registrados por id`: Permite borrar por id los topicos registrados en la base de datos local.
- `Registrar topicos nuevos`: Permite registrar topicos nuevos en la base de datos local.
## 💾 Tecnologías del proyecto

- `Java`
- `PostgreSQL`
- `Spring Boot`
- `Spring Data JPA`
- `Lombok`
- `Spring Web`
- `Spring Boot DevTools`
- `Flyway Migration`
- `Validation`
- `Spring Security`
  
 <h4 align="center">
:construction: Proyecto en construcción :construction:
</h4>
