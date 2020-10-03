# TACS - PRUEBAS SELENIUM
Este repositorio tiene por fin mostrar la información correspondiente a casos de prueba aplicados a diferentes páginas por medio de Selenium.

## Páginas probadas:

- Alkosto.
- Youtube.
- Escuela Ing.
- Walmart.
- Crunchyroll.
_____________________________________________

## YouTube Test:
Se realizaron pruebas con Selenium sobre los elementos:
- Tendencias de la pagina
- Búsqueda y abrir video
Se utilizo los xPath del elemento para que el Web Driver pudiera encontrarlo y dar click en él.
Adicional, se realizó con la comparación de iguales que ofrecen las pruebas unitarias de Java, el
URL deseado al dar click en él y el URL obtenido de la prueba con selenium.

## AmazonAlkostoWebTest:
Se realizaron pruebas con Selenium sobre los elementos:
- Mostrar tarjetas de regalo en Amazon:
Se utilizo el xPath del elemento de las tarjetas de regalo para que el Web Driver pudiera
encontrarlo y dar click como un usuario particular. Posteriormente se verificó que la vista que
se cargó fuera efectivamente las tarjetas de regalo.
- Mostrar contenido del carrito en Alkosto:
Se utilizo el xPath del elemento del carrito para que el Web Driver pudiera encontrarlo y dar
click como un usuario particular que no tiene productos. Posteriormente se verificó que el
contenido del carrito fuera vacío al no haber agregado ningún producto, verificándolo con una
vista que sólo aparece en caso de que así sea.
Estas pruebas se realizaron además con JUnit para verificar los datos obtenidos con los
esperados.
## EscuelaIngTest
Se realizaron dos pruebas sobre lo siguiente: 
- Escribir formulario de maestría en informática:
Se realizo una navegación desde la página principal de la Escuela Colombiana de
Ingeniería Julio Garavito, apartado de Oferta académica en la esquina superior izquierda,
en este menú se seleccionó maestría en informática, se dio click en el botón solicitar
información y se llenó el formulario con los datos requeridos. Se uso Xpath para que el
web driver pudiera acceder a los campos de botones a hacer click, de los inputs que se
necesitaban llenar, se usó la herramienta Select de selenium para interactuar con un Select
de HTML junto con xPath para que el web driver encontrara los elementos select.
- Reproducir video que se encuentra en la página Campus
Se realizo una navegación desde la página principal de la Escuela, dando click en campus
en la barra de navegación posteriormente se dio click en el botón “play” para reproducir el
video. Se hizo uso de xPath para que el web driver reconociera los elementos de la página
como el botón del campus y el icono para reproducir el video en dicha página. 
Algunos casos de prueba contemplados: 

## Walmart Test
Se realizaron las siguientes dos pruebas dentro del portal compras de walmart.
- Debería abrir página de Login usuario
Se siguio el orden desde el home para poder hacer login con un usuario. El orden se siguio
invocando el xpath de usuario hacer clic y luego el xpath de abrir pagina para entrar al formulario
de usuario
- Debería usar el buscador y encontrar items con el nombre que sea dado
Se invoca el xpath del buscador en el home, allí se hace click en el buscador y se llena el formulario
con la palabra “halloween” se envía el formulario y debería aparecer la página con la búsqueda del
item realizada

## Crunchyroll Test
Realizamos pruebas en los servicios prestados por la plataforma de streaming Crunchyroll.
- Ver las últimas noticias
Lo que se hace, es conectarnos con la página y dirigirnos a la sección de noticias para verficar que
es posible obtener la información existente en este campo.
- Ver la primera noticia publicada
Se elige la primera noticia, se ingresa desde la página principal y se lee su encabezado para
reconocer que se ha cargado la información correspondiente.
- Ver las opciones de pago a premium
Entra a la página principal y verifica el acceso a los planes de pago para el servicio premium
proporcionado por la plataforma


