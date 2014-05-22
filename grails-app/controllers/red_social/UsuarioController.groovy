package red_social

class UsuarioController {
def create(){
	def u= new usuario()
	u = usuario.getProperties()
	return [u:UsuarioController]
	}
        
//borrado logico con plugin... fijares en buildconfig.groovy

 def delete(int id){
     def usu = new Usuario(id)
     usu.activo = false
     usu.delete()
    }
 
 def list(){
     Usuario.list()
 } 
 
 def edit(Usuario id, String nick, String email, String password, Date fnac, String pais, String ciudad){
     def usu = new Usuario(id)
     usu.nick = nick
     usu.email = email
     usu.password = password
     usu.fnac = fnac
     usu.pais = pais
     usu.ciudad = ciudad
     usu.save()
 }
    
 def index() { }
}

