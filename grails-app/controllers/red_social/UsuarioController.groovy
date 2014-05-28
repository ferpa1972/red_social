package red_social

class UsuarioController {

	def index(){
		redirect (action:'perfil')
	}

	def login(){
		if (request.get) {
			return
		}
		def usuario = Usuario.findByNick(params.nick)

		if (usuario) {
			if (usuario.password == params.password) {
				session.usuario_logueado = usuario.nick
				redirect (controller:"MPost", action:"nuevo")
			}
			else {
				render(view: "login", model: [error: "La contraseņa no es correcta"])
			}
		}
		else {
			render(view: "login", model: [error: "El usuario no existe"])
		}
	}

	def logout(){
		session.invalidate()
		redirect(action: "login")
	}

	def perfil() {
		System.out.println "Perfil de "+session.usuario_logueado.toString()
		render "Bienvendo "+ session.usuario_logueado.toString()
	}

	def registro(){
	}

	def seguir(){
		def usuarioSeguir = Usuario.findByNick(params.nick)
		def usuarioActual = Usuario.findbyNick(session.usuario.logueado.toString())
		if(usuarioSeguri){
			usuarioSeguir.addToSeguidores(usuarioActual)
			usuarioSeguir.save()
		}
		if(usuarioActual){
			usuarioActual.addToUsuarios_seguidos(usuarioSeguir)
			usuarioActual.save()
		}
	}

	def borrar(){
		def usu = Usuario.findByNick(session.usuario_logueado.toString())

		usu.activo = false
		usu.save()
	}

	def buscar(){
		render 'no implementado todavia'
	}
}
