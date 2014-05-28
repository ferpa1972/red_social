<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sample title</title>
    </head>
    <body>
        <h3>Nombre: </h3>${datosUsu.nombre}
        <h3>Apellido: </h3>${datosUsu.apellido}
        <h3>Nick: </h3>${datosUsu.nick}
        <h3>Correo: </h3>${datosUsu.email}
        <h3>Fecha nacimiento: </h3><g:formatDate format= "dd/MM/yyyy " date="${datosUsu.fnac}"/>
        <h3>País:</h3>${datosUsu.pais}
        <h3>Ciudad:</h3>${datosUsu.ciudad}
    </body>
</html>
