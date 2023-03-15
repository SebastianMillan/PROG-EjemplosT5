package ejemploLambda7;

public class Principal {
	public static void main(String[] args) {
		
		double num1=10, num2=5;
		IOperacion ioSuma = (a,b) -> a+b;
		IOperacion ioResta = (a,b) -> a-b;
		IOperacion ioMult = (a,b) -> a*b;
		IOperacion ioDiv = (a,b) -> a/b;

		System.out.println(ioSuma.op(num1, num2));
		System.out.println(ioResta.op(num1, num2));
		System.out.println(ioMult.op(num1, num2));
		System.out.println(ioDiv.op(num1, num2));
		
		//RESULTADO
		//15
		//5
		//50
		//2	
	}
}
