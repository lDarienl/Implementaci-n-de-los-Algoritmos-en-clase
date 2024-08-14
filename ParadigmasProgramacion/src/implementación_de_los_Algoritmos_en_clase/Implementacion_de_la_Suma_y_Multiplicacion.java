/**
 * 
 */
package implementación_de_los_Algoritmos_en_clase;

/**
 * 
 */
public class Implementacion_de_la_Suma_y_Multiplicacion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Suma de 3 y 4: " + suma(3, 4));
        System.out.println("Multiplicación de 3 y 4: " + multiplicacion(3, 4));
	}

	    public static int sucesor(int n) {
	        return n + 1;
	    }

	    public static int suma(int a, int b) {
	        if (b == 0) {
	            return a;
	        } else {
	            return suma(sucesor(a), b - 1);
	        }
	    }

	    public static int multiplicacion(int a, int b) {
	        if (b == 0) {
	            return 0;
	        } else {
	            return suma(a, multiplicacion(a, b - 1));
	        }
	    }
}
