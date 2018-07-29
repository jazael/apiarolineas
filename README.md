# apiarolineas
Proyecto basado en spring boot, para la automatización y gestión de procesos de requisitos de vuelo dentro de una compañía
Para poder ejecutar y poner en funcionamiento la api debes seguir los siguientes
Para ejecutar el proyecto primero debes crear una Base de Datos en postgresql con el nombre aerolinea.
# Credenciales de usuario
Al finalizar la puesta en desarrollo del api se debe crear el siguiente usuario, con el fin de autenticarnos y que este pueda aprobar las solicitudes.
# Ejecutar Script
INSERT INTO public.usuario(
	id, activo, contrasena, rol, usuario)
	VALUES (1, true, '12345', 2, 'prueba@hotmail.com');

Parametrización del archivo application.properties

![captura de pantalla de 2018-07-28 18-23-47](https://user-images.githubusercontent.com/11983683/43361441-474d51cc-9294-11e8-94ae-bc64d925dad2.png)

# Estructura del proyecto
CONFIGURATION => Generación del JWT, permisos de rutas públicas y privadas.
ENTITY => Entidades del proyecto.
MODEL => Representaciones de las entidades.
REPOSITORY => Métodos de acceso a la BD (save, find, delete).
UTILITARIOS => Métodos de conversión.
SERVICE => Métodos que se asocian a los repositorios.
CONTROLLER => Métodos para las peticiones http (POST, PUT, GET, DELETE).

Inicio de sesión utilzando JWT

![captura de pantalla de 2018-07-28 18-45-04](https://user-images.githubusercontent.com/11983683/43361530-600d9daa-9296-11e8-8a1e-755c8e4536a6.png)

Adjuntando el token en los headers.

![captura de pantalla de 2018-07-28 18-50-49](https://user-images.githubusercontent.com/11983683/43361565-60fb8370-9297-11e8-89e9-6fbc9dfc86f7.png)

Paginación usando Paginator

![captura de pantalla de 2018-07-28 19-13-58](https://user-images.githubusercontent.com/11983683/43361658-6d313538-929a-11e8-8c7f-90b540d26998.png)
