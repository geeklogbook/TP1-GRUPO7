package trabajopractico_1.ejercicio_2;

public class Competidor {
	String nombreCompetidor;
	double segundos;
	
	public Competidor(String nombrecompetidor, double segundos) {
		this.nombreCompetidor = nombrecompetidor;
		this.segundos = segundos;
	}
	
	public double getSegundos() {
		return this.segundos;
	}
	
	public String getNombre() {
		return this.nombreCompetidor;
	}
	

}
