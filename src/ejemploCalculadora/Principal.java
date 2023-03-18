package ejemploCalculadora;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Principal {

	public static void main(String[] args) {
		
		String nombre="Alex", apellido="Luque";
		
		BiConsumer <String, String> imprime = (s1, s2) -> {
			System.out.println(nombre+" "+apellido);
		};
		
		imprime.accept(nombre, apellido);
		
		Supplier <String> palabraNueva = () -> "Alejandro";
		System.out.println(palabraNueva.get());
		
		BiPredicate <String, Integer> palabraIgual = (s, n) -> s.length()==n;
		System.out.println(palabraIgual.test(apellido, 5));
	}

}
