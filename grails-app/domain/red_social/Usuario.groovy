package red_social

class Usuario {
	String nombre;
	String nick;
	String apellido;
	int id;
	String email;
	String password;
	Date fnac;
	String pais;
	String ciudad;
	Boolean activo;

	static hasMany = [mposts:MPost]
	static hasMany = [seguidores:Usuario, usuarios_seguidos:Usuario, post_seguidos:MPost]

    static constraints = {
    	nombre blank:false;
    	nick blank:false, unique:true;
    	apellido blank:false;
    	id blank:false, unique:true;
    	password blank:false, size:8..30;
    	fnac blank:false;
    }
}
