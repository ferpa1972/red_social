package red_social

class MPostController {
    
    
    def nuevo(){
		def u = Usuario.findByNick(session.usuario_logueado.toString())
		
		if (u){
			def posts = u.mposts.sort{it.fecha}
			[posts:posts.reverse()]
		}
    }
    
    def crear(){
		
        def u = Usuario.findByNick(session.usuario_logueado.toString())
		
		if (u){
			def p = new MPost(contenido: params.contenido, fecha: new Date())
			
			if (p.save()){
				u.addToMposts(p)
				redirect (action:'nuevo')
			}
			else{
				render (view:'nuevo', model:[post:p])
			}
		}
         
    }
	
	def responder(){
		def u = Usuario.findByNick(session.usuario_logueado.toString())
		
		if (u){
			
		}
	}
	
}
