package ejemploLambda10;

import java.util.function.BiPredicate;

public class Principal {

	public static void main(String[] args) {

		String nombre1="Juan", nombre2="Antonio";
		BiPredicate<String, String> esIgual = (a,b) -> a.equalsIgnoreCase(b);
		
		System.out.println("¿Es "+nombre1+" igual a "+nombre2+"? - "+esIgual.test(nombre1, nombre2));
		System.out.println("¿Es "+nombre2+" igual a "+nombre2+"? - "+esIgual.test(nombre2, nombre2));
		System.out.println(nombre2+" no es igual a "+nombre1+" - "+esIgual.negate().test(nombre2, nombre1));
		
		//¿Es Juán igual a Antonio? - false
		//¿Es Antonio igual a Antonio? - true
		//Antonio no es igual a Juan - true
	}
}
