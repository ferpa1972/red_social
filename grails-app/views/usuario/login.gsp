<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Entrar al sitio</title>
    </head>
    <body>
        
    
    <h1>Accede a la red de TIP's mas grande! (la unica)</h1>
    <div id="contenedor">
      ${error}
        <g:form name="login" url="[controller:'Usuario',action:'login']">
            <g:textField name="nick" />
            <g:passwordField name="password" />
            <g:actionSubmit value="Login"/>
        </g:form>
      
      <g:form name="registro" url="[controller:'Usuario',action:'registro']">
         <label for="nick">nick:</label>
         <g:textField name="nick"  value="${usuario?.nick}"/>
         <label for="email">email:</label>
         <g:textField name="email" value="${usuario?.email}"/>
         <label for="password">password:</label>
         <g:passwordField name="password" value="${usuario?.password}"/>
        <g:actionSubmit value="registro"/>
      </g:form>
        
      <div id="pie">
        <h6>Tecnologo en Informatica Paysandu|Java EE|2014|Todos los derechos reservados</h6>
      </div>
      
    </div>
    </body>
</html>
