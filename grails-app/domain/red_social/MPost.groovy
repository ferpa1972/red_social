package red_social

class MPost {
	String contenido;
	int id;
	Date fecha;
	DateTime hora;

	static belongsTo = Usuario;
	static hasMany = [mposts:MPost];

    static constraints = {
    	id blank:false;
    	fecha blank:false;
    	hora blank:false;
    }
}
