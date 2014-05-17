package red_social

class UsuarioController {
    
    def login(){
        if (request.get) {
            return
        }
        def usuario = Usuario.findByNick(params.nick)
        
        if (usuario) {
            if (usuario.password == params.password) {
                session.usuario_logueado = usuario
                render "Bienvenido "+usuario.nombre+" "+usuario.apellido
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

    def listar() {
        
    }
    
    def mostrar() {
        
    }
    
    def crear(){
        
    }
    
    def editar(){
        
    }
    
    def borrar(){
        
    }
}