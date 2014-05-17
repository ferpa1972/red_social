import red_social.Usuario

class BootStrap {

    def init = { servletContext ->
        if (!Usuario.count()){
            new Usuario(nick:"matiasvj", nombre:"Matias", apellido:"Verdier", email:"verdier.matias@gmail.com", 
                password:"123456789", fnac:new Date(), pais:"Uruguay", ciudad:"Paysandu", activo:true).save(failOnError:true)
        }
    }
    def destroy = {
    }
}
