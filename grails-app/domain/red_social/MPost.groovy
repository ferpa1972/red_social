package red_social

class MPost {
    String contenido
    Date fecha


    static belongsTo = Usuario
    static hasMany = [respuestas:MPost, seguidores:Usuario]

    static constraints = {
    	fecha blank:false
    }
}
