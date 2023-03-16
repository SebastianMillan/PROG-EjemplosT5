package ejemploLambdaExpo;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion=0;
		
		
		do {
			System.out.println("1 - Mostrar empleados");
			System.out.println("2 - Añadir empleado");
			System.out.println("3 - Eliminar empleado");
			System.out.println("4 - Editar horas trabajadas de un empleado");
			System.out.println("5 - Calcular sueldo un empleado");
			System.out.println("6 - Comprobar si empleado es mayor de 60");
			System.out.println("7 - Ordenar por nombre la lista");
			System.out.println("8 - Mostrar los gerentes");
			System.out.println("9 - Empleado con mayor edad");
			System.out.println("10 - Empleado con menor edad");
			System.out.println("11 - Calcular gasto en sueldos de la oficina");
			System.out.println("12 - Calcular media de horas trabajadas");
			System.out.println("0 - Salir");
			opcion=Leer.datoInt();
			switch(opcion) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					break;
				case 8:
					break;
				case 9:
					break;
				case 10:
					break;
				case 11:
					break;
				case 12:
					break;
				case 0:
					System.out.println("Saliendo del programa");
					break;
				default:
					System.out.println("Opción del menú no encontrada");
					break;
			}
		}while(opcion!=0);
		
		System.out.println("--------------------------------");
		System.out.println("Gracias por utilizar el programa");
	}
}
