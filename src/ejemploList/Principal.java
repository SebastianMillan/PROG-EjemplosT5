package ejemploList;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		Alumno a= new Alumno ("Sebastián",22,8);
		
		//Las colecciones deben de ser de objetos
		List<Alumno> listado= new ArrayList<Alumno>();
		List<String> listado2= new ArrayList<String>();
		List<Integer> listado3= new ArrayList<Integer>();
		
		listado.add(new Alumno("Fernando",20,9));
		listado2.add("Hola");
		listado3.add(123523);
		listado3.add(20);
		System.out.println(listado);
		//El add no machaca sino que mueve el objeto que hay en ese indice a la derecha
		listado.add(0,a);
		System.out.println(listado);
		System.out.println(listado2);
		System.out.println(listado3);
		System.out.println("Tamaño del listado: "+listado.size());
		System.out.println("Objeto elegido: "+listado.get(1));
		if(listado3.isEmpty()) {
			System.out.println("Listado3 está vacio");
		}else {
			System.out.println("Listado3 no está vacio");
		}
		
	}

}
