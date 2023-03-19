package ejemploLambda13;

import java.util.function.Predicate;

public class Principal {

	public static void main(String[] args) {

		Alumno a1= new Alumno(1, "Sebastián", true);
		Alumno a2= new Alumno(2, "Pepito", false);
		Predicate<Alumno> comprobarAlumIgual = Predicate.isEqual(a1);
		
		System.out.println(a2.getNombre()+" es igual a "+a1.getNombre()+" - "+comprobarAlumIgual.test(a2));
		System.out.println(a1.getNombre()+" es igual a "+a1.getNombre()+" - "+comprobarAlumIgual.test(a1));
		
		//Pepito es igual a Sebastián - false
		//Sebastián es igual a Sebastián - true
	}

}
