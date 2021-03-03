import java.util.Scanner;

/**
 * Esta clase pertenece a la operaci�n suma de la calculadora
 * @author Grupo 
 * @version 2.0
 * @since 22/02/2021
 */
public class Suma extends Principal{
	static Scanner leer = new Scanner(System.in);
	
	/**
	 * M�todo que suma dos n�meros reales, con dos par�metros de entrada (num1 y num2) y un par�metro de salida (resultado).
	 * 
	 *Casos Especiales:
	 *
	 * 	<ul>
	 *		<li>Si alg�n n�mero es negativo, la suma se realiza igual.
	 *		<li>Si alg�n n�mero es 0, la suma se realiza de la misma forma.
	 *		<li>Si alg�n n�mero es decimal, la suma se realiza de la misma forma.
	 *	</ul>
	 *
	 * @param num1 Primer n�mero de tipo real para operar en la suma
	 * @param num2 Segundo n�mero de tipo real  para operar en la suma
	 * @param resultado Resultado final de la suma de los dos n�meros
	 * @return Devuelve el resultado
	 * 
	 */
	public static double sumaTipoUno() {
		double resultado = 0;
		System.out.println("Introduce el primer n�mero: ");
		double num1 = leer.nextDouble();
		System.out.println("Introduce el segundo n�mero: ");
		double num2 = leer.nextDouble();
		resultado = num1 + num2;
		return resultado;
	}
	
	/**
	 * M�todo que suma dos n�meros enteros, con dos par�metros de entrada (num1 y num2) y un par�metro de salida (resultado).
	 * 
	 *Casos Especiales:
	 *
	 * 	<ul>
	 *		<li>Si alg�n n�mero es negativo, la suma se realiza igual.
	 *		<li>Si alg�n n�mero es 0, la suma se realiza de la misma forma.
	 *		<li>Si alg�n n�mero es decimal, la suma no se realizar� porque es con n�meros enteros.
	 *	</ul>
	 *
	 * @param num1 Primer n�mero de tipo entero para operar en la suma
	 * @param num2 Segundo n�mero de tipo entero para operar en la suma
	 * @param resultado Resultado final de la suma de los dos n�meros
	 * @return
	 */
	public static int sumaTipoDos() {
		System.out.println("Introduce el primer n�mero: ");
		int num1 = leer.nextInt();
		System.out.println("Introduce el segundo n�mero: ");
		int num2 = leer.nextInt();
		int resultado = num1 + num2;
		return resultado;
	}
	
	/**
	 * M�todo que suma 3 n�meros reales, con 3 par�metros de entrada (num1, num2, num3) y un par�metro de salida (resultado).
	 * 
	 *Casos Especiales:
	 *
	 * 	<ul>
	 *		<li>Si alg�n n�mero es negativo, la suma se realiza igual.
	 *		<li>Si alg�n n�mero es 0, la suma se realiza de la misma forma.
	 *		<li>Si alg�n n�mero es decimal, la suma se realizar� de la misma forma.
	 *	</ul>
	 *
	 * @param num1 Primer n�mero real para operar en la suma
	 * @param num2 Segundo n�mero real  para operar en la suma
	 * @param num3 Tercer n�mero real para operar en la suma
	 * @param resultado Variable que almacena el resultado de la suma
	 * @return
	 */
	public static double sumaTipoTres() {
		System.out.println("Introduce el primer n�mero: ");
		double num1 = leer.nextDouble();
		System.out.println("Introduce el segundo n�mero: ");
		double num2 = leer.nextDouble();
		System.out.println("Introduce el tercer n�mero: ");
		double num3 = leer.nextDouble();
		double resultado = num1 + num2 + num3;
		return resultado;
	}
	
	/**
	 * M�todo que acumula el valor del n�mero que escribas. Tiene 1 par�metro de entrada (num) y un acumulador que almacena el valor.
	 * 
	 *Casos Especiales:
	 *
	 * 	<ul>
	 *		<li>Si alg�n n�mero es negativo, se sumar�a al acumulador.
	 *		<li>Si alg�n n�mero es 0, se sumar�a al acumulador.
	 *		<li>Si alg�n n�mero es decimal, se sumar�a al acumulador.
	 *	</ul>
	 *
	 * @param num Número que añade el usuario y se acumula.
	 * @param acumulador Variable encargada de acumular los números introducidos.
	 * @return Devuelve el acumulador
	 */
	public static double sumaTipoCuatro() {
		double acumulador = 0;
		System.out.println("Introduce un n�mero para sumarlo al acumulador: ");
		double num = leer.nextDouble();
		acumulador = acumulador + num;
		return acumulador;
	}

}
