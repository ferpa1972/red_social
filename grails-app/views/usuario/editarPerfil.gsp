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
        <h1>EDITEMOS NIGAS</h1>
        <form method="POST" action="/red_social/Usuario/editarP">
            <input name="nombre" value=${datosUsu.nombre}></input>
            <input name="apellido" value=${datosUsu.apellido}></input>
            <input name="fnac" value=<g:formatDate format= "dd/MM/yyyy " date="${datosUsu.fnac}"/>></input>
            <input name="email"value=${datosUsu.email}></input>
            <input name="pais" value=${datosUsu.pais}></input>
            <input name="ciudad" value=${datosUsu.ciudad}></input>
            
            <input type="submit" value="Aceptar">
        <form>
            
    </body>
</html>
