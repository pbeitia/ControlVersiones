import java.util.Scanner;

/**
 * Esta clase pertenece a la operacion resta de la calculadora
 * @author Jaime Hebrero
 *@version 2.0
 *@since 24/02/2021
 */


public class Resta extends Principal {
	
	static Scanner leer = new Scanner(System.in);
	
	/**
	 * M�todo para restar 2 n�meros reales, tiene 2 parametros de entrada y uno de salida (la soluci�n).
	 * @param num1 Primer parametro para operar la resta.
	 * @param num2 Segundo parametro para operar la resta.
	 * @param resultado Resultado de la resta entre los 2 par�metros.
	 * @return Devuelve resultado.
	 */
	
	public static double restaTipoUno(){
		double resultado = 0;
		System.out.println("Introduce el primer n�mero: ");
		double num1 = leer.nextDouble();
		System.out.println("Introduce el segundo n�mero: ");
		double num2 = leer.nextDouble();
		resultado = num1 - num2;
		
		return resultado;
	}
	/**
	 * M�todo para restar 2 n�meros enteros, tiene 2 parametros de entrada y uno de salida (la soluci�n).
	 * @param num1 Primer parametro para operar la resta.
	 * @param num2 Segundo parametro para operar la resta.
	 * @param resultado Resultado de la resta entre los 2 par�metros.
	 * @return Devuelve resultado.
	 */
		
	public static int restaTipoDos(){
		int resultado= 0;
		System.out.println("Introduce el primer n�mero: ");
		int num1 = leer.nextInt();
		System.out.println("Introduce el segundo n�mero: ");
		int num2 = leer.nextInt();
		resultado = num1 - num2;
		return resultado;
	}
			
	/**
	 * M�todo para restar 3 n�meros enteros, tiene 3 parametros de entrada y uno de salida (la soluci�n).
	 * @param num1 Primer parametro para operar la resta.
	 * @param num2 Segundo parametro para operar la resta.
	 * @param num3 Tercer parametro para operar en la resta.
	 * @param resultado Resultado de la resta entre los 2 par�metros.
	 * @return Devuelve resultado.
	 */
		
	public static double restaTipoTres(){
		double resultado = 0;
		System.out.println("Introduce el primer n�mero: ");
		double num1 = leer.nextDouble();
		System.out.println("Introduce el segundo n�mero: ");
		double num2 = leer.nextDouble();
		System.out.println("Introduce el tercer n�mero: ");
		double num3 = leer.nextDouble();
		resultado = num1 - num2 - num3;
		return resultado;
	}
	/**
	 * M�todo para acumular un numero que escribamos. Tiene un parametro de entrada y un parametro acumulador al que se le suma el parametro de entrada.
	 * @param num parametro de entrada.
	 * @param acumulador parametro donde se van restando los numeros ingresados.
	 * @return Devuelve resultado.
	 */
	public static double restaTipoCuatro(){
		double acumulador = 0;
		System.out.println("Introduce un n�mero para sumarlo al acumulador: ");
		double num = leer.nextDouble();
		acumulador = acumulador - num;
		return acumulador;
	}
	/**
	 *  Casos especiales:
	 *  <ul>
	 *  	<li> Si se resta un n�mero negativo este se suma.
	 *  	<li> si se resta 0 no cambia nada.
	 *  <ul>
	 */
}
