package trabajopractico_1.ejercicio_1;

public class test {

	public static void main(String[] args) {
		System.out.println("Inicio ejercicio 1");
		Grupo grupo_a = new Grupo("grupo_a");
		

		System.out.println("AGREGAR INTEGRANTES");
		grupo_a.agregarIntegrantes("Juan");
		grupo_a.agregarIntegrantes("Pedro");
		grupo_a.agregarIntegrantes("Jose"); // Repetido -> no se agrega
		grupo_a.agregarIntegrantes("Jose");
		grupo_a.agregarIntegrantes("Integrante Ficticio");
		grupo_a.mostrar();
		
		// REMOVER INTEGRANTE FICTICIO:
		grupo_a.removerIntegrante("Integrante Ficticio");
		grupo_a.removerIntegrante("Integrante Ficticio");
		grupo_a.mostrar();
		
		//Vaciar Y Volver a mostrar
		grupo_a.vaciar();
		grupo_a.mostrar();
	}
}
