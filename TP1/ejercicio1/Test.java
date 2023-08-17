package ejercicio1;

public class Test {

	public static void main(String[] args) {

		Grupo grupo1 = new Grupo("Grupo 7");
		
		grupo1.agregarIntegrante("Federico");
		grupo1.agregarIntegrante("Lucila");
		grupo1.agregarIntegrante("Valentin");
		grupo1.agregarIntegrante("Joaquin");
		grupo1.agregarIntegrante("Juan Manuel");
		grupo1.agregarIntegrante("Franco");
		
		grupo1.mostrar();
	
		grupo1.removerIntegrante("Franco");
		grupo1.mostrar();
		
		grupo1.vaciar();
		grupo1.mostrar();


	}
	
	public boolean fueAgregado(Grupo grupo, String nombreIntegrante) {
		boolean fueAgregado = false;
		if(grupo.buscarIntegrante(nombreIntegrante) == nombreIntegrante) {
			fueAgregado = true;
		}
		return fueAgregado;
		
	}

}
