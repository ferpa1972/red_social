<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Publicar</title>
    </head>
    <body>
    	<g:form controller="Usuario" action="buscar">
    		<g:textField name="busqueda"/>
    		<input type="submit" value="Buscar">
    	</g:form>
    	
    	<g:hasErrors bean="${post}">
            <ul>
                <g:eachError var="error" bean="${post}">
                    <li><g:message error="${error}"/></li>
                </g:eachError>
            </ul>
        </g:hasErrors>
        
        <g:form controller="MPost" action="crear">
        	<textarea name="contenido" rows="5" cols="40"></textarea>
        	<input type="submit" value="Publicar">
        </g:form>
        
        
        <g:if test="${posts != null}">
        	<ul>
	        	<g:each in="${posts}" var="p">
	        		<li>
	        			<pre>${p.contenido}</pre>
	        			<g:formatDate format="dd/MM/yyyy HH:mm" date="${p.fecha}"/>
	        		</li>
	        	</g:each>
	        </ul>
        </g:if>
    </body>
</html>
