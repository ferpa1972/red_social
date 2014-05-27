package red_social

class Usuario {
    String nombre
    String nick
    String apellido
    String email
    String password
    Date fnac
    String pais
    String ciudad
    Boolean activo

    static hasMany = [mposts:MPost, seguidores:Usuario, usuarios_seguidos:Usuario, post_seguidos:MPost]

    static constraints = {
        nick blank:false, unique:true
        email email:true
        password blank:false, size:8..30
    	nombre blank:false
    	apellido blank:false
    	fnac blank:false
    }
}
