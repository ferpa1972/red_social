import red_social.Usuario

class BootStrap {

    def init = { servletContext ->
        if (!Usuario.count()){
            new Usuario(nick:"matiasvj", nombre:"Matias", apellido:"Verdier", email:"verdier.matias@gmail.com", 
                password:"123", fnac:new Date('1991/03/16'), pais:"Uruguay", ciudad:"Paysandu", activo:true).save(failOnError:true)
			
			new Usuario(nick:"alejox", nombre:"Alexandro", apellido:"Roca", email:"alejox21@gmail.com",
				password:"456", fnac:new Date('1992/05/20'), pais:"Uruguay", ciudad:"Paysandu", activo:true).save(failOnError:true)
			
			new Usuario(nick:"matiaswid", nombre:"Matias", apellido:"Widmaier", email:"matiasw@gmail.com",
				password:"789", fnac:new Date('1992/10/24'), pais:"Uruguay", ciudad:"Paysandu", activo:true).save(failOnError:true)
        }
    }
    def destroy = {
    }
}
