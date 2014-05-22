package red_social

class MPostController {
    
    
    def nuevo(){
        
    }
    
    def crear(){
		//render session.usuario_logueado
		
        def u = Usuario.findByNick(session.usuario_logueado.toString())
		
		
		
        def p = new MPost(contenido: params.contenido, fecha: new Date())
		
		
		if (p.save()){
			u.addToMposts(p)
			redirect (controller:'Usuario', action:'index')
		}
		else{
			render (view:'nuevo', model:[post:p])
		}  
    }
}
