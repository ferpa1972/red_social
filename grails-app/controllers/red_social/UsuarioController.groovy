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
//        	System.out.println "Perfil de "+session.usuario_logueado.toString()
              // render "Bienvendo "+ session.usuario_logueado.toString()
        def usu = Usuario.findByNick(session.usuario_logueado.toString())
        if(usu){
            [datosUsu:usu]
        }
        else{
            render "Error"
        }
    }
    
     def editarPerfil() {
        this.perfil()
    }
    
    
    def registro(){
		
        
    }
    
    def borrar(){
        def usu = Usuario.findByNick(session.usuario_logueado.toString())
		
        usu.activo = false
        usu.save()
    }
	
    def buscar(){
        render 'no implementado todavia'
    }

    def editarP(){
        
        def u = Usuario.findByNick(session.usuario_logueado.toString())
        if(u){
            u.nombre=params.nombre
            u.apellido=params.apellido
            
            u.fnac=new Date(params.fnac)
            u.email=params.email
            u.pais=params.pais
            u.ciudad=params.ciudad
            if( u.save()) {          
                redirect (action:'perfil')
            }
            else{
                render u.errors
            }
            
        }
        
        
        
        
        
        
        
        
        def usuario= new Usuario(nombre: params.nombre, apellido: params.apellido, fnac:params.fnac, email: params.email, ciudad: params.ciudad, pais: params.pais )
    }
}
