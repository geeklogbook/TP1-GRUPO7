package trabajopractico_1.ejercicio_2;

import java.util.ArrayList;

public class Competencia {
	String nombreEspecialidad;
	ArrayList<Competidor> competidores; // Cada Elemento es el nombre del integrante
	// Agregar posicion
	
	public Competencia(String nombreEspecialidad) {
		this.nombreEspecialidad = nombreEspecialidad;
		this.competidores = new ArrayList<Competidor>();
	}
	
	public void addCompetidor(Competidor competidor) {
		this.competidores.add(competidor);
	}
	
	public ArrayList<Competidor> ganadores(){
		ArrayList<Competidor> ganadores =  new ArrayList<Competidor>();
		double tiempoGanador = this.competidores.get(0).getSegundos();
		for (Competidor competidor: this.competidores) {
			if(competidor.getSegundos() < tiempoGanador) {
				ganadores.clear();
				ganadores.add(competidor);
				tiempoGanador = competidor.getSegundos();
			} else {
				if(competidor.getSegundos() == tiempoGanador) {
					ganadores.add(competidor);
					tiempoGanador = competidor.getSegundos();
				}
			}
		}
		
		return ganadores;
	}
	
	// Ejercicio 3 - Retorna una terna de 3 tiempos y los competitodes con los mismos
	// TODO: Clase posicion que implemente un array list de atletas donde agrege los atletas 
	// con la posicion. IDEA:
	//		ArrayList<Posicion> terna = new ArrayList<Posicion>();
	//		Posicion p1 = new Posicion();
	//		Posicion p2 = new Posicion();
	//		Posicion p3 = new Posicion();

	public ArrayList<Competidor> ternaGanadores(){
		//GANADORES
		ArrayList<Competidor> ganadores =  new ArrayList<Competidor>();
		ArrayList<Competidor> terna = new ArrayList<Competidor>();
		//TIEMPO GANADOR
		double tiempoPrimero = Integer.MAX_VALUE; // 
		double tiempoSegundo = Integer.MAX_VALUE; // tiempoPrimero < tiempoSegundo < tiempoTercero
		double tiempoTercero = Integer.MAX_VALUE; // 

		
		for (Competidor competidor: this.competidores) {
			double tiempoCompetidor = competidor.getSegundos();

//			if(tiempoCompetidor < tiempoPrimero) {
//				tiempoPrimero = tiempoCompetidor;
//				tiempoSegundo = tiempoPrimero;
//				tiempoTercero = tiempoSegundo;
//				
//			} else if (tiempoCompetidor > tiempoPrimero && tiempoCompetidor < tiempoSegundo) {
//				tiempoSegundo = tiempoCompetidor;
//				tiempoTercero = tiempoSegundo;
//			} else if (tiempoCompetidor > tiempoSegundo && tiempoCompetidor < tiempoTercero) {
//				tiempoTercero = tiempoCompetidor;
//			}		
//			if(tiempoCompetidor  < tiempoPrimero) {
//				this.competidores.remove(competidor);
//				terna.add(competidor);
//				tiempoPrimero = tiempoCompetidor;
//			} else if (tiempoCompetidor > tiempoPrimero && tiempoCompetidor < tiempoSegundo){
//				tiempoSegundo = tiempoCompetidor;				
//			}
		}
		
		// recorro competidores y me quedo con los tres tiempos
		// Vuelvo a recorrer la lista y agrego ganadores
		// Ordeno la lista por el tiempo
		
		return ganadores;
	}
	
	
	public void mostrarGanadores() {
		ArrayList<Competidor> ganadores = ganadores();
		for (Competidor ganador: ganadores) {
			System.out.println(ganador.getNombre() + " " + ganador.getSegundos());
		}
	}
	
	public void mostrarTernaGanadores() {
		System.out.println("Terna Ganadora");
		ArrayList<Competidor> ganadores = ternaGanadores();
		for (Competidor ganador: ganadores) {
			System.out.println(ganador.getNombre() + " " + ganador.getSegundos());
		}
	}
	
	
}