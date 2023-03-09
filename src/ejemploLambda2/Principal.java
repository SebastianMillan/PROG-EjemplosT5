package ejemploLambda2;

import java.util.function.Predicate;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Predicate<String> sizeOf =  s -> s.length()>10;
		//System.out.println(sizeOf.test("PalabraAleatoria"));
		
		Predicate<Integer> suma = z -> z + 2 >20;
		Predicate<Integer> division = Predicate.isEqual(20);
		//El predicate de arriba es igual a 
		//Predicate<Integer> division = z -> Objects.equals(z, suma);
		//El test devuelve un valor booleano, en este caso al test le pasamos valor de z como parámetro y él nos 
		//devuelve true o false en función de como sea la expresión lambda.
		System.out.println("Boolean suma test:"+suma.test(3456));
		//Con el negate devuelve la negación del boolean resultante
		System.out.println("Boolean suma negate test:"+suma.negate().test(3456));
		//Prueba con los test del predicate division que tiene isEquals
		System.out.println("Boolean division equals 20 con test 20:"+division.test(20));
		System.out.println("Boolean division equals 20 con test 21:"+division.test(21));



	}

}
