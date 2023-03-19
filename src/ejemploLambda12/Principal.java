package ejemploLambda12;

import java.util.function.Predicate;

public class Principal {

	public static void main(String[] args) {

		double notaMedProgr=5, notaMedBasDat=6.5, anioMatr=2019, anioGrad=2021;
		String nombre1="Luismi";
		Predicate<Double> anioMatrMax = a -> a>7;
		Predicate<Double> anioMatrMin = b -> b>9;

		
		System.out.println("Daremos 100 euros a quién cumpla alguna de las dos condiciónes");
		
		System.out.println(nombre1+" se matriculó en "+anioMatr);
		System.out.println(nombre1+" se graduó en "+anioGrad);
		System.out.println(nombre1+" tiene un "+notaMedProgr+" en programación");
		System.out.println(nombre1+" tiene un "+notaMedBasDat+" en base de datos");
		

		
		
	}

}
