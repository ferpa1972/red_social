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
        ${error}
        <g:form name="login" url="[controller:'Usuario',action:'login']">
            <g:textField name="nick" />
            <g:passwordField name="password" />
            <g:actionSubmit value="Login"/>
        </g:form>
    </body>
</html>
