package ejemploLambdaExpo;

import java.util.ArrayList;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Oficina of = new Oficina(new ArrayList<Empleado>());
		String dniSelec;
		int opcion=0, mayorA=60;
		double horasTrabNuevas=0.0, precioHora=0.0;
		
		
		System.out.println("----------------------------------------------");
		System.out.println("BIENVENIDO AL PROGRAMA DE GESTIÓN DE EMPLEADOS");
		System.out.println("----------------------------------------------");
		of.cargarLista();
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
					of.imprimirLista();
					break;
				case 2:
					break;
				case 3:
					System.out.println("Indique el dni del empleado que desea eliminar");
					dniSelec=Leer.dato();
					of.borrar(of.findByDNIV2(dniSelec));
					break;
				case 4:
					System.out.println("Indique el dni del empleado que desea editar sus horas trabajadas");
					dniSelec=Leer.dato();
					System.out.println("Indique las nuevas horas trabajadas para incluirselas a dicho trabajador");
					horasTrabNuevas=Leer.datoDouble();
					of.editHoras(of.findByDNIV1(dniSelec), horasTrabNuevas);
					break;
				case 5:
					System.out.println("Indique el dni del empleado para mostrar su sueldo");
					dniSelec=Leer.dato();
					System.out.println("Indique a cuánto se paga en euros la hora:");
					precioHora=Leer.datoDouble();
					System.out.printf("Sueldo: %.2f€\n", of.calcularSueldoUnTrabajador(of.findByDNIV1(dniSelec), precioHora));
					break;
				case 6:
					System.out.println("Indique el dni del empleado para comprobar si es mayor a"+mayorA+" años");
					dniSelec=Leer.dato();
					of.imprimirFelicitacionEdad(of.comprobarMayoriaEdad(of.findByDNIV2(dniSelec), mayorA));
					break;
				case 7:
					of.ordenarPorNombre();
					of.imprimirLista();
					break;
				case 8:
					break;
				case 9:
					break;
				case 10:
					break;
				case 11:
					System.out.println("Indique a cuánto se paga en euros la hora:");
					precioHora=Leer.datoDouble();
					System.out.printf("La oficina gasta en sueldos %.2f€\n", of.calcularGastosSueldos(precioHora));
					break;
				case 12:
					System.out.printf("La media de horas trabajadas de todos los empleados es %.2f\n", of.calcularMediaHorasTrab());
					
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
