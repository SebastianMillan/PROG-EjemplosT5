package ejemploSet;

import java.util.HashSet;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {

		Set<Alumno> lista= new HashSet<Alumno>();
		Alumno a1= new Alumno("Sebastián",22,8);
		lista.add(a1);
		System.out.println(lista);
		lista.add(new Alumno("Fernando",65,9));
		System.out.println(lista);
		
	}

}
