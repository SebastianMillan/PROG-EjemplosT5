package ejemploLambda11;

import java.util.function.Predicate;

public class Principal {

	public static void main(String[] args) {

		int edad1=45, edad2=22, topeMin=18, topeMax=35;
		String nombre1="Pepe", nombre2="Manolo";
		Predicate<Integer> edadMin = a -> a>topeMin;
		Predicate<Integer> edadMax = b -> b<topeMax;
		
		System.out.println(nombre1+" tiene "+edad1+" años");
		System.out.println(nombre2+" tiene "+edad2+" años");
		System.out.println("¿"+nombre1+" es mayor de "+topeMin+" años? - "+edadMin.test(edad1));
		System.out.println("¿"+nombre2+" es mayor de "+topeMin+" años? - "+edadMin.test(edad2));
		System.out.println("¿"+nombre1+" es menor de "+topeMax+" años? - "+edadMax.test(edad1));
		System.out.println("¿"+nombre2+" es menor de "+topeMax+" años? - "+edadMax.test(edad2));
		System.out.println("¿"+nombre1+" cumple ambas condiciónes para poder entrar? - "+edadMin.and(edadMax).test(edad1));
		System.out.println("¿"+nombre2+" cumple ambas condiciónes para poder entrar? - "+edadMin.and(edadMax).test(edad2));
		
		//Pepe tiene 45 años
		//Manolo tiene 22 años
		//¿Pepe es mayor de 18 años? - true
		//¿Manolo es mayor de 18 años? - true
		//¿Pepe es menor de 35 años? - false
		//¿Manolo es menor de 35 años? - true
		//¿Pepe cumple ambas condiciónes para poder entrar? - false
		//¿Manolo cumple ambas condiciónes para poder entrar? - true
	}

}
