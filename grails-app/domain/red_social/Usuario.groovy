package red_social

class Usuario {
    String nombre
    String nick
    String apellido
    int id
    String email
    String password
    Date fnac
    String pais
    String ciudad
    Boolean activo

<<<<<<< HEAD
	static hasMany = [mposts:MPost,seguidores:Usuario, usuarios_seguidos:Usuario, post_seguidos:MPost]
=======
    static hasMany = [mposts:MPost, seguidores:Usuario, usuarios_seguidos:Usuario, post_seguidos:MPost]
>>>>>>> 22c51d91a49068251f8d30eccbb428de20889972

    static constraints = {
    	nombre blank:false
    	nick blank:false, unique:true
    	apellido blank:false
    	id blank:false, unique:true
    	password blank:false, size:8..30
    	fnac blank:false
    }
}
