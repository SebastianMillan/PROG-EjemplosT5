package ejemploLambda3;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		//Con lambda
		List<String> lista = new ArrayList<String>();
		lista.add("Primera palabra");
		lista.add("Segunda palabra");
		lista.add("Tercera palabra");
		lista.add("Última palabra");
		System.out.println("Mostrar todos los elementos del array con lambda:");
		lista.forEach(n -> System.out.println(n));
		
		//Sin lambda
		/*
		List<String> lista = new ArrayList<String>();
		lista.add("Primera palabra");
		lista.add("Segunda palabra");
		lista.add("Tercera palabra");
		lista.add("Última palabra");
		System.out.println("Mostrar todos los elementos del array con lambda:");
		for(String s : lista) {
			System.out.println(s);
		}
		*/
	}

}
