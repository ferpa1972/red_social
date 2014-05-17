package red_social

class SeguridadFilters {

    def filters = {
        estaLogueado(controller: 'Usuario', action: '*') {
            before = {
                if (!session.usuario_logueado && actionName != "login") {
                    redirect(controller: "Usuario", action: "login")
                    return true
                }
            }
        }
    }
}
