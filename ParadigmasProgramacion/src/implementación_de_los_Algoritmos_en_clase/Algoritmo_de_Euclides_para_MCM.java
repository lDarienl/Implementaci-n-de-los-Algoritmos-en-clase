/**
 * 
 */
package implementación_de_los_Algoritmos_en_clase;

/**
 * 
 */
public class Algoritmo_de_Euclides_para_MCM {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 12, num2 = 20;
		System.out.println("El MCM es: " + mcm(num1, num2));
	}

	public static int mcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	
	public static int mcm(int a, int b) {
		if (a == 0 || b == 0) {
			return 0;
		}
		return Math.abs(a*b) / mcd(a, b);
	}
}
