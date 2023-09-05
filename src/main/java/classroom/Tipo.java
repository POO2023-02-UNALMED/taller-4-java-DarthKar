package classroom;

public class Tipo {	
	public static final Tipo DISCIPLINAR = new Tipo(10, "Disciplinar");
	public static final Tipo FUNDAMENTACION = new Tipo(20, "Fundamentacion");
	public static final Tipo ELECTIVA = new Tipo(30, "Electiva");
		
	private int codigo;
	private String nombre;
	private Tipo(int codigo,String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
}
