package ejemploLambda;

import java.util.function.Predicate;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//EJEMPLO SIMPLE PREDICATE
		// Creating predicate
        //Predicate<Integer> lesserthan = i -> (i < 18); 
  
        // Calling Predicate method
        //System.out.println(lesserthan.test(20));
        
        
        
		//EJEMPLO PREDICATE CHAINING
        Predicate<Integer> greaterThanTen = (i) -> i > 10;
        
        // Creating predicate
        Predicate<Integer> lowerThanTwenty = (i) -> i < 20; 
        boolean result = greaterThanTen.and(lowerThanTwenty).test(15);
        System.out.println(result);
  
        // Calling Predicate method
        boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15);
        System.out.println(result2);
	}

}
