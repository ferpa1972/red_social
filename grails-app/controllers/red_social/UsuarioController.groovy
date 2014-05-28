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
                render(view: "login", model: [error: "La contraseña no es correcta"])
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
    
    def borrar(){
        def usu = Usuario.findByNick(session.usuario_logueado.toString())
		
		usu.activo = false
		usu.save()
    }
	
	def buscar(){
		
		def busqueda = params.busqueda
		
		def coincidencias_usuarios = Usuario.where {
			nombre =~ "%"+busqueda+"%" || nick =~ "%"+busqueda+"%" || apellido =~ "%"+busqueda+"%" || pais =~ "%"+busqueda+"%" || ciudad =~ "%"+busqueda+"%"
		}
		
		def coincidencias_posts = MPost.where {
			contenido =~ "%"+busqueda+"%"
		}
		
		def resultado = [usuarios_encontrados:coincidencias_usuarios.list(), posts_encontrados:coincidencias_posts.list()]
		
		
		[resultado:resultado]
	}
}
