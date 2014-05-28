<%@ page contentType="text/html;charset=UTF-8"%>

<html>
<head>
<title></title>
</head>

<body>

	<h1>Resultados</h1>

	<g:if test="${! resultado.usuarios_encontrados.isEmpty() }">
		<h3>Usuarios</h3>
		<ul>
			<g:each in="${resultado.usuarios_encontrados}" var="item">
				<li>
					${item.nick}
				</li>
			</g:each>
		</ul>
	</g:if>


	<g:if test="${! resultado.posts_encontrados.isEmpty() }">
		<h3>Posts</h3>
		<ul>
			<g:each in="${resultado.posts_encontrados}" var="item">
				<li>
					${item.contenido}
				</li>
			</g:each>
		</ul>
	</g:if>
</body>
</html>
