package ejemploLambda6;

import java.util.function.Predicate;

public class Principal {

	public static void main(String[] args) {

		String n1="Sebastián", n2="Fernando", n3="Sebastián";
		Integer m1=15, m2=50;
		Predicate<String> p1 = z -> z.equalsIgnoreCase(n1);
		
		System.out.println(n1+" es igual a "+n3+": "+p1.test(n3));
		System.out.println(n1+" es igual a "+n2+": "+p1.test(n2));
		
		Predicate<Integer> p2 = z -> z/2>10;
		System.out.println("La operación con z/2>10 siendo z="+m1+" es: "+p2.test(m1));
		System.out.println("La operación con z/2>10 siendo z="+m2+" es: "+p2.test(m2));
		System.out.println("La operación con z/2>10 siendo z="+m2+" no (usando la negación) es: "+p2.negate().test(m2));

		
	}
}


