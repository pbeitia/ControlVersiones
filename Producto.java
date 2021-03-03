
/**
 * 
 * @author alberto
 * @version 2.0
 * @since 24/02/21
 *
 */
import java.util.Scanner;
import java.lang.Math;


/**
 * <h1>Clase que devuelve el resultado de multiplicar distintos números.</h1>
 * @param multiplo es el primer número que vamos a multiplicar. 
 * @param multiplo2 es el segundo. Al ser una multiplicación, el orden no importa.
 * @param resultado es la solución de la operación.
 * @return otorga la solución recién obtenida
 */
public class Producto extends Principal {
	
	
	/**
	 * Creo un escáner para introducir el texto.
	 */
	static Scanner productoIntroduce = new Scanner(System.in);
	
	
	/**
	 * <h1>Casos especiales:</h1>
 *  <ul>
 *     <li>Si uno de los parámetros es cero, el resultado será cero.
 *     <li>Si la multiplicación resulta demasiado alta, informaremos al usuario.
 *     <li>Si se multiplicaran dos números negativos, saldrían  positivos
 *     <li>
 *  </ul>
	 * <h1>Método diseñado para multiplicar dos números reales.</h1>
	 * @param multiplo es el primer número que vamos a multiplicar. 
	 * @param multiplo2 es el segundo. Al ser una multiplicación, el orden no importa.
	 * @param resultado es la solución de la operación.
	 * @return otorga la solución recién obtenida
	 */
	public static double ProductoVariedad1() {
		
		System.out.println("Introduce el primer múltiplo:");
		double multiplo = productoIntroduce.nextDouble();
		System.out.println("Introduce el segundo múltiplo");
		double multiplo2 = productoIntroduce.nextDouble();
		double resultado = multiplo * multiplo2;
		System.out.print("El resultado es ");
		return resultado;
	}
	
	/**
	 *  * <h1>Casos especiales:</h1>
 *  <ul>
 *     <li>Si uno de los parámetros es cero, el resultado será cero.
 *     <li>Si la multiplicación resulta demasiado alta, informaremos al usuario.
 *     <li>Si se multiplicaran dos números negativos, saldrían  positivos
 *     <li>
 *  </ul>
	 * <h1>Método diseñado para multiplicar dos números enteros.</h1>
	 * @param multiplo es el primer número que vamos a multiplicar. 
	 * @param multiplo2 es el segundo. Al ser una multiplicación, el orden no importa.
	 * @param resultado es la solución de la operación.
	 * @return otorga la solución recién obtenida
	 */
    public static double ProductoVariedad2() {
    	
    	System.out.println("Introduce el primer múltiplo:");
		int multiplo = productoIntroduce.nextInt();
		System.out.println("Introduce el segundo múltiplo");
		int multiplo2 = productoIntroduce.nextInt();
		int resultado = multiplo * multiplo2;
		System.out.print("El resultado es ");
		return resultado;
}
    
	/**
	 *  * <h1>Casos especiales:</h1>
 *  <ul>
 *     <li>Si uno de los parámetros es cero, el resultado será cero.
 *     <li>Si la multiplicación resulta demasiado alta, informaremos al usuario.
 *     <li>Si se multiplicaran tres números negativos, saldrían  negativos
 *     <li>
 *  </ul>
	 * <h1>Método diseñado para multiplicar tres números reales.</h1>
	 * @param multiplo es el primer número que vamos a multiplicar. 
	 * @param multiplo2 es el segundo. Al ser una multiplicación, el orden no importa.
	 * @param resultado es la solución de la operación.
	 * @return otorga la solución recién obtenida
	 */
    public static double ProductoVariedad3() {
    
    	System.out.println("Introduce el primer múltiplo:");
		double multiplo = productoIntroduce.nextDouble();
		System.out.println("Introduce el segundo múltiplo");
		double multiplo2 = productoIntroduce.nextDouble();
                System.out.println("Introduce el tercer múltiplo");
		double multiplo3 = productoIntroduce.nextDouble();
		double resultado = multiplo * multiplo2 * multiplo3;
		System.out.print("El resultado es ");
		return resultado;
	}
    
	/**
	 *  * <h1>Casos especiales:</h1>
 *  <ul>
 *     <li>Si la base es cero, el resultado será cero.
 *     <li>Si la multiplicación resulta demasiado alta, informaremos al usuario.
 *     <li>Si el exponente es cero, el resultado será uno.
 *     <li>Si el exponente es un medio, se calculará la raíz cuadrada de la base.
 *  </ul>
	 * <h1>Método diseñado para calcular la potencia de un número real elevado a otro.</h1>
	 * @param multiplo es el primer número que vamos a multiplicar. 
	 * @param multiplo2 es el segundo. Al ser una multiplicación, el orden no importa.
	 * @param resultado es la solución de la operación.
	 * @return otorga la solución recién obtenida
	 */
    public static double ProductoVariedad4() {
    
    	System.out.println("Introduce la base de la potencia:");
		double base = productoIntroduce.nextDouble();
		System.out.println("Introduce el exponente de la potencia;");
		double exponente = productoIntroduce.nextDouble();
		double resultado = (Math.pow(base, exponente));
		System.out.print("El resultado es ");
		return resultado;
	}
}