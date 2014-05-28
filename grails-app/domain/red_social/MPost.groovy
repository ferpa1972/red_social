package red_social


class MPost {
    String contenido
    Date fecha

    static belongsTo = Usuario
    static hasMany = [respuestas:MPost, seguidores:Usuario]

    static constraints = {
		contenido blank:false, maxSize: 150
    	fecha blank:false
    }
}
