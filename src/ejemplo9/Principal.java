package ejemplo9;

import java.util.function.Predicate;

public class Principal {

	public static void main(String[] args) {

		int num=4;
		Predicate<Integer> numPosit = a -> a>=0;
		Predicate<Integer> numNeg = a -> a<0;
		
		System.out.println("¿El número es positivo? - "+numPosit.test(num));
		System.out.println("¿El número es negativo? - "+numNeg.test(num));
		//¿El número es positivo? - true
		//¿El número es negativo? - false

	}

}
