package red_social

class MPost {
    String contenido
    int id
    Date fecha


    static belongsTo = [creador:Usuario]
    static hasMany = [respuestas:MPost]

    static constraints = {
    	id blank:false
    	fecha blank:false
    }
}
