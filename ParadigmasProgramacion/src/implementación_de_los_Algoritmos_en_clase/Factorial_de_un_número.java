/**
 * 
 */
package implementación_de_los_Algoritmos_en_clase;

/**
 * 
 */
public class Factorial_de_un_número {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("El Factorial de 10 es: " + factorial(10));
	}
	
	public static int factorial(int n) {
		if (n==0 || n==1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
}
