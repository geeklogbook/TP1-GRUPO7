package ejercicio1;

import java.util.ArrayList;

public class Grupo {
	private String nombre;
	private ArrayList<String> integrantes;
	
	public Grupo(String nombreGrupo) {
		setNombre(nombreGrupo);
		this.integrantes = new ArrayList<String>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCantidadIntegrantes() {
		return this.integrantes.size();
	}
	
	public void agregarIntegrante(String nombreIntegrante) {
		if(integrantes.isEmpty()) {
			this.integrantes.add(nombreIntegrante);
			mensajeExito(nombreIntegrante);
		} else {if(buscarIntegrante(nombreIntegrante) == null) {
			this.integrantes.add(nombreIntegrante);	
			mensajeExito(nombreIntegrante);
		} else {
			System.out.println("El nombre ya está en la lista");
			}
		}
		
	}
	private void mensajeExito(String nombreIntegrante) {
		System.out.println(nombreIntegrante + " fue asignado al " + this.nombre);
	}
	
	public String buscarIntegrante(String nombreIntegrante) {
		String nomEncontrado = null;
		int i = 0;
		
		while(nomEncontrado == null && i < integrantes.size()) {
			if(integrantes.get(i) == nombreIntegrante) {
				nomEncontrado = integrantes.get(i);
			}
			i++;
		}
		
		return nomEncontrado;
	}
	
	private int obtenerPosicionIntegrante(String nombreIntegrante) {
		int i = -1;
		if(buscarIntegrante(nombreIntegrante) != null) {
			i = integrantes.indexOf(nombreIntegrante);
		}
		
		return i;
	}
	
	public String obtenerIntegrante(int posicion){
		String aux = null;
		if(posicion >= 1) {
			aux =  integrantes.get(posicion - 1);			
		} 
		return aux;
	}
	
	public String removerIntegrante(String nombreIntegrante) {
		String aux = null;
		if(buscarIntegrante(nombreIntegrante) != null) {
			integrantes.remove(obtenerPosicionIntegrante(nombreIntegrante));
			aux = nombreIntegrante;
		}
		return aux;
	}
	
	private void mostrarIntegrantes() {	
		System.out.println("Cantidad de integrantes: " + this.integrantes.size() + "\nNombres:");
		for(String integrante : integrantes) {
			System.out.println(integrante);
		}
	}
	
	 public void mostrar() {
		 System.out.println("El grupo se llama: " + this.nombre);
		 mostrarIntegrantes();
	 }
	
	 public void vaciar() {
		 this.integrantes.clear();
	 }

}
